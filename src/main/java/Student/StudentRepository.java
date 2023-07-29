package DataBase;
import java.sql.*;
public class StudentRepository {

    private Connection con;
    private Statement st;
    private PreparedStatement prst;

    /** Connection Method?*/
    private void getConnection(){
        try {
            this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/STD_DTBS", "dev_user", "password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /** Statement Method?*/
    private void getStatement(){
        try {
            this.st = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /** PreparedStatement Method?*/
    private void getPreparedStatement(String sql){

        try {
            this.prst = con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /** Creating Table*/
    //std_info (id/std_no,std_name,std_lastname,address,note1,note2,average);
    //
    //std_calendar = (exam date ,lesson_name);

    public  void crateTable() throws SQLException {
        getConnection();
        getStatement();
        try {
            st.execute("CREATE TABLE std_info(id int ,std_name varchar(50), std_lastname varchar(50),std_address varchar(50),stdNo int,note1 int,note2 int,average  float");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }



        }

    // ogrenci listeleme
    public void findAll(){
        getConnection();
        getStatement();
        String sql = "SELECT * FROM std_info";

        try{
            ResultSet resultSet=st.executeQuery(sql);
            System.out.printf("%-5s | %-12s | %-20s | %-20s | %-20s | %-6s | %-6s | %-8s\n", "İD","ÖĞRENCİ NO","İSİM","SOYİSİM","ADRES","1. NOT","2. NOT", "ORTALAMA");
            while(resultSet.next()){
                System.out.printf("%-5d | %-12d | %-20s | %-20s | %-20s | %-6d | %-6d | %-8d\n",
                resultSet.getInt("std_id"),
                resultSet.getInt("std_no"),
                resultSet.getString("std_name"),
                resultSet.getString("std_lastname"),
                resultSet.getString("address"),
                resultSet.getInt("note1"),
                resultSet.getInt("note2"),
                resultSet.getDouble("average")
            );
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }finally {
            try{
                st.close();
                con.close();
            }catch (SQLException e){
                System.err.println(e.getMessage());
            }
        }
    }

    //ogrenci silme
    public void studentDelete(int id){
        getConnection();
        String sql ="delete from  std_info where id=?";
        getPreparedStatement(sql);

        try{
            prst.setInt(1,id);
            int deleted = prst.executeUpdate();
            if(deleted >0){
                System.out.println("id : "+id+" olan kayıt silinmistir.");
            }else {
                System.out.println("id : "+id+" böyle bir kayıt bulunamamıstır.");
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }finally{
            try {
                prst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

    //list e ogrenci ekleme
    public void saveStudent(Student student){
        String sql= "insert into std_info(id,std_name ,std_lastname ,std_address ,stdNo int,note1 int,note2 int,average int ) values(?????????)";
        try {
            prst.setInt(1,student.getId());
            prst.setString(2,student.getStd_name());
            prst.setString(3,student.getStd_lastname());
            prst.setString(4,student.getStd_address());
            prst.setString(5,student.getStd_address());
            prst.setInt(6,student.getStdNo());
            prst.setInt(7,student.getNote1());
            prst.setInt(8,student.getNote2());
            prst.setDouble(9,student.getAverage());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    //Tablo olusturma
    public void createTable () {
        getConnection();
        getStatement();


}
}



