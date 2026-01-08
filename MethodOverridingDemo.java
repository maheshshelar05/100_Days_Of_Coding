class Parent
{
    void show()
    {
        System.out.println("This is Parent class show() method");
    }
}

class Child extends Parent
{
    
    @Override
    void show()
    {
        System.out.println("This is Child class show() method");
    }
}

public class MethodOverridingDemo
{
    public static void main(String args[])
    {
        Parent p = new Parent();
        p.show();   // Parent version

        Parent c = new Child();
        c.show();   // Child version (runtime polymorphism)
    }
}
