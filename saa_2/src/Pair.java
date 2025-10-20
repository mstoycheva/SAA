import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            if (mat[i][j] < mat[j][i]) {
                System.out.println("Correct pair is " + i + " " + j + " smaller than " + j + " " + i);
            }
        }

    }
}
