import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Enter a number: ");
        for(int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for(int i = 0; i < n - 1; i++) {

            if(arr[i] == arr[i + 1]) {
                count++;
            }
            while(i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }

        }
        System.out.println("The count is " + count);
    }
}
