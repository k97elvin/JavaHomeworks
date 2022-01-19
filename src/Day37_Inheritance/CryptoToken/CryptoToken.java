package Day37_Inheritance.CryptoToken;

public class CryptoToken {
    double price, circulatingSupply, volume;
    int quantity, marketCap;
    boolean isMineable;

    public CryptoToken(double price, double circulatingSupply, double volume, int quantity, int marketCap, boolean isMineable) {
        this.price = price;
        this.circulatingSupply = circulatingSupply;
        this.volume = volume;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", circulatingSupply=" + circulatingSupply +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", isMineable=" + isMineable +
                ", total price =" + totalPrice() +
                '}';

    }

    public double totalPrice() {
        return quantity*price;
    }

}
/*
CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */