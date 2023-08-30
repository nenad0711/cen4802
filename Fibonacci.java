

public class Fibonacci {
    public Fibonacci() {
    }

    public static int fibonacci_number(int n) {
        return n <= 1 ? n : fibonacci_number(n - 1) + fibonacci_number(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("The nth term of the Fibonacci sequence is: " + fibonacci_number(10));
    }
}


