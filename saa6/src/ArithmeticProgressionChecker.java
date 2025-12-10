import java.util.Arrays;

public class ArithmeticProgressionChecker {
    public static int checkArithmeticProgression(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }

        int expectedDifference = array[1] - array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != expectedDifference) {
                return 0;
            }
        }

        return expectedDifference;
    }

    public static void main(String[] args) {
        int[] apArray = {5, 10, 15, 20, 25};
        int[] nonApArray = {1, 3, 6, 10};

        int d1 = checkArithmeticProgression(apArray);
        System.out.println("AP: " + Arrays.toString(apArray) + " -> d = " + d1);

        int d2 = checkArithmeticProgression(nonApArray);
        System.out.println("Non-AP: " + Arrays.toString(nonApArray) + " -> d = " + d2);
    }
}