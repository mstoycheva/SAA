import java.util.Arrays;
public class Fibonacci{
    public static boolean isFibonacciSequence(int[] array) {
        if (array == null || array.length < 3) {
            return true;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] != (array[i - 1] + array[i - 2])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] fibArray = {1, 1, 2, 3, 5, 8, 13};
        int[] nonFibArray = {1, 2, 3, 4, 5, 6};

        System.out.println("Fibonacci: " + Arrays.toString(fibArray) + " : " + isFibonacciSequence(fibArray));
        System.out.println("Not Fibonacci: " + Arrays.toString(nonFibArray) + " : " + isFibonacciSequence(nonFibArray));
    }
}