package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, location;
    public int numOfStars;

    ArrayList<Server> servers = new ArrayList<Server>();
    ArrayList<String> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numOfStars) {
        this.owner = owner;
        this.location = location;
        this.numOfStars = numOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[]server){
        servers.addAll(Arrays.asList(server));
    }

}
/*
		6.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

  hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

 toString(): Return (String) of all the information of a Restaurant object.
No need to print the whole list of Servers or Chefs.
 Print the number of Servers and Chefs along side the other information



 */