import java.util.Scanner;

public class SumOfNum {
    // Метод за намиране на сумата на всяка цифра от числата в опреденият интервал (a - b)
    public static void sumOfSingleNums(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) { // Обикаляме от началото (a) до края (b)
            int number = i; // Копираме числото, за да не променяме оригиналната му стойност

            while (number > 0) { // Докато числото има цифри
                sum += number % 10; // Взимаме последната цифра и я добавяме към сумата
                number /= 10; // Махаме последната цифра
            }
        }
        System.out.printf("The sum of all digits in the interval is %d%n", sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number in the interval (1 - 10000): ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter the last number in the interval (1 - 10000): ");
        int b = new Scanner(System.in).nextInt();

        while(a < 1 || a > 10000) { // Докато (a) не в нашия интервал да се презаписва
            System.out.println("First number is not in the range! Please enter a number between 1 and 10000");
            a = new Scanner(System.in).nextInt();
        }

        while(b < 1 || b > 10000) { // Докато (b) не в нашия интервал да се презаписва
            System.out.println("Last number is not in the range! Please enter a number between 1 and 10000");
            b = new Scanner(System.in).nextInt();
        }

        sumOfSingleNums(a, b); // Викаме метода с нашите числа

    }
}