class CopyConstructor
{
    int id;
    String name;
    int marks;

    // Normal constructor
    CopyConstructor(int i, String n, int m)
    {
        id = i;
        name = n;
        marks = m;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor c)
    {
        id = c.id;
        name = c.name;
        marks = c.marks;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("---------------");
    }

    public static void main(String args[])
    {
        CopyConstructor c1 = new CopyConstructor(101, "Mahesh", 85);

        // Creating object using copy constructor
        CopyConstructor c2 = new CopyConstructor(c1);

        c1.display();
        c2.display();
    }
}
