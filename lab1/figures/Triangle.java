package lab1.figures;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calc_perimeter() {
        return this.a + this.b + this.c;
    }

    public double calc_square() {
        double p = this.calc_perimeter() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}