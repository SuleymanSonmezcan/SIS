package DataBase;

public class Teacher {

    private String  name ;
    private String lastName;
    private int teacherNo;
    private String teacherPassword;
    private String branch;

    public Teacher(String name, String lastName, int teacherNo, String teacherPassword, String branch) {
        this.name = name;
        this.lastName = lastName;
        this.teacherNo = teacherNo;
        this.teacherPassword = teacherPassword;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teacherNo=" + teacherNo +
                ", teacherPassword='" + teacherPassword + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
