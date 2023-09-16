package task10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        /*10.	 Присвоить элементам массива уникальные случайные значения,
        то есть требуется заполнить массив случайными числами,
        но при этом каждое число в массиве должно встречаться не более одного раза.
        При проектировании такого алгоритма сразу следует выделить особую ситуацию –
        если размер массива будет больше, чем число различных случайных чисел,
        генерируемых генератором ПСЧ, то решить задачу будет невозможно.*/

        int size = 10;
        int[] uniqueArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(100);
            } while (contains(uniqueArray, i, randomNumber));
            uniqueArray[i] = randomNumber;
        }
        for (int value : uniqueArray) {
            System.out.println(value);
        }
    }

    private static boolean contains(int[] array, int position, int number) {
        for (int i = 0; i < position; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
