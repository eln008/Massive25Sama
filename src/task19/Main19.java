package task19;

import java.util.Arrays;
import java.util.Random;

public class Main19 {
    public static void main(String[] args) {
        /*19.	   Напишите код, который создает 20 случайных чисел диапазона
1	- 99. Следует вывести в консоль только те числа которые делятся на 1-ое рандомное число без остатка.*/

        Random random = new Random();
        int randomNumber = random.nextInt(99) + 1;
        int[] randomNumbers = new int[20];
        int[] newArr = new int[randomNumbers.length];
        int count = 0;

        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = random.nextInt(99) + 1;
        }
        int firstNum = randomNumbers[0];
        System.out.println("Первое число в массиве "+firstNum);
        System.out.println("Все числа в массиве "+Arrays.toString(randomNumbers));
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i] % firstNum == 0){
                newArr[count++]=randomNumbers[i];
                System.out.println("Числа которые делятся на "+firstNum+" это "+Arrays.toString(newArr));
            }
        }
    }
}

