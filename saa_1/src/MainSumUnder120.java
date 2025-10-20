import java.util.Scanner;

public class MainSumUnder120 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long[] arr = new long[n];
        long sum = 1;
        System.out.println("Enter a number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] <= 120) {
                    sum *= arr[i] + arr[j];
                }
            }

        }
        System.out.println("The sum is " + sum);
    }
}
