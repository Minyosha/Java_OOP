package HW_Final.view;

import HW_Final.model.CalculatorModel;

public class CalculatorView<T extends CalculatorModel> implements InputView, ResultView<T> {
    public void showInput(String title) {
        System.out.print(title);
    }

    public void showResult(T num1, T num2, T result, String operation) {
        System.out.printf("%s %s %s = %s\n", num1, operation, num2, result);
    }
}
