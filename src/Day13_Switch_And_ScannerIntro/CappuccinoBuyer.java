package Day13_Switch_And_ScannerIntro;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        int calories = 100;
        double price = 3.99;
        String size = "";
        if (size == "tall" || size == "grande" || size == "venti") {

            switch (size) {
                case "tall":
                    price = 3.69;
                    calories = 90;
                case "grande":
                    price = 3.99;
                    calories = 150;
                case "venti":
                    price = 4.29;
                    calories = 150;
            }
            System.out.println("size " + size + " price " + price + " calories " + calories);
        } else {
            System.out.println("invalid");
        }

    }

}
 /*     Create a class called  CappuccinoBuyer. A variable named Size is given,
  \write a program that can display the price and calories of cappuccino

      Valid sizes are tall, grande, venti and their price & calories are:

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