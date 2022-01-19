package Day30_Custom_Class;

public class bankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

  /* public bankAccount(String accountHolder,Integer accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }*/

    public bankAccount(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "bankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Your available balance is : $" + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Depositing amount cannot be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You dont have enough balance");
            return;
        }
        if (amount<=0){
            System.out.println("Withdrawn amount cannot be zero or negative");
            return;
        }
        balance -= amount;

    }

}
