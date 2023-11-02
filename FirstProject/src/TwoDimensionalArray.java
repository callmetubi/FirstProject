public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];


        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (row == col) {
                    matrix[row][col] = row;
                } else {
                    matrix[row][col] = 0;
                }
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < 10; i++) {
            diagonalSum += matrix[i][i];
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
