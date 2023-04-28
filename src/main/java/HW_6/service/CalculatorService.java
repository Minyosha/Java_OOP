package HW_6.service;

import java.io.IOException;

public abstract class CalculatorService<T> {
    protected T num1;
    protected T num2;
    protected T result;
    private final Logger logger;

    protected CalculatorService() throws IOException {
        this.logger = new FileLogger();
    }

    public T getNum1() {
        return num1;
    }

    public CalculatorService<T> setNum1(T num1) {
        this.num1 = num1;

        return this;
    }

    public T getNum2() {
        return num2;
    }

    public CalculatorService<T> setNum2(T num2) {
        this.num2 = num2;

        return this;
    }

    public T getResult() {
        return result;
    }

    public void calculate(String operation) throws IOException {
        switch (operation) {
            case "+" -> this.result = this.sum();
            case "-" -> this.result = this.difference();
            case "*" -> this.result = this.multiply();
            case "/" -> this.result = this.division();
            default -> throw new RuntimeException("Ошибка ввода");
        }
        this.logger.log(String.format(
                "%s %s %s = %s",
                this.num1.toString(),
                operation,
                this.num2.toString(),
                this.result
        ));
    }

    protected abstract T sum();

    protected abstract T difference();

    protected abstract T multiply();

    protected abstract T division();

}
