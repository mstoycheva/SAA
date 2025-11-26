public class ZigZagNod {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12, 13}
        };

        int nod = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    if (arr[i][j] % 2 == 0) {
                        if (nod == 0) {
                            nod = arr[i][j];
                        } else {
                            nod = nod(nod, arr[i][j]);
                        }
                    }
                }
            } else { 
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                    if (arr[i][j] % 2 == 0) {
                        if (nod == 0) {
                            nod = arr[i][j];
                        } else {
                            nod = nod(nod, arr[i][j]);
                        }

                    }
                }
            }
            System.out.println();
        }

        System.out.println("NOD: " + nod);
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
