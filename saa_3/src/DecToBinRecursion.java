import java.util.Scanner;

public class DecToBinRecursion {
    public static int decToBin(int n) {
        if(n == 0) return 0;
        else return n % 2 + 10 * decToBin(n / 2);
    }
    public static void main(String[] args) {
        System.out.println("Enter decimal number:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Bin:" + decToBin(n));
    }
}
