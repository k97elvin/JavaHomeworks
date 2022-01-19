package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter product name: ");
        String productName = scan.nextLine();

        System.out.println("enter the price: ");
        double price = scan.nextDouble();

        System.out.println("enter the quantity: ");
        int quantity = scan.nextInt();

        System.out.println("enter your first name: ");
        String name = scan.next();

        double total = price * quantity;

        System.out.println(name + ", your order for " + quantity + " " + productName + "\'s" +
                " has been placed. Your total is : $ " + total);


    }
}
/*6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
\

 */