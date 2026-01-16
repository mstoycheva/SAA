public class CountingSortDemo {
    public static void main(String[] args) {
        int[] data = {5, 2, 99, 1, 5, 40, 2, 100, 15};
        System.out.println("Преди сортиране:");
        printArray(data);
        countingSort(data);
        System.out.println("\nСлед сортиране (O(n)):");
        printArray(data);
    }

    public static void countingSort(int[] arr) {
        int[] count = new int[101];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            count[value]++;
        }

        int index = 0;
        for (int j = 1; j <= 100; j++) {
            while (count[j] > 0) {
                arr[index] = j;
                index++;
                count[j]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}