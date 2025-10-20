import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter a second number: ");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println("The first number is " + num1);
        System.out.println("The second number is " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After change the first number is " + num1);
        System.out.println("After change the second number is " + num2);
    }
}