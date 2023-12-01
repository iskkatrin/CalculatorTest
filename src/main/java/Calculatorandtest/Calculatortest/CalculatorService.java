package Calculatorandtest.Calculatortest;

import org.springframework.stereotype.Service;

public interface CalculatorService {
    public Double addition(Double num1, Double num2);

    public Double subtract(Double num1, Double num2);

    public Double multiplication(Double num1, Double num2);

    public Double divide(Double num1, Double num2);
}
