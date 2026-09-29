class Circle {

    private double radius;
    public Circle() {
        radius = 1;
    }
    public Circle(double r1, double r2) {
        radius = r1 + r2;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

class Runner {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Circumference = " + c1.circumference());

        Circle c2 = new Circle(2, 3);
        System.out.println("Circumference = " + c2.circumference());
    }
}