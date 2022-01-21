package Day36_Encapsualtion.restaurant;

public class LocalRestaurantObject {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Elvin", "Springfield", 5);
        Server server1 = new Server("Elvin1", 211, 20, false);
        Server server2 = new Server("Elvin2", 212, 20, false);
        Server server3 = new Server("Elvin3", 213, 20, false);

        Server[] servers = {server1, server2, server3};

        System.out.println(restaurant1);
    }



}
/*
        6.4. Create a class LocalRestaurant that has a main method with the following:
                - Make a Restaurant object
                - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
                - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

                - Print your whole restaurants information
 */