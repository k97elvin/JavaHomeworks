package Day30_Custom_Class;

public class bankAccount_Object {
    public static void main(String[] args) {

        bankAccount account1 = new bankAccount("Elvin Karimli", 132);



        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();


    }
}
