package Switch_Statements;

public class CapucinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        String result = "";
        double price = 3.69;
        int calories = 90;
        if (size == "Tall" || size == "Grande" || size == "Venti") {
            switch (size) {
                case "Tall":
                    result = price + "\n" + calories;
                    break;
                case  "Grande":

            }


        }

        System.out.println(result);
    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */