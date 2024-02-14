package lesson32;

/* Encapsulation hides or protect the internal state and attributes of an 
object from others class. For example, our class BankAccount has 3 attributes, 
and only way to change the values of them is through an its methods 
(getter or setter) */

public class Encapsulation {

    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount(1215, "102030");
        BankAccount account2 = new BankAccount(1216, "102030");
        
        account1.addMoney(1500);
        // Conta1 = 1500
        
        account1.transferMoney(2000, account2);
        // Error, amount greater than the balance
        System.out.println("Balance: $" + account1.getBalance());
        // Account1 = 1500
        System.out.println("Balance: $" + account2.getBalance());
        // Account2 = 0, It did not receive the transfer
        
        account1.withdraw(300);
        System.out.println("Balance: $" + account1.getBalance());
        // 1200, because it withdrew $300
        
        account1.transferMoney(600, account2);
        // Account1 = 600, transferred $600 to another account
        System.out.println("Balance: $" + account1.getBalance());
        // Account1 = 600
        System.out.println("Balance: $" + account2.getBalance());
        // Account2 = 600, It received money from account1
    
    }
    
}
