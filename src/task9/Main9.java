package task9;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        /*9.	 Составить программу для вычисления средних арифметических значений положительных
        элементов каждого столбца двумерного массива, содержащего 6 столбцов и три строки.
        При условии, что в каждом столбце есть хотя бы один положительный элемент.*/
        int[][] num = {{23, 4, 8, -4, 15, -4}, {-7, 8, 9, -10, 11, 12}, {1, 2, -3, 4, -5, 6}};
        int colomnAverage = num[0][0];
        int row = num.length;
        int column = num[0].length;

        double[] columnAverages = new double[column];

        for (int j = 0; j < column; j++) {
            int positiveCount = 0;
            int sum = 0;

            for (int i = 0; i < row; i++) {
                if (num[i][j] > 0) {
                    positiveCount++;
                    sum += num[i][j];
                }
            }
            if (positiveCount > 0) {
                columnAverages[j] = (double) sum / positiveCount;
            }
        }
        for (int j = 0; j < column; j++) {
            System.out.println("Среднее арифметическое для столбца " + j + ": " + columnAverages[j]);
        }
    }
}
