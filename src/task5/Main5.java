package task5;

public class Main5 {
    public static void main(String[] args) {
        /*5.	Определить является ли данная последовательность убывающей
        (во избежание лишних проверок использовать оператор break) .*/
            int[] num = {9, 7, 5, 4, 3, 1};
            boolean isTrue = true;

            for (int i = 1; i < num.length; i++) {
                if (num[i] >= num[i - 1]) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                System.out.println("Последовательность убывающая");
            } else {
                System.out.println("Последовательность не убывающая");
            }
        }

    }
