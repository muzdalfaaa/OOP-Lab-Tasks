class Time {
    private int hr;
    private int min;
    private int seconds;

    public Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    public Time(int hr, int min, int seconds) {

        if (hr >= 0 && hr <= 23)
            this.hr = hr;
        else
            this.hr = 0;

        if (min >= 0 && min <= 59)
            this.min = min;
        else
            this.min = 0;

        if (seconds >= 0 && seconds <= 59)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }

    public void display() {
        System.out.println("Hour: " + hr);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + seconds);
    }
}


class TimeRun {
    public static void main(String[] args) {

        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(12, 30, 45);
        t2.display();

        Time t3 = new Time(25, 70, 80);
        t3.display();
    }
}