import java.util.Scanner;

public class XOnPowerNRecursion {
    public static double powerRecursion(int x, int n) {
        if(n > 0) return x * powerRecursion(x, n - 1);
        if(n == 0) return 1;
        else return 1 / powerRecursion(x, -n);
    }
    public static void main(String[] args) {
        System.out.println("Enter X:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Enter N:");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%.2f",powerRecursion(x, n));
    }
}
