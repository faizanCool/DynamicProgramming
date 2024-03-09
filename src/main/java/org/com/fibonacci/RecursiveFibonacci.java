package org.com.fibonacci;

public class RecursiveFibonacci {
    public static int fibonacci(int n) throws Exception {
        if (n < 0)
            throw new Exception("Negative integers not accepted");
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
