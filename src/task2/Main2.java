package task2;

public class Main2 {
    public static void main(String[] args) {
/*2.	Вывести на печать номера элементов массива, удовлетворяющих условию a[i]>10. */
        int[] a = {3,2,12,53,5,8,12,8,-9};
        for (int i = 0; i < a.length; i++) {
            if(a[i]>10){
                System.out.println(a[i]);
            }
        }
    }

}
