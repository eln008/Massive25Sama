package task6;

public class Main6 {
    public static void main(String[] args) {
        /*6.	Дан массив чисел. Определить, сколько в нем пар одинаковых соседних элементов. */
        int[] num = {4,2,2,8,8,9,5,5,4};
        int count = 0;
        for (int i = 1; i < num.length; i++) {
            if(num[i] == num[i-1]){
                count++;
            }
        }
        System.out.println("Количество одинаковых соседних пар  "+count);
    }
}
