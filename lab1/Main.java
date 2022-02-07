package lab1;

import lab1.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        
        Triangle tri = new Triangle(2, 3, 4);
        double per = tri.calc_perimeter();
        double sqr = tri.calc_square();
        System.out.println("периметр: " + per);
        System.out.println("площадь: " + sqr);
    }
}
