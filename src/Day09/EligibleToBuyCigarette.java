package Day09;

public class EligibleToBuyCigarette {
    public static void main(String[] args) {
        byte age = 20;
        if (age >= 21) {
            System.out.println("The person is eligible to by cigarette");
        } else if(age < 21){
            System.out.println("The person is not eligible to by cigarette");
        }

    }

}
