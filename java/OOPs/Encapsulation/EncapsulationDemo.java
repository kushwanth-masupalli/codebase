package OOPs.Encapsulation;

// EncapsulationDemo.java

/*
 * ===============================================
 *              Encapsulation in Java
 * ===============================================
 *
 * ✅ Definition:
 *Encapsulation means "wrapping data and methods that operate on the 
 data into a  single unit (class)", while restricting direct 
 access to some of the object's components.
            *
 * ✅ Benefits of Encapsulation:
 * - Protects data from direct access (Data Hiding)
 * - Makes code more maintainable and flexible
 * - Allows validation logic to control how data is set
 * - Prevents unintended interference with internal state
 *
 * ✅ How to Achieve Encapsulation:
 * - Declare fields as private
 * - Provide public getter and setter methods to access/change data
 * - Optionally restrict write access (e.g., no setter)
 */

class BankAccount {
    // Private fields – cannot be accessed directly from outside the class
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize fields
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public getter method – allows read access
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public setter method – allows write access
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for account number (no setter = read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (includes validation logic)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("Alice", "123456789", 1000.0);

        // Accessing data via getter methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Performing operations using public methods
        account.deposit(500.0);
        account.withdraw(300.0);

        // Checking updated balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
