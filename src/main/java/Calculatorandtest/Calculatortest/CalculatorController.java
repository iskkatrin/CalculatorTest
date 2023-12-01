package Calculatorandtest.Calculatortest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping("/")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public ResponseEntity<String> addition(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
     if (num1 == null || num2 == null) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
     }
        Double result = calculatorService.addition(num1, num2);
        return ResponseEntity.ok(num1 + "-" + num2 + " = " + result);
    }

    @GetMapping("/minus")
    public ResponseEntity<String> subtract(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        Double result = calculatorService.subtract(num1, num2);
        return ResponseEntity.ok(num1 + "-" + num2 + " = " + result);
    }

    @GetMapping("/multiplication")
    public ResponseEntity<String> multiplication(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        Double result = calculatorService.multiplication(num1, num2);
        return ResponseEntity.ok(num1 + "*" + num2 + " = " + result);
    }

  /*  @GetMapping("/divide")
    public ResponseEntity<String> divide(@RequestParam("num1")
    Double num1, @RequestParam("num2") Double num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        if (num2 == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: деление на ноль");
        }
        Double result = calculatorService.divide(num1, num2);
        return ResponseEntity.ok(num1 + " / " + num2 + " = " + result);
    }*/

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль");
        }
        return num1 / num2;
    }
}

