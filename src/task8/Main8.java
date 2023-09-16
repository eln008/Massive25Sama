package task8;

public class Main8 {
    public static void main(String[] args) {
        /*8.	Задан двумерный массив, содержащий 3 строки и 4 столбца.
         Найти наибольший элемент, номер строки и столбца, в которых он расположен.*/
        int[][] num = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}};
        int maxElement = num[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                maxElement = num[i][j];
                row = i;
                column = j;
            }
        }
        System.out.println("Наибольший элемент "+maxElement);
        System.out.println("Номер строки  "+row);
        System.out.println("Номер столбца "+column);
    }
}
