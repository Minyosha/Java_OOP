package HW_Final.service;

import HW_Final.model.ComplexModel;

import java.io.IOException;

public class ComplexCalculator extends CalculatorService<ComplexModel> {
    public ComplexCalculator() throws IOException {
        super();
    }

    @Override
    protected ComplexModel sum() {
        double real = this.num1.getReal() + this.num2.getReal();
        double image = this.num1.getImaginary() + this.num2.getImaginary();

        return new ComplexModel(real, image);
    }

    @Override
    protected ComplexModel difference() {
        double real = this.num1.getReal() - this.num2.getReal();
        double image = this.num1.getImaginary() - this.num2.getImaginary();

        return new ComplexModel(real, image);
    }

    @Override
    protected ComplexModel multiply() {
        double real = this.num1.getReal() * this.num2.getReal() - this.num1.getImaginary() * this.num2.getImaginary();
        double image = this.num1.getReal() * this.num2.getImaginary() + this.num1.getImaginary() * this.num2.getReal();

        return new ComplexModel(real, image);
    }

    @Override
    protected ComplexModel division() {
        double scale = 10;
        double denominator = Math.pow(this.num2.getReal(), 2) + Math.pow(this.num2.getImaginary(), 2);
        double real = Math.ceil(((this.num1.getReal() * this.num2.getReal() + this.num1.getImaginary() * this.num2.getImaginary()) / denominator) * scale) / scale;
        double image = Math.ceil(((this.num1.getImaginary() * this.num2.getReal() - this.num1.getReal() * this.num2.getImaginary()) / denominator) * scale) / scale;

        return new ComplexModel(real, image);
    }
}