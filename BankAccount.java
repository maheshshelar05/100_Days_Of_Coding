import java.util.*;

class BankAccount
{
    int accountNumber;
    String accountHolder;
    double balance;

    public void setDetails(int accNo, String name, double initialBalance)
    {
        accountNumber = accNo;
        accountHolder = name;
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[])
    {
        BankAccount acc = new BankAccount();

        acc.setDetails(101, "Mahesh", 5000);

        acc.displayAccount();

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(7000);
    }
}
