package Day34_Encopsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equals("Small") || size.equals("Medium") || size.equals("Large"))) {
            return;
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {

        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (!(size.equalsIgnoreCase("Small") && numberOfCheeseTopping > 0 && numberOfCheeseTopping <= 3)) {
            return;
        }
        if (!size.equalsIgnoreCase("Medium") && !(numberOfCheeseTopping > 0) && !(numberOfCheeseTopping <= 4)) {
            return;
        }
        if (!(size.equalsIgnoreCase("Large") && numberOfCheeseTopping <= 5 && numberOfCheeseTopping > 0)) {
            return;
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (!(size.equals("Small") && numberOfPepperoniTopping > 0 && numberOfPepperoniTopping <= 3)) {
            return;
        } else if (!(size.equals("Medium") && numberOfPepperoniTopping > 0 && numberOfPepperoniTopping <= 4)) {
            return;
        } else if (!(size.equals("Large") && numberOfPepperoniTopping <= 5 && numberOfPepperoniTopping > 0)) {
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
    }

    public int calCost() {
        int cost = 0;
        if (size == "Small") {
            cost = 10 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        } else if (size == "Medium") {
            cost = 12 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        } else {
            cost = 14 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        }
        return cost;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= " + calCost() +
                '}';
    }
}


/*5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */