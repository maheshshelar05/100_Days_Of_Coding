class StaticBlock
{
    static int x;

    static
    {
        System.out.println("Static block executed");
        x = 100;
    }


    static void show()
    {
        System.out.println("Static method called");
        System.out.println("Value of x: " + x);
    }

    public static void main(String args[])
    {
        System.out.println("Main method started");
        DemoStatic.show();
    }
}
