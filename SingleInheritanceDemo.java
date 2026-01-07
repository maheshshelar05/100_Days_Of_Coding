class Parent
{
    int money = 50000;

    void showParentProperty()
    {
        System.out.println("Parent money: " + money);
    }
}

class Child extends Parent
{
    void showChildProperty()
    {
        System.out.println("Child can access parent money: " + money);
    }
}

public class SingleInheritanceDemo
{
    public static void main(String args[])
    {
        Child c = new Child();

        c.showParentProperty();   
        c.showChildProperty();    
    }
}
