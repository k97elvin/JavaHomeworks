package Day34_Encopsulation;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private int balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, int balance) {
    setAccountHolder(accountHolder);
    setAccountNumber(accountNumber);
    setBalance(balance);
    }

    public int deposit(double amount ){
          return balance+=amount;
    }
    public int withdraw (double amount){
        return balance-=amount;
    }
    public void checkBalance(){
        System.out.println(balance);
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance
        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments

 */