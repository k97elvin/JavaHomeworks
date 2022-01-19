package Day33_Encapsulation;

public class Dog {
    public String breed, size, gender, color;
    public static int numberOfEyes, numberOfWings, numberOfLegs;
    public boolean isFriendly;

    static {
        numberOfEyes = 2;
        numberOfLegs = 4;
        numberOfWings = 0;
    }

    public Dog(String breed, String size, String gender, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    public void eat() {
        System.out.println(breed + " is eating");
    }
    public void drink(){
        System.out.println(breed + " is drinking");
    }

}
/*1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()

 */