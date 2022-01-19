package Day38.Device;

public class Samsung  extends Phone{
    public Samsung( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }

    public void zoom(){
        System.out.println(getBrand() + getModel() + " is zooming");
    }



}
