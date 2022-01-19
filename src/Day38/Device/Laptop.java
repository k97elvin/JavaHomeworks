package Day38.Device;

public class Laptop extends Device {
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void isHeating(){
        System.out.println(getBrand() + getModel() + " is heating");
    }
}
