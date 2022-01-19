package Day34_Encopsulation;

public class BankAccountObject {
    public static void main(String[] args) {
       BankAccount account1=new BankAccount("Elvin",123,1000);

        account1.deposit(100);
       System.out.println(account1);
    }
}
