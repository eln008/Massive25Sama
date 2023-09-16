package task14;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        /*14.	 Дан двумерный массив, содержащий 5 строк и 2 столбца.
        Упорядочить массив по возрастанию элементов 2-го столбца.*/
        int[][] array = {
                {10, 20},
                {23, 12},
                {50, 60},
                {23, 80},
                {90, 100}
        };
        Arrays.sort(array, Comparator.comparingInt(arr -> arr[1]));

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);

        }
    }
}
