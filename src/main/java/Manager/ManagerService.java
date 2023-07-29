package DataBase;

import java.util.Scanner;
import java.util.List;

public class ManagerService {

    StudentRepository repository=new StudentRepository();

    Scanner input=new Scanner(System.in);
    ManagerRerository rerository=new ManagerRerository();

    //Tablo olusturma
    public void creatTable(){
        rerository.createTable();
    }

    //Ogrenci Kayit etme
    public void saveStudent(){
        System.out.println("Ad : ");
        String name=input.nextLine();
        System.out.println("SoyAd : ");
        String lastName=input.nextLine();
        System.out.println("OgrenciNo : ");
        int studentNo=input.nextInt();
        System.out.println("Ogrenci Adres : ");
        String address=input.nextLine();
        input.nextLine();
    }

    //tum Ogrencılerı goruntule
    public void getAllStudent(){
    rerository.findAll();
    }

}
