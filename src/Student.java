public class Student
{
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentGrade;

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void studentDetails()
    {
        System.out.println("Student Id : "+getStudentId());
        System.out.println("Student Name : "+getStudentName());
        System.out.println("Student Age : "+getStudentAge());
        System.out.println("Student Grade : "+getStudentGrade());
    }
}

class StudentMain
{
    public static void main(String[] args) {

        Student s1=new Student();
        s1.setStudentAge(21);
        s1.setStudentId(1);
        s1.setStudentName("Jenisha");
        s1.setStudentGrade("A+");

        s1.studentDetails();

        System.out.println("========");

        Student s2=new Student();
        s2.setStudentAge(22);
        s2.setStudentId(2);
        s2.setStudentName("Chandu");
        s2.setStudentGrade("A-");

        s2.studentDetails();

        System.out.println("========");

        Student s3=new Student();
        s3.setStudentAge(19);
        s3.setStudentId(37);
        s3.setStudentName("Deependra");
        s3.setStudentGrade("S");

        s3.studentDetails();
    }
}
