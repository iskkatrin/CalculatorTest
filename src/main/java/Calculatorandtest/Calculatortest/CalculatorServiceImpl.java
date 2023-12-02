package Calculatorandtest.Calculatortest;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
@Override
    public Integer addition(Integer num1, Integer num2) {
        return num1 + num2;
    }
    @Override
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }
    @Override
    public Double divide(Integer num1, Integer num2) {
    if (num2 == 0) {
        throw new IllegalArgumentException("Ошибка: деление на ноль");
    }
        return num1.doubleValue() / num2.doubleValue();
    }
}
