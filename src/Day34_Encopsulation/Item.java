package Day34_Encopsulation;

public class Item {
    private String name;
    private int unitPrice, quantity;

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch==' ')) {
                return;
            }

        }
        if (!(Character.isLetter(name.charAt(0)))) {
            return;
        }
        this.name = name;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        }

        this.quantity = quantity;
    }

    public int cost() {
        return quantity * unitPrice;
    }

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        if (name.equalsIgnoreCase("Toilet Paper") && quantity > 1) {
            return;
        }
        setQuantity(quantity);
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Cost=" + cost() +
                '}';
    }
}

/*Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive)
            			then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */