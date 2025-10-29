import java.util.Scanner;

public class CheckNumberRecursion {
    public static boolean checkNum(int number, int digit) {
        if(number == 0) return false;
        if(number % 10 == digit) return true;
        else return checkNum(number / 10, digit);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter a digit:");
        int digit = new Scanner(System.in).nextInt();
        System.out.println(checkNum(n, digit));
    }
}
