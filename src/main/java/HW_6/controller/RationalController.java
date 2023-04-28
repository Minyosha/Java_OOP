package HW_6.controller;

import HW_6.model.RationalModel;
import HW_6.service.RationalCalculator;

import java.io.IOException;

public class RationalController extends CalculatorController<RationalModel> {
    public RationalController() throws IOException {
        this.message = "Введите числитель и знаменатель числа через пробел. Пример: 12 3  ";
        this.calculator = new RationalCalculator();
    }

    @Override
    protected RationalModel processInput(String[] input) {
        int numerator, denominator;
        numerator = Integer.parseInt(input[0]);
        denominator = Integer.parseInt(input[1]);
        if (denominator == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }

        return new RationalModel(numerator, denominator);
    }
}
