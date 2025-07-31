public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            }
            }
}
