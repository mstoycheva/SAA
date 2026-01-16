public class TripleIntersection {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 50};
        int[] B = {5, 20, 30, 50, 60};
        int[] C = {5, 20, 50, 70, 80, 90};

        int[] counts = new int[101];

        for (int x : A) counts[x]++;
        for (int x : B) counts[x]++;
        for (int x : C) counts[x]++;

        int commonCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (counts[i] == 3) {
                commonCount++;
            }
        }

        int[] D = new int[commonCount];
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (counts[i] == 3) {
                D[index] = i;
                index++;
            }
        }

        System.out.print("Масив D (общи елементи): ");
        for (int element : D) {
            System.out.print(element + " ");
        }
    }
}