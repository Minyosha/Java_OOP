package HW_6.model;

public class ComplexModel implements CalculatorModel {
    private double real;
    private double imaginary;

    public ComplexModel(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return String.format(
                "(%s %s %si)",
                this.real == 0 ? "" : this.real,
                this.imaginary == 0 || this.real == 0 ? "" : this.imaginary < 0 ? "-" : "+",
                this.imaginary < 0 ? -this.imaginary : this.imaginary == 0 ? "" : this.imaginary
        );
    }
}
