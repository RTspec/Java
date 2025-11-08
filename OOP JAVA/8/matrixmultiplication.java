//Rahul Tudu RollNo-12030523037
public class matrixmultiplication {
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rowsMat1 = mat1.length;
        int colsMat1 = mat1[0].length;
        int rowsMat2 = mat2.length;
        int colsMat2 = mat2[0].length;
        if (colsMat1 != rowsMat2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible.");
        }
        int[][] result = new int[rowsMat1][colsMat2];
        for (int i = 0; i < rowsMat1; i++) {
            for (int j = 0; j < colsMat2; j++) {
                for (int k = 0; k < colsMat1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] mat2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("Matrix 2:");
        printMatrix(mat2);
        int[][] result = multiplyMatrices(mat1, mat2);
        System.out.println("Result of Matrix Multiplication:");
        printMatrix(result);
    }
}
