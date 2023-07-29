package DataBase;

public class StudentService {

    public static void findAll(){
        StudentRepository std = new StudentRepository();
        std.findAll();
    }
    public static void saveStudent(){
        StudentRepository std = new StudentRepository();
        std.saveStudent();
    }

    public static void deleteStudent(){
        StudentRepository std = new StudentRepository();
        std.deleteStudent();
    }

}
