package Day37_Inheritance.CryptoToken;

public class Bitcoin extends CryptoToken{


    public Bitcoin(double price, double circulatingSupply, double volume, int quantity, int marketCap, boolean isMineable) {
        super(price, circulatingSupply, volume, quantity, marketCap, isMineable);
    }
}
