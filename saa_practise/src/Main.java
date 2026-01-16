public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {9, 2, 3},
                {4, 5, 6},
                {7, 8, 1}
        };

        System.out.println("First matrix:");
        printMatrix(matrix);

        int n = matrix.length;
        int[] mainDiagonal = new int[n]; // main diagonal => i == j
        for (int i = 0; i < n; i++) {
            mainDiagonal[i] = matrix[i][i];
        }

        for(int i = 0; i < n - 1; i++) { // bubble sort => for (n - 1) for (n - i - 1) swap
            for(int j = 0; j < n - i - 1; j++) {
                if(mainDiagonal[j] > mainDiagonal[j+1]) {
                    int temp = mainDiagonal[j];
                    mainDiagonal[j] = mainDiagonal[j+1];
                    mainDiagonal[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            matrix[i][i] = mainDiagonal[i];
        }

        int secondarySum = 0;
        for (int i = 0; i < n; i++) { // secondary diagonal => j = n - i - 1
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("\nSorted matrix:");
        printMatrix(matrix);
        System.out.println("\nSum of secondary diagonal: " + secondarySum);
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}