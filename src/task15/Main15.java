package task15;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        /*15. Даны целые числа  . Получить целочисленную матрицу  b каждый элемент,
        которой определяется  по следующей формуле  , i, j=0,1,2.  (ЕСТЬ ФОРМУЛЫ! НЕ СКОПИРОВАЛИСЬ)*/

        int[] a = {1, 2, 3};
        int[][] b = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[i] - 3 * a[j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
