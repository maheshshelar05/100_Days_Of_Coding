class StaticVariable
{
    
    static String bankName = "State Bank of India";

    int accountNo;
    String holderName;
    double balance;

    StaticVariable(int accNo, String name, double bal)
    {
        accountNo = accNo;
        holderName = name;
        balance = bal;
    }

    void display()
    {
        System.out.println(accountNo + " " + holderName + " " + balance + " " + bankName);
    }

    public static void main(String args[])
    {
        StaticVariable a1 = new StaticVariable(101, "Mahesh", 50000);
        StaticVariable a2 = new StaticVariable(102, "Amit", 35000);

        a1.display();
        a2.display();
    }
}
