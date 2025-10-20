import java.util.Scanner;
public class MainNeighbour {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int count = 0;

        System.out.println("Enter a number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < 0 && arr[i + 1] > 0) {
                count++;
            }
            else if(arr[i] > 0 && arr[i + 1] < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
