package Calculatorandtest.Calculatortest;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) {
        return num1 / num2;
    }
}
