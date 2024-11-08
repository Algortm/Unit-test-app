/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTests {
    private SumCalculator calculator;

    @BeforeEach
    void beforeEach(){
        calculator = new SumCalculator();
    }
    @Test
    void testThatSumOneWorksCorrect() {
        int actually = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testThatSumThreeWorksCorrect() {
        int actually = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testThatSumZeroWorksCorrect() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->calculator.sum(0));
    }

}
