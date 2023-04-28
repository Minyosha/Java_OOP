package HW_6.view;

import HW_6.model.CalculatorModel;

public class CalculatorView<T extends CalculatorModel> implements InputView, ResultView<T> {
    public void showInput(String title) {
        System.out.print(title);
    }

    public void showResult(T num1, T num2, T result, String operation) {
        System.out.printf("%s %s %s = %s\n", num1, operation, num2, result);
    }
}
