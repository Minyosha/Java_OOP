package HW_Final.service;

import HW_Final.model.RationalModel;

import java.io.IOException;

public class RationalCalculator extends CalculatorService<RationalModel> {
    public RationalCalculator() throws IOException {
        super();
    }

    @Override
    protected RationalModel sum() {
        int numerator = this.num1.getNumerator() * this.num2.getDenominator() + this.num1.getDenominator() * this.num2.getNumerator();
        int denominator = this.num1.getDenominator() * this.num2.getDenominator();

        return new RationalModel(numerator, denominator);
    }

    @Override
    protected RationalModel difference() {
        int numerator = this.num1.getNumerator() * this.num2.getDenominator() - this.num1.getDenominator() * this.num2.getNumerator();
        int denominator = this.num1.getDenominator() * this.num2.getDenominator();

        return new RationalModel(numerator, denominator);
    }

    @Override
    protected RationalModel multiply() {
        int numerator = this.num1.getNumerator() * this.num2.getNumerator();
        int denominator = this.num1.getDenominator() * this.num2.getDenominator();

        return new RationalModel(numerator, denominator);
    }

    @Override
    protected RationalModel division() {
        int numerator = this.num1.getNumerator() * this.num2.getDenominator();
        int denominator = this.num1.getDenominator() * this.num2.getNumerator();

        return new RationalModel(numerator, denominator);
    }
}
