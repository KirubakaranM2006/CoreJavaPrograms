package Return;

public class ReturnDemo1 {
    // Method that adds two numbers and returns the sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;  // Send the result back
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 3);  // Call the method and store the result
        System.out.println("The sum is: " + result);
    }
}
//The method addNumbers takes two numbers a and b.
//It calculates the sum and uses return sum; to send the result back.
//In main, the returned value is stored in the variable result.
//Finally, we print the result using System.out.println().