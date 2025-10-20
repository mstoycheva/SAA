import java.util.Scanner;

public class UnderSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum += mat[i][n- i- 1];
        }
        System.out.println("The sum is " + sum);
    }
}
