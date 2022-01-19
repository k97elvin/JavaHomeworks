package Day30_Custom_Class;

public class Pizza {

    public char size;
    public int numberOfPeperoni;

    public Pizza(char size, int numberOfPeperoni, int numberOfCheese) {
        this.size = size;
        this.numberOfPeperoni = numberOfPeperoni;
        this.numberOfCheese = numberOfCheese;
    }

    public int numberOfCheese;



    public double calculateCost() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice = startingPrice + (numberOfCheese + numberOfPeperoni) * 2;
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfPeperoni=" + numberOfPeperoni +
                ", numberOfCheese=" + numberOfCheese +
                '}';
    }
}




