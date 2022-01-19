package Day38.Device;

public class Iphone extends Phone {

    public Iphone( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, hasBattery, hasPowerButton);
    }
    public void faceTime(){
        System.out.println(getBrand() + " " + getModel() + " is calling facetime");
    }

}
