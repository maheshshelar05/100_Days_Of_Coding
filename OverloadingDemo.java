class OverloadingDemo
{

    public void area(int side)
    {
        System.out.println("Area of the Square is "+(side*side));
    }
    public void area(int lenght, int height)
    {
        System.out.println("Area of the Rectangle is "+(lenght*height));
    }
    public void area(float radius)
    {
        System.out.println("Area of the Circle is "+(3.14*radius*radius));
    }
    public void area(float base, float height)
    {
        System.out.println("Area of the Tringle is "+1/2*(base*height));
    }
    

    public static void main(String args[])
    {
        OverloadingDemo o=new OverloadingDemo();
        o.area(10); 
        o.area(10,20);
        o.area(5);
        o.area(5,10);

    }

}