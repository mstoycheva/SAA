public class LinearDiagonalSearch {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        int[] counts = new int[101];

        for (int i = 0; i < n; i++) {
            int element = matrix[i][n - 1 - i];
            counts[element]++;
        }

        int middlePos = (n / 2) + 1;
        int currentCount = 0;
        int medianValue = -1;

        for (int value = 1; value <= 100; value++) {
            currentCount += counts[value];
            if (currentCount >= middlePos) {
                medianValue = value;
                break;
            }
        }

        System.out.println("Middle element: " + medianValue);
    }
}