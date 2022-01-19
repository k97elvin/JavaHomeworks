package Day34_Encopsulation;

public class Circle {
    private int radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }




    public Circle(int radius) {
        setRadius(radius);
    }
    public double area(){
       return radius*radius*pi;
    }
    public double perimeter(){
        return 2*pi*radius;

    }


    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                " perimeter= " + perimeter()+
                " area= " + area() +
                '}';
    }
}
/*2. Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()

 */