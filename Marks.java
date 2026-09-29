class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}


class MarksRun {
    public static void main(String[] args) {

        Marks m1 = new Marks();
        System.out.println("Sum: " + m1.calculateSum());

        Marks m2 = new Marks(80, 75, 90);
        System.out.println("Sum: " + m2.calculateSum());
    }
}
