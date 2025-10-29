import java.util.Scanner;

public class SumOfArrayRecursion {
    public static int sumOfArray(int[] arr, int n) {
        int sum = 0;
        if (n <= 0) return 0;
        else return sumOfArray(arr, n - 1) + arr[n - 1];
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements in the array: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Sum of array elements is " + sumOfArray(arr, n));
    }
}
