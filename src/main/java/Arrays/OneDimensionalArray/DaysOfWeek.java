package Arrays.OneDimensionalArray;

public class DaysOfWeek {
    public static void main(String[] args) {
//        Data Presentation 1
        String[][] daysOfWeek = new String[1][8];
//        Header Row|Header Column Data
        daysOfWeek[0][0] = "Day";
//Setting data
        daysOfWeek[0][1] = "SUN";
        daysOfWeek[0][2] = "MON";
        daysOfWeek[0][3] = "TUE";
        daysOfWeek[0][4] = "WED";
        daysOfWeek[0][5] = "THU";
        daysOfWeek[0][6] = "FRI";
        daysOfWeek[0][7] = "SAT";
        System.out.println("-- Data Presentation 1 --");
//        Print Data
        for (int row=0;row<1;row++){
            for (int column=0;column<8;column++){
                System.out.print(daysOfWeek[row][column]+"\t");
            }
            System.out.println();
        }

        //        Data Presentation 2
        String[][] daysOfWeek1 = new String[8][1];
//        Set Header Row|Header Column
        daysOfWeek1[0][0] = "Day";
        daysOfWeek1[1][0] = "SUN";
        daysOfWeek1[2][0] = "MON";
        daysOfWeek1[3][0] = "TUE";
        daysOfWeek1[4][0] = "WED";
        daysOfWeek1[5][0] = "THU";
        daysOfWeek1[6][0] = "FRI";
        daysOfWeek1[7][0] = "SAT";
        System.out.println("-- Data Presentation 2 --");
        for (int row=0;row<8;row++){
            for (int column=0;column<1;column++){
                System.out.println(daysOfWeek1[row][column]);
            }
        }



    }
}
