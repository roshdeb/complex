package project;

public class Position {
    private double x;
    private double y;
    private double time;

    Position (double x, double y, double time) {
        this.x=x;
        this.y=y;
        this.time=time;
    }

    public static double G = 9.8;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
