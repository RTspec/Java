//Rahul Tudu RollNo-12030523037
public class DiagonalElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 3, 4},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Primary diagonal elements:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println("\nSecondary diagonal elements:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
    }
}
