package Calculatorandtest.Calculatortest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> positiveAddition() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(5, 10, 15),
                Arguments.of(10, 20, 30)
        );
    }

    @Test
    void addition() {
        int expected = 10;
        assertEquals(expected, calculatorService.addition(7, 3));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "5,10,15", "10,20,30"})
    void additionPositive(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.addition(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("positiveAddition")
    void additionPositiveMethod(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.addition(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "15,10,5", "30,20,10"})
    void subtract(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.subtract(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,6", "15,10,150", "30,20,600"})
    void multiplication(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.multiplication(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"4,2,2", "10,5,2", "40,20,2"})
    void dividePositive(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.divide(num1, num2));
    }

    @Test
    void divideNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(Integer.MAX_VALUE, 0));
    }
}