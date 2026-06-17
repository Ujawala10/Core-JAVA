class Complex {

    double real;
    double imaginary;

    // Default Constructor
    Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized Constructor
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    void add(Complex c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        System.out.println("Addition = " + r + " + " + i + "i");
    }

    // Subtraction
    void sub(Complex c) {
        double r = this.real - c.real;
        double i = this.imaginary - c.imaginary;

        System.out.println("Subtraction = " + r + " + " + i + "i");
    }

    // Multiplication
    void multiply(Complex c) {
        double r = (this.real * c.real) - (this.imaginary * c.imaginary);
        double i = (this.real * c.imaginary) + (this.imaginary * c.real);

        System.out.println("Multiplication = " + r + " + " + i + "i");
    }
}

public class practical1 {

    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 8);

        c1.add(c2);
        c1.sub(c2);
        c1.multiply(c2);
    }
}