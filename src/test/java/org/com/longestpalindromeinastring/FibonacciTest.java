package org.com.longestpalindromeinastring;

import org.com.fibonacci.BottomUpFibonacci;
import org.com.fibonacci.RecursiveFibonacci;
import org.com.fibonacci.RecursiveWithMemoization;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FibonacciTest {

    @Test
    public void testRecursiveFib_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> RecursiveFibonacci.fibonacci(-3));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputAndExpected")
    public void testRecursiveFib_success(int input, int expected) throws Exception {
        Assertions.assertEquals( expected,
                RecursiveFibonacci.fibonacci(input));
    }

    @Test
    public void testRecursiveMemoizationFib_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> RecursiveFibonacci.fibonacci(-3));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputAndExpected")
    public void testRecursiveMemoizationFib_success(int input, int expected) throws Exception {
        Assertions.assertEquals( expected,
                RecursiveWithMemoization.fibonacci(input));
    }

    @ParameterizedTest
    @MethodSource("fibonacciInputAndExpected")
    public void testBottomUpFibonacci_success(int input, int expected) throws Exception {
        Assertions.assertEquals( expected,
                BottomUpFibonacci.fibonacci(input));
    }

    @Test
    public void testBottomUpFibonacci_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> BottomUpFibonacci.fibonacci(-3));
    }

    static Stream<Arguments> fibonacciInputAndExpected() {
        return Stream.of(
                Arguments.arguments(0, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(7, 13)
        );
    }
}
