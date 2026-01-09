abstract class Shape
{
    // abstract methods
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape
{
    int length = 5;
    int width = 4;

    @Override
    void area()
    {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    void perimeter()
    {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

class Circle extends Shape
{
    int radius = 3;

    @Override
    void area()
    {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    @Override
    void perimeter()
    {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * radius));
    }
}

public class AbstractDemo
{
    public static void main(String args[])
    {
        Shape s;

        s = new Rectangle();
        s.area();
        s.perimeter();

        System.out.println("---------------");

        s = new Circle();
        s.area();
        s.perimeter();
    }
}
