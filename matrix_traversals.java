package anant_joshi;

public class matrix_traversal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int r = mat.length, c = mat[0].length;
        matrixTraversal11(mat, r, c);
    }

    public static void matrixTraversal1(int[][] matrix, int rows, int columns) {
        // Iterate through each row
        for (int row = 0; row < rows; row++) {
            // Iterate through each column
            for (int col = 0; col < columns; col++) {
                // Print the element at the current row and column
                System.out.print(matrix[row][col] + " ");
            }
        }
    }

    public static void matrixTraversal2(int[][] matrix, int rows, int columns) {
        // Traverse diagonally from top-left to bottom-left
        for (int k = 0; k < columns; k++) {
            for (int i = 0, j = k; i < rows && j > -1; i++, j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        // Traverse diagonally from second row to bottom-right
        for (int k = 1; k < rows; k++) {
            for (int i = k, j = columns - 1; i < rows && j > -1; i++, j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void matrixTraversal3(int[][] matrix, int rows, int columns) {
        int rowStart = 0;

        // Print upper triangle of the matrix
        for (int diagonalStart = columns - 1; diagonalStart >= 0; diagonalStart--) {
            // Print elements from the first row up to the diagonal
            for (int col = 0; col <= diagonalStart; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++; // Move to the next row
        }

        rowStart = 1; // Reset rowStart for the lower triangle

        // Print lower triangle of the matrix
        for (int diagonalStart = columns - 1; diagonalStart >= 1; diagonalStart--) {
            // Print elements from the second row up to the last row for each diagonal
            for (int col = diagonalStart; col < columns; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++; // Move to the next row
        }
    }

    public static void matrixTraversal4(int[][] matrix, int rows, int columns) {
        // Iterate through each column
        for (int col = 0; col < columns; col++) {
            // Iterate through each row in the current column
            for (int row = 0; row < rows; row++) {
                // Print the element at the current row and column
                System.out.print(matrix[row][col] + " ");
            }
        }
    }

    public static void matrixTraversal5(int[][] matrix, int rows, int columns) {
        // Traverse diagonally from top-right to bottom-left
        for (int diagonalStartCol = columns - 1; diagonalStartCol >= 0; diagonalStartCol--) {
            for (int row = 0, col = diagonalStartCol; row < rows && col < columns; row++, col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }

        // Traverse diagonally from second row to bottom-right
        for (int diagonalStartRow = 1; diagonalStartRow < rows; diagonalStartRow++) {
            for (int row = diagonalStartRow, col = 0; row < rows && col < columns; row++, col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
    }

    public static void matrixTraversal6(int[][] matrix, int rows, int columns) {
        int row = 0;

        // Print elements diagonally starting from each column
        for (int startCol = 0; startCol < columns; startCol++) {
            for (int col = startCol; col < columns; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            row++; // Move to the next row for next diagonal
        }

        row = 1; // Start from the second row for the lower part

        // Print elements diagonally for the lower part
        for (int startCol = 0; startCol <= columns - 2; startCol++) {
            for (int col = 0; col <= startCol; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            row++; // Move to the next row for next diagonal
        }
    }

    public static void matrixTraversal7(int[][] matrix, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            // For even rows, print elements from left to right
            if (row % 2 == 0) {
                for (int col = 0; col < columns; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            // For odd rows, print elements from right to left
            else {
                for (int col = columns - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void matrixTraversal8(int[][] matrix, int rows, int columns) {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Print right column
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
    }

    public static void matrixTraversal9(int[][] matrix, int rows, int columns) {
        // Print elements of the first row from left to right
        for (int col = 0; col < columns; col++) {
            System.out.print(matrix[0][col] + " ");
        }

        // Alternate between printing elements of each column downwards
        for (int col = columns - 1; col >= 0; col--) {
            if (col % 2 == 0) { // For even columns, print downwards
                for (int row = 1; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else { // For odd columns, print downwards from bottom to top
                for (int row = rows - 1; row >= 1; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void matrixTraversal10(int[][] matrix, int rows, int columns) {
        // Iterate through each column
        for (int col = 0; col < columns; col++) {
            // For even columns, print elements from top to bottom
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            // For odd columns, print elements from bottom to top
            else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void matrixTraversal11(int[][] matrix, int rows, int columns) {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        // Traverse the matrix in a spiral order
        while (top <= bottom && left <= right) {
            // Print top row from right to left
            for (int col = right; col >= left; col--) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Print leftmost column from top to bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][left] + " ");
            }
            left++;

            // Print bottom row from left to right
            if (top <= bottom) {
                for (int col = left; col <= right; col++) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Print rightmost column from bottom to top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][right] + " ");
                }
                right--;
            }
        }
    }

    public static void matrixTraversal12(int[][] matrix, int rows, int columns) {
        // Print elements of the first row from left to right
        for (int col = 0; col < columns; col++) {
            System.out.print(matrix[0][col] + " ");
        }

        // Print elements of remaining rows in a pattern
        for (int col = columns - 1; col >= 0; col--) {
            if (col % 2 == 0) { // For even columns, print downwards
                for (int row = 1; row <= (rows - 1) / 2; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else { // For odd columns, print upwards
                for (int row = (rows - 1) / 2; row >= 1; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }

        // Print elements of remaining rows in a pattern
        for (int col = 0; col < columns; col++) {
            if (col % 2 == 0) { // For even columns, print upwards
                for (int row = (rows - 1) / 2 + 1; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else { // For odd columns, print downwards
                for (int row = rows - 1; row >= (rows - 1) / 2 + 1; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}
