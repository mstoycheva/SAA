public class QueueTask {
    private static final int MAX = 10;
    private final int[] queue = new int[MAX];
    private int front, rear;
    private boolean empty;

    public void initialise() {
        front = rear = 0;
        empty = true;
    }

    public void put(int i) {
        if (front == rear && !empty) {
            System.out.println("Overflow!");
            return;
        }

        queue[rear] = i;
        rear++;

        if (rear >= MAX) {
            rear = 0;
        }

        empty = false;
    }

    public int get() {
        if (empty) {
            System.out.println("Empty queue!");
            return -1;
        }

        int i = queue[front];
        front++;

        if (front >= MAX) {
            front = 0;
        }

        if (front == rear) {
            empty = true;
        }

        return i;
    }

    public void callQueueFunctions() {
        int myData;
        initialise();

        for (int i = 0; i < 2 * MAX; i++) {
            put(i);
            myData = get();
            System.out.print(myData + " ");
        }
        System.out.println();

        for (int i = 0; i < MAX + 1; i++) {
            put(i);
        }

        for (int i = 0; i < MAX + 1; i++) {
            get();
        }
    }

}
