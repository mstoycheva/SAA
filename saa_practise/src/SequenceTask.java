public class SequenceTask {
    public static void main(String[] args) {
        long x = 2;
        long sum = 0;
        boolean startCounting = false;

        while (true) {
            x = 2 * x + 3;

            if (x > 10000) {
                break;
            }
            if (startCounting) {
                sum += x;
            }

            if (x > 100 && !startCounting) {
                startCounting = true;
            }
        }

        System.out.println("Сумата на нечетните елементи в интервала е: " + sum);
    }
}