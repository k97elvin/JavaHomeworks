package Day36_Encapsualtion.restaurant;

public class ServerObject {
    public static void main(String[] args) {
        Server server = new Server("Elvin",123,20,false);
        System.out.println(server);

        server.cleanTable();

    }
}
