import java.util.Arrays;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void processPrimeNumbers(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Empty array.");
            return;
        }

        int count = 0;
        long sum = 0;

        for (int element : array) {
            if (isPrime(element)) {
                count++;
                sum += element;
            }
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Prime Count: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Prime Average: %.3f%n", average);
        } else {
            System.out.println("No prime numbers");
        }
    }

    public static void main(String[] args) {
        int[] primeArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17};
        int[] primeArray2 = {8, 10, 12, 14, 15};

        processPrimeNumbers(primeArray1);
        System.out.println();
        processPrimeNumbers(primeArray2);
    }
}