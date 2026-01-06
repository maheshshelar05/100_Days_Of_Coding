
class ConstructorOverloading
{
    ConstructorOverloading()
    {
        System.out.println("Student Information ");
    }
    ConstructorOverloading(String name, int age)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    ConstructorOverloading(String std, int rn,int marks)
    {
        System.out.println("Standard : "+std);
        System.out.println("Roll No : "+rn);
        System.out.println("Marks(%) : "+marks);
    }

    public static void main(String args[])
    {
        ConstructorOverloading co1=new ConstructorOverloading();
        ConstructorOverloading co2=new ConstructorOverloading("Jayesh",20);
        ConstructorOverloading co3=new ConstructorOverloading("Bsc",34,60);

    }
}