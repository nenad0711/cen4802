

/**
 * This class contains a method for finding Fibonacci numbers by using a recursive approach
 * @author Nenad Jovanovic
 * @version 1.0
 */
public class Fibonacci {
    /**
     * Returns the Fibonacci number by using a recursive approach
     * @param n The number n represents the position of the number that we are searching for in the Fibonacci sequence.
     * @return Value associated with the nth position in the Fibonacci sequence.
     */
    public static int fibonacci_number(int n){
        if(n<=1){
            return n;
        }
        return fibonacci_number(n-1)+ fibonacci_number(n-2);
    }

    /**
     * This is the main method. The recursive method for finding Fibonacci numbers is tested.
     * @param args Strings passed into the main
     */
    public static void main(String[] args) {

        System.out.print("The nth term of the Fibonacci sequence is: " + Fibonacci.fibonacci_number(10));

    }


}



