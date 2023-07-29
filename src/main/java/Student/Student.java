package DataBase;

import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    //std_info (id/std_no,std_name,std_lastname,address,note1,note2,average);
    private int stdNo ;
    private int id;
    private String std_name;
    private String std_lastname;
    private String std_address;
    private int note1;
    private int note2;
    private double average;


    /** const*/
    public Student() {
    }

    /** param const*/

    public Student(int stdNo, int id, String std_name, String std_lastname, String std_address, int note1, int note2, double average) {
        this.stdNo = stdNo;
        this.id = id;
        this.std_name = std_name;
        this.std_lastname = std_lastname;
        this.std_address = std_address;
        this.note1 = note1;
        this.note2 = note2;
        this.average = average;
    }

    /** getter-setter*/
    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_lastname() {
        return std_lastname;
    }

    public void setStd_lastname(String std_lastname) {
        this.std_lastname = std_lastname;
    }

    public String getStd_address() {
        return std_address;
    }

    public void setStd_address(String std_address) {
        this.std_address = std_address;
    }

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    /** to string*/
    @Override
    public String toString() {
        return "Student{" +
                "stdNo=" + stdNo +
                ", id=" + id +
                ", std_name='" + std_name + '\'' +
                ", std_lastname='" + std_lastname + '\'' +
                ", std_address='" + std_address + '\'' +
                ", note1=" + note1 +
                ", note2=" + note2 +
                ", average=" + average +
                '}';
    }

}
