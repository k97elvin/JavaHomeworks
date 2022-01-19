package Day38.Device;

public class MyDevice {
    public static void main(String[] args) {
        Samsung s = new Samsung("S20 pro", 1000,true,true);
        Iphone i = new Iphone("13 pro", 1000, true,true);
        Laptop l = new Laptop("Asus","Rogx", 1000,true,true);
        Tv t = new Tv("Samsung","sasa",300,false,true);

        i.faceTime();
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(t);
    }
}
