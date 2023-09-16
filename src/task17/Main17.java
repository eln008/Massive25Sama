package task17;

public class Main17 {
    public static void main(String[] args) {
        /*17.	 Найти наибольший элемент главной диагонали матрицы С размером 4х4 и вывести на печать всю строку, в которой он находится.*/
        int[][] C = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int maxElement = C[0][0];
        int rowIndex = 0;

        for (int i = 0; i < C.length; i++) {
            if (C[i][i] > maxElement) {
                maxElement = C[i][i];
                rowIndex = i;
            }
        }

        System.out.println("наибольший элемент главной диагонали матрицы " + maxElement);
        System.out.print("Строка с этим элементом: ");
        for (int j = 0; j < C.length; j++) {
            System.out.print(C[rowIndex][j] + " ");
        }
    }
}
