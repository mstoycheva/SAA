import java.util.Arrays;

public class ArrayGCD {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findGCDOfArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return Math.abs(array[0]);
        }

        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 18, 24, 30};
        int[] arr1 = {7, 13, 29};

        System.out.println("GCD of " + Arrays.toString(arr) + " : " + findGCDOfArray(arr));
        System.out.println("GCD of " + Arrays.toString(arr1) + " : " + findGCDOfArray(arr1));
    }
}