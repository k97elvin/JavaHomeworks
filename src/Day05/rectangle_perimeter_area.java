package Day05;

public class rectangle_perimeter_area {
    public static void main(String[] args) {
        int length = 15, width = 10;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle = " + area + "\n" + "Perimeter of rectangle = " + perimeter);
    }
}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */