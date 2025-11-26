public class BiggestNegative {
    public static void main(String[] args) {
        int[][] arr = {
                {-3, 5, 1},
                { 2, -7, 4},
                { 6, -1, 3}
        };

        for (int col = 0; col < arr[0].length; col++) {
            int maxNeg = -255;
            boolean found = false;

            for (int[] integers : arr) {
                if (integers[col] < 0) {
                    found = true;
                    if (integers[col] > maxNeg) {
                        maxNeg = integers[col];
                    }
                }
            }

            if (!found) {
                maxNeg = 0;
            }

            System.out.println("Column " + (col + 1) + " has max neg value of " + maxNeg);
        }
    }
}
