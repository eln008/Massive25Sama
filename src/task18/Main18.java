package task18;

import java.util.Random;

public class Main18 {
    public static void main(String[] args) {
        /*18.	 Подсчитать количество простых чисел в двумерном массиве, состоящем из целых чисел, полученных случайным образом.*/

        Random random = new Random();
        int row = 4;
        int column = 4;
        int count = 0;
        int[][] randomArray = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                randomArray[i][j] = random.nextInt(100) + 1;

                if (isPrime(randomArray[i][j])) {
                    count++;
                }
            }
        }

        System.out.println("Количество простых чисел  " + count);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;

    }
}
