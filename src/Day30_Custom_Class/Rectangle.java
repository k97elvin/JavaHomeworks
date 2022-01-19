package Day30_Custom_Class;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;

    }

    public double calculatePerimeter() {
        return (length + width) * 2;


    }

    public String toString() {
        return "Rectangle{" + "length=" + length +
                ", width=" + width +
                ", Perimeter= " + calculatePerimeter()+
                ", area= "  + calculateArea()+'}';
    }
}
/*create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         toString(): displays the width, length, area and perimeter of the recta
         ngle when an object of rectangle passed in the print statement

 */