package Day31_Constructors;

public class circle {
    public double radius;
    public static double pi;

    public circle(double radius, double pi) {
        this.radius = radius;
        // this.pi = pi;//  pi = 3.14;
    }

    static {
        pi=3.14;
    }

    public double calcArea() {
        double area = pi * radius;
        return area;
    }

    public String toString() {
        return "circle{" +
                "radius=" + radius +
                "area= " + calcArea() +
                '}';
    }
}
