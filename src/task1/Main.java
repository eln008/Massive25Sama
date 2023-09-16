package task1;

public class Main {
    public static void main(String[] args) {
        /*1.	Вывести на печать первый отрицательный элемент массива и его порядковый номер,
        полагая, что в массиве есть хотя бы один отрицательный элемент. */
        int [] num = {3,6,-1,3,5,-6};
        int newNum = 0;
        int indexOfNewNum = -1;
        for (int i = 0; i < num.length; i++) {
            if(num[i] < 0){
                newNum=num[i];
                indexOfNewNum = i;
                break;
            }
        }
        System.out.println("первый отрицательный элемент  "+ newNum);
        System.out.println("первый отрицательный элемент  "+ indexOfNewNum);

    }
}