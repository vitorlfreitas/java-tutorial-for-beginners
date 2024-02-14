package lesson32;

public class BankAccount {
    
    private int accountNumber;
    private String password;
    private double balance = 0;

    public BankAccount(int accountNumber, String password) {
        
        this.accountNumber = accountNumber;
        this.password = password;
        
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amountMoney) {
        
        if (amountMoney > 0) {
            
            this.balance += amountMoney;
            System.out.println("Money added");
            System.out.println("Updated Balance: $" + getBalance());
            
        } 
        else 
            System.out.println("Invalid Amount");
        
    }
    
    public void withdraw(double amountMoney) {
        
        if (amountMoney < this.balance) {
            
            System.out.println("Withdrawing $" + amountMoney);
            this.balance -= amountMoney;
            System.out.println("Updated Balance: $" + getBalance());
            
        } 
        else 
            System.out.println("Amount greater than your current balance");
        
    }
    
    public void transferMoney(double amountMoney, BankAccount bankAccount) {
        
        if (amountMoney < this.balance) {
            
            this.balance -= amountMoney;
            bankAccount.balance += amountMoney;
            System.out.println("Transfer Completed");
            
        }
        else
            System.out.println("Amount greater than your current balance");
    }
    
    
    
}
