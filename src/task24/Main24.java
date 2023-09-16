package task24;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        /*24.	 Найти минимальное значение в массиве.
Напишите класс, который заполняет случайными двузначными
числами массив, размер которого вводится с клавиатуры.
После заполнения класс должен вывести на экран значения
массива следующим образом:
● в первой строке - первую половину массива
● во второй строке - вторую половину массива*/


        int[] arr = {4, 3, 7, 9, 8, 2, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальлное значение в массиве: " + min);

        method();
    }

    public static void method(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int input = scan.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(input);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Первая половина массива:");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Вторая половина массива:");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
