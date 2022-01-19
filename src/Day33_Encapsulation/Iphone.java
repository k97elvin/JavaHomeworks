package Day33_Encapsulation;

public class Iphone {
    public static String brand, madeIn, OS, designedIn;
    public static boolean isSmartphone;
    public String model, color, size;

    static {
        brand = "Iphone";
        madeIn = "China";
        OS = "Ios";
        designedIn = "California";
        isSmartphone = true;
    }

    public static void printOperatingSystem() {
        System.out.println(OS);
    }

    public void call(double areaCode, double phoneNumber) {
        System.out.println(model + " is calling");
    }

    public void text(double phoneNumber) {
        System.out.println(model + "is texting..." + phoneNumber);

    }

    public void faceTime(double phoneNumber) {
        System.out.println(model + "calling facetime" + phoneNumber);

    }

    public void faceTime(String email) {
        System.out.println(model + " calling facetime " + email);
    }

    public Iphone(String model, String color, String size) {
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()


 */