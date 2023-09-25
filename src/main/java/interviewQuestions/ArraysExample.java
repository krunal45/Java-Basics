package interviewQuestions;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] studentNames = new String[5];
        studentNames[0] ="Akash";
        studentNames[1]="Bob";
        studentNames[2]="Chetan";
        studentNames[3]="Dhaval";
        studentNames[4]="Foram";

        String[][] studentDetails = new String[5][2];// 5 * 2 = 10
        studentDetails[0][0] = "Akash";
        studentDetails[0][1] = "01 Aug 1991";
        studentDetails[1][0] = "Bob";
        studentDetails[1][1] = "03 Sep 1992";
        studentDetails[2][0] = "Chetan";
        studentDetails[2][1] = "15 Oct 1993";
        studentDetails[3][0] = "Dhaval";
        studentDetails[3][1] = "21 Jan 1991";
        studentDetails[4][0] = "Foram";
        studentDetails[4][1] =  "13 Aug 1993";

        for (String[] studentDetail : studentDetails){
            System.out.println(Arrays.toString(studentDetail));
        }

        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
