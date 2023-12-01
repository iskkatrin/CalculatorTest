package Calculatorandtest.Calculatortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Test
public class CalculatorServiceTest {
    @Autowired
    private CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    void addition() {
        Double num1 = 1.0;
        Double num2 = 2.0;
        ResponseEntity<String> response =
                CalculatorServiceImpl.addition(num1, num2);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("1.0 +  2.0 = 3.0", response.getBody());
    }

    @Test
    void subtract() {
        Double num1 = 3.0;
        Double num2 = 2.0;
        ResponseEntity<String> response =
                CalculatorServiceImpl.subtract(num1, num2);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("3.0 -  2.0 = 1.0", response.getBody());
    }

    @Test
    void multiplication() {
        Double num1 = 3.0;
        Double num2 = 2.0;
        ResponseEntity<String> response =
                CalculatorServiceImpl.multiplication(num1, num2);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("3.0 *  2.0 = 6.0", response.getBody());
    }

    @Test
    void divide() {
        Double num1 = 3.0;
        Double num2 = 2.0;
        ResponseEntity<String> response =
                CalculatorServiceImpl.divide(num1, num2);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("3.0 /  2.0 = 1.5", response.getBody());
    }
}
