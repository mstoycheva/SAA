import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter number of columns: ");
        int m = new Scanner(System.in).nextInt();
        int sum = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element: ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }

        }
        for (int i = 0; i < m; i++) {
            sum += arr[0][i];
        }
        for (int i = 0; i < n; i++) {
            sum += arr[n-1][i];
        }
        for (int i = 1; i < n-1; i++) {
            sum += arr[i][0];
            sum += arr[i][m-1];
        }
        System.out.println("The sum is " + sum);
    }
}