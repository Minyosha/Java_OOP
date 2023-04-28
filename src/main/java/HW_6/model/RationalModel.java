package HW_6.model;

public class RationalModel implements CalculatorModel {
    private int numerator;
    private int denominator;

    public RationalModel(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalModel setNumerator(int numerator) {
        this.numerator = numerator;

        return this;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalModel setDenominator(int denominator) {
        this.denominator = denominator;

        return this;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
