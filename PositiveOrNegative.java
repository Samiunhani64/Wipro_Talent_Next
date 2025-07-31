class PositiveOrNegative {
    public static void main(String[] args) {
        int number = 5; // Example number

        // Check if the number is positive
        // if (number > 0) {
        //     System.out.println(number + " is a positive number.");
        // } else if (number < 0) {
        //     System.out.println(number + " is a negative number.");
        // } else {
        //     System.out.println("The number is zero.");

        
        System.out.println(number + (number > 0 ? " is a positive number." : 
                                           number < 0 ? " is a negative number." : 
                                           " is zero."));
        
    }
}
