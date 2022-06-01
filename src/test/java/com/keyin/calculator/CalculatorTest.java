package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculatorNumberTest = new Calculator();

        Assertions.assertEquals(33, calculatorNumberTest.add(15, 18));
    }

    @Test
    public void testSubtract() {
        Calculator calculatorNumberTest = new Calculator();

        Assertions.assertTrue(calculatorNumberTest.subtract(100, 56) == 44);
    }

    @Test
    public void testEqualTo() {
        Calculator calculatorNumberTest = new Calculator();

        Assertions.assertFalse(calculatorNumberTest.equalTo(calculatorNumberTest.multiply(7, 3), calculatorNumberTest.add(20, 5)));
    }

    @Test
    public void testDivide() {
        Calculator calculatorNumberTest = new Calculator();

        Assertions.assertNotEquals(calculatorNumberTest.divide(50, 10), calculatorNumberTest.multiply(50, 10));
    }

}

//Calculator: add, multiply, divide, subtract^
    /*
public int add(int num1, int num2){
    int sum = num1 + num2;
    return sum;
}

    public int subtract(int num1, int num2){
        int diff = num1 - num2;
        return diff;
    }

    public int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public int divide(int num1, int num2){
        int quotient = num1 % num2;
        return quotient;
    }
 */
