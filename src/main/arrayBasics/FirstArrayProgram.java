package arrayBasics;

public class FirstArrayProgram {
    public static void main(String[] args) {
       int[] ageOfStudents = new int[5];//1. Array Declaration
        ageOfStudents[0] = 12;// 2. Array initialization
        ageOfStudents[1] = 11;
        ageOfStudents[2] = 13;
        ageOfStudents[3] = 14;
        ageOfStudents[4] = 11;

//        Read Values of Array
        for (int ageOfStudent : ageOfStudents) {
            System.out.print(ageOfStudent+"\t");
        }
    }
}
