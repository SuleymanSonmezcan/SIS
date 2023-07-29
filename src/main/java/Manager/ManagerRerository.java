package DataBase;


import java.sql.*;

public class ManagerRerository {



    //"jdbc:postgresql://localhost:5432/STD_DTBS", "dev_user", "password"
    private Connection con;
    private Statement st;
    private PreparedStatement prst;



    private void getConnection(){

        try {
            this.con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/STD_DTBS", "dev_user", "password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void  getStatment(){

        try {
            this.st=con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private  void  getPreparedStatement (String sql){

        try {
            this.prst=con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

//Tablo olusturma
    public void createTable(){
        getConnection();
        getStatment();


        try {
            st.execute("create table if not exists student(id serial,student_no int,name varchar(50),lastname varchar(50),student_address varchar(50))");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }


    //Tabloya ogrenci ekleme



    //Tum Kayıtları Listeleme





}
