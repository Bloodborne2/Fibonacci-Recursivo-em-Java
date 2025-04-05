public class Fibonacci {
    public int fibonacci(int x) {
        if (x == 0 || x == 1 )
            return x;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
