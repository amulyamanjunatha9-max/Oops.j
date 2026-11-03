class Shapes {

    static void square(double s) {
        System.out.println("Square Area = " + s * s);
        System.out.println("Square Perimeter = " + 4 * s);
    }

    static void rectangle(double l, double b) {
        System.out.println("Rectangle Area = " + l * b);
        System.out.println("Rectangle Perimeter = " + 2 * (l + b));
    }

    static void triangle(double b, double h, double a, double c) {
        System.out.println("Triangle Area = " + 0.5 * b * h);
        System.out.println("Triangle Perimeter = " + (a + b + c));
    }

    static void circle(double r) {
        System.out.println("Circle Area = " + Math.PI * r * r);
        System.out.println("Circle Perimeter = " + 2 * Math.PI * r);
    }

    public static void main(String[] args) {
        square(5);
        rectangle(6, 4);
        triangle(4, 3, 4, 5);
        circle(7);
    }
}