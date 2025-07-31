public class Ternary {
    public static void main(String[] args) {
        int a = 10, b = 20 ,c = 15, d = 25;

        int largest = Math.max((a > b ? a : b), (c > d ? c : d));
        System.out.println("The largest number is: " + largest);
        

    }
}
