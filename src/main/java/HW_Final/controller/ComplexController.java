package HW_Final.controller;

import HW_Final.model.ComplexModel;
import HW_Final.service.ComplexCalculator;

import java.io.IOException;

public class ComplexController extends CalculatorController<ComplexModel> {
    public ComplexController() throws IOException {
        this.message = "Введите коэффициенты a и b комплексного числа через пробел. Оба коэффициента могут быть вещественными или целыми числами. Пример: -1.2 3  ";
        this.calculator = new ComplexCalculator();
    }

    @Override
    protected ComplexModel processInput(String[] input) {
        double real, imaginary;
        try {
            real = Double.parseDouble(input[0]);
            imaginary = Double.parseDouble(input[1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Неверный формат ввода");
        }

        return new ComplexModel(real, imaginary);
    }
}
