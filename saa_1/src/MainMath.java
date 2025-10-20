public class MainMath {
    public static void main(String[] args) {
        int x = 2;
        for(int i = 0; i < 101; i++) {
            x = 2 * x + 10;
            if(x > 100) {
                break;
            }
        }
        System.out.println("The new x is " + x);
    }
}