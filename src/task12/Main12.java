package task12;

public class Main12 {
    public static void main(String[] args) {
        /*12.	 Даны 8 действительных чисел х1, х2, …, х8. Получить квадратную матрицу 8х8
         х1   х2   … х8
         х12  х22 … х8
         х18  х28 … х8*/
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        int [][] matrix = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = (int) Math.pow(numbers[j], i + 1);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
