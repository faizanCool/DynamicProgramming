package org.com.fibonacci;

public class BottomUpFibonacci {
    public static int fibonacci(int n) throws Exception {
        if (n < 0)
            throw new Exception("Negative integers not accepted");
        else if (n <= 1)
            return n;
        else {
            int temp1 = 0; // fibonacci(0) = 0
            int temp2 = 1; // fibonacci(1) = 1
            int temp = 0;
            for (int i = 2; i <= n; i++) {
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            return temp;
        }
    }
}
