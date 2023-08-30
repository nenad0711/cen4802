

public class Fibonacci {

    public static int fibonacci_number(int n){
        if(n<=1){
            return n;
        }
        return fibonacci_number(n-1)+ fibonacci_number(n-2);
    }
}



