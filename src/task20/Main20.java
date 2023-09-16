package task20;

import java.util.Random;

public class Main20 {
    public static void main(String[] args) {
        /*20.	Напишите код, который генерирует 20 рандомных целых чисел
   из диапазона -50 до +50, и определяет наименьшее число и
   наибольшее число. Нельзя использовать массив*/
        Random random = new Random();
        int min = 50;
        int max = -51;
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(101)-50;
            System.out.print(num);
            System.out.println(" ");

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);


    }
}
