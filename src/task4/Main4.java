package task4;

public class Main4 {
    public static void main(String[] args) {
/*4.	Даны натуральные числа  N, a0, a1,…., a(N-1).
Определить количество членов последовательности имеющих четные порядковые номера и
являющихся нечетными числами.*/
        int[] num = {1, 3, 5, 2, 4};
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            int a = num[i];

            if (i % 2 == 0 && a % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
