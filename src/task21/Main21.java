package task21;
import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        /*21.	Напишите код, который принимает с консоли для переменной X
целое положительное число, а затем дополнительно будет
спрашивать ещё числа, эти числа будут должны вычитаться из
переменной x, вы будете вводить числа до тех пор пока X не будет
отрицательным или равен 0.  используйте while loop
Напишите класс, который принимает с клавиатуры две
переменный это два числа, пока не будет введено две одинаковых чисел.*/

        Scanner scan = new Scanner (System.in);
        System.out.println(" Введите число х: ");
        int x = scan.nextInt();
        while(x > 0){
            System.out.println(" Введите число для вычитания: ");
            int b = scan.nextInt();
            x -= b;
            System.out.println("Текущее значение x: " + x);

        }
        System.out.println(" x  стал отрицательным ");



            }
}
