package task11;

public class Main11 {
    public static void main(String[] args) {
        /*11 Дана действительная квадратная матрица. Заменить нулями все элементы,
        расположенные на главной диагонали и  выше нее.*/
        int [][] matrix = {{2,3,4},{8,1,9},{5,6,7}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
