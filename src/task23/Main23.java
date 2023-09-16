package task23;

import java.util.Arrays;

public class Main23 {
    public static void main(String[] args) {
        /*23.	Объединить два массива в третий массив:*/

        int[] firstArray = {5,2,7,2,8};
        int[] secondArray = {4,9,3,7,1};
        int thirdArrayLength = firstArray.length+secondArray.length;

        int[] resultArray = Arrays.copyOf(firstArray, thirdArrayLength);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            System.out.print(" ");
        }

    }
}
