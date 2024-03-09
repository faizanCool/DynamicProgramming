package org.com.fibonacci;

public class RecursiveWithMemoization {
    private static Integer[] fibMemory;

    public static int fibonacci(int n) throws Exception {
        fibMemory = new Integer[n + 1];
        fibMemory[0] = 0;
        fibMemory[1] = 1;
        return calculateFibonacci(n);
    }

    private static int calculateFibonacci(int n) throws Exception {
        if (n < 0)
            throw new Exception("Negative integers not accepted");
        else if (n <= 1)
            return fibMemory[n];
        else {
            if (fibMemory[n] != null)
                return fibMemory[n];
            else {
                int temp = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
                fibMemory[n] = temp;
                return temp;
            }
        }
    }
}
