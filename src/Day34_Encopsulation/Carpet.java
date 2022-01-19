package Day34_Encopsulation;

public class Carpet {
    private int width, length, unitPrice;
    private boolean isPersian;

    public int getWidth() {
        return length;
    }

    public int getLength() {
        return length;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public boolean getIsPersian() {
        return isPersian;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Carpet(int width, int length, int unitPrice, boolean isPersian) {
        this.isPersian = isPersian;
        setLength(length);
        setUnitPrice(unitPrice);
        setWidth(width);
    }

    public int calCost() {
        int total = length * width * unitPrice;
        if (isPersian == true) {
            total += 200;
        }
        return total;
    }

    public String toString() {

        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                " total cost= " + calCost() +

                '}';
    }
}
/*3. Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice

 */