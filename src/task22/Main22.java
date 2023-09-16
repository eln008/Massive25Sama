package task22;

import java.util.Arrays;

public class Main22 {
    public static void main(String[] args) {
        /* 22.	Найти второй наибольший элемент в массиве*/
        int[] num = {2,4,3,6,15,5,9,21};

        Arrays.sort(num);
            int secondArray = num[num.length-2];
        System.out.println(secondArray);
    }
}
