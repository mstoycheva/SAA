import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        int[] arr = new int[n + 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n && i < m; i++) {
            arr[0] += mat[i][i];
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += mat[i][j];
            }
            arr[i + 1] = sum;
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i && j < m; j++) {
                if (mat[i][j] < arr[i + 1]) {
                    count++;
                }
            }
        }
        arr[n + 1] = count;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
