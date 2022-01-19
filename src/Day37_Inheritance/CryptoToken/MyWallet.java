package Day37_Inheritance.CryptoToken;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin b = new Bitcoin(45000, 1000, 546000, 3, 560000, false);
        Etherium e = new Etherium(2500, 465200, 45000, 10, 7890000, false);
        double totalPrice = b.totalPrice() + e.totalPrice();
        System.out.println(b);
        System.out.println(e);
        System.out.println(totalPrice);
    }

}
