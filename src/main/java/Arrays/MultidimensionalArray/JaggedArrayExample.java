package Arrays.MultidimensionalArray;

public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] marks = new int[3][];

        marks[0] = new int[2];
        marks[1] = new int[3];
        marks[2] = new int[4];

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                marks[row][col] = (int) ((Math.random()) * 10);
                System.out.print(marks[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
