class Singleton
{
    // static instance of the class
    private static Singleton instance;

    // private constructor
    private Singleton()
    {
        System.out.println("Singleton object created");
    }

    // public method to get the single instance
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage()
    {
        System.out.println("This is a Singleton class");
    }

    public static void main(String args[])
    {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();
    }
}
