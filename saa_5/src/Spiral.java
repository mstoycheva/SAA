public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9,  8,  7}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        int indexForRow = 0;
        int indexForCol = 0;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                rule(matrix[top][i], indexForRow, indexForCol);
                indexForCol++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                rule(matrix[i][right], indexForRow, indexForCol);
                indexForRow++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    rule(matrix[bottom][i], indexForRow, indexForCol);
                    indexForCol++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    rule(matrix[i][left], indexForRow, indexForCol);
                    indexForRow++;
                }
                left++;
            }
        }
    }

    static void rule(int value, int row, int col) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("Replaced " + value + " with sum index = " + (row + col));
        } else if (value % 3 == 0) {
            System.out.println("Replaced " + value + " with row index = " + row);
        } else if (value % 5 == 0) {
            System.out.println("Replaced " + value + " with col index = " + col);
        } else {
            System.out.println(value);
        }
    }
}
