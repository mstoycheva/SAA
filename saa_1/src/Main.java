import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number(3): ");
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += num % 10;
            num = num / 10;

        }
        System.out.println("The sum is " + sum);
    }
}