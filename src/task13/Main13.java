package task13;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {
        /*13.	 Дан двумерный массив, содержащий 3 строки и 4 столбца.
        Упорядочить массив по убыванию элементов 3-ей строки.*/
        int[][] array = {
                {5, 4, 7, 2},
                {1, 8, 6, 3},
                {10, 9, 12, 11}};
        int[] thirdRow = array[2];
        Arrays.sort(thirdRow);
        int rowCount = array.length;
        int columnCount = array[0].length;

        int[] sortedThirdRow = new int[columnCount];
        for (int i = 0; i < columnCount; i++) {
            sortedThirdRow[i] = thirdRow[columnCount - i - 1];
        }
        array[2] = sortedThirdRow;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
