package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition")
    void testCalculateSub(){
        int firstOperand = 2;
        int secondOperand = 1;
        char subtraction = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, subtraction);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition")
    void testCalculateMul(){
        int firstOperand = 2;
        int secondOperand = 2;
        char multiplication = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, multiplication);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition")
    void testCalculateDiv(){
        int firstOperand = 6;
        int secondOperand = 3;
        char division = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, division);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char division = '/';

        assertThrows(RuntimeException.class,
                () -> {Calculator.calculate(firstOperand, secondOperand, division);
                });
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char equal = '=';

        assertThrows(RuntimeException.class,
                () -> {Calculator.calculate(firstOperand, secondOperand, equal);
                });
    }
}