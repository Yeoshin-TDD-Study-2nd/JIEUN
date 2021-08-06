package com.tdd.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTests {

    private Fibonacci fibonacci = new Fibonacci();

    /**
     * 피보나치는 0과 1로 시작.
     * 0번째 피보나치는 0.
     * 1번째 피보나치는 1.
     */
    @Test
    void 피보나치_TDD_0번째() {
        assertEquals(0, fibonacci.getFibonacci(0));
    }

    @Test
    void 피보나치_TDD_1번째() {
        assertEquals(1, fibonacci.getFibonacci(1));
    }

    /**
     * 피보나치 2부턴
     * 바로 앞 두 피보나치 수의 합
     */
    @Test
    void 피보나치_TDD_2번째() {
        assertEquals(1, fibonacci.getFibonacci(2));
    }
}
