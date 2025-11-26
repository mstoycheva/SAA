public class OverAverageEqualsZero {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 8},
                {6, 5, 4},
                {7, 9, 2}
        };

        for (int i = 0; i < arr.length; i++) {
            double avg = 0;
            for (int j = 0; j < arr[i].length; j++) {
                avg += arr[i][j];
            }
            avg /= arr[i].length;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int[] row : arr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
