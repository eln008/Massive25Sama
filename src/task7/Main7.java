package task7;

public class Main7 {
    public static void main(String[] args) {
        /*7.	Дан массив чисел. Найти наибольший элемент, поставить его первым. */
        int[] num = {3,6,4,5,8,10};
        int max=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]> num[max]){
                max=i;
            }
        }
        int temp = num[0];
        num[0] = num[max];
        num[max] = temp;
        for (int n : num) {
            System.out.print(n + " ");
        }    }
}
