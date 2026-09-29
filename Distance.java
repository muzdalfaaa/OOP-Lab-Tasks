class Distance {
    private int feet;
    private int inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}


class DistanceRun {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 8);
        d2.display();
    }
}