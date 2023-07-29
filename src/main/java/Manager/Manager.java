package DataBase;

public class Manager {
    private int studentId;
    private  int studentNo;
    private String studentName;
    private String studentLastName;
    private String StudentAddress;


    public Manager(int studentId, int studentNo, String studentName, String studentLastName, String studentAddress) {
        this.studentId = studentId;
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        StudentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "studentId=" + studentId +
                ", studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}

