package HW_Final.controller;

import HW_Final.model.CalculatorModel;
import HW_Final.service.CalculatorService;
import HW_Final.view.CalculatorView;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class CalculatorController<T extends CalculatorModel> implements Controller {
    protected final Scanner scanner = new Scanner(System.in);
    protected String message;
    protected final CalculatorView<T> view = new CalculatorView<>();
    protected CalculatorService<T> calculator;

    public String getMessage() {
        return message;
    }

    public CalculatorController<T> setMessage(String message) {
        this.message = message;

        return this;
    }

    public CalculatorService<T> getCalculator() {
        return calculator;
    }

    public CalculatorController<T> setCalculator(CalculatorService<T> calculator) {
        this.calculator = calculator;

        return this;
    }

    public void run() throws IOException {
        T num1 = inputVariable();
        T num2 = inputVariable();
        String operation = selectOperation();
        this.calculator
                .setNum1(num1)
                .setNum2(num2)
                .calculate(operation);
        this.view.showResult(num1, num2, this.calculator.getResult(), operation);
    }

    protected String selectOperation() {
        List<String> allowedOperations = Arrays.asList("+", "-", "*", "/");
        while (true) {
            try {
                this.view.showInput("Введите операцию: ");
                String operation = scanner.next();
                if (!allowedOperations.contains(operation)) throw new Exception();

                return operation;
            } catch (Throwable e) {
                System.out.printf("Допустимые значения: %s\n", allowedOperations);
            }
        }
    }

    protected T inputVariable() {
        while (true) {
            try {
                this.view.showInput(this.message);
                String[] input = scanner.nextLine().split(" ");

                return this.processInput(input);
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
        }
    }

    protected abstract T processInput(String[] input);
}