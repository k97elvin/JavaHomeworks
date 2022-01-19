package Day38.Device;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call (long phoneNumber){
        System.out.println(getBrand() + getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand() + getModel() + " is texting " + phoneNumber);
    }


}
/*
2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */