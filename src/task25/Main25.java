package task25;

import java.util.Arrays;

public class Main25 {
    public static void main(String[] args) {
        /*25. напишите программу для добавления нового элемента в массив*/

        int[] originalArray = {1, 2, 3, 4, 5};
        int newValue = 6;

        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);

        newArray[newArray.length - 1] = newValue;

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Массив после добавления элемента: " + Arrays.toString(newArray));

    }
}
