package interviewQuestions;

public class staticKeywordInJava {
    String studentName;
    int studentAge;
    static String schoolName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        staticKeywordInJava.schoolName = schoolName;
    }

    public static void main(String[] args) {
        setSchoolName("P.V.MODI");

        staticKeywordInJava obj1 = new staticKeywordInJava();
        obj1.setStudentName("Adam");
        obj1.setStudentAge(14);

        staticKeywordInJava obj2 = new staticKeywordInJava();
        obj2.setStudentName("Eve");
        obj2.setStudentAge(12);

        System.out.println("---Student 1---");
        System.out.println("School Name : " + obj1.getSchoolName());
        System.out.println("Student Name : " + obj1.getStudentName());
        System.out.println("Student Age : " + obj1.getStudentAge());

        System.out.println("---Student 2---");
        System.out.println("School Name : " + obj2.getSchoolName());
        System.out.println("Student Name : " + obj2.getStudentName());
        System.out.println("Student Age : " + obj2.getStudentAge());
    }
}
