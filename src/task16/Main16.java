package task16;

public class Main16 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int size = A.length;
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                B[i][j] = A[i][j];
                C[i][j] = A[i][j];

                if (j > 0 && j < i) {
                    B[i][j] = A[i][j] * 2;
                } else if (j > i) {
                    C[i][j] = A[i][j] / 2;
                }
            }
        }

        System.out.println("Матрица B:");
        printMatrix(B);

        System.out.println("Матрица C:");
        printMatrix(C);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

