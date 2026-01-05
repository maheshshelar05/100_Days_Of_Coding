class Reactangle
{
    int length;
    int width;

    public void getDetails(int l, int w)
    {
        length=l;
        width=w;
    }
    public void area()
    {


        float area=length*width;
        System.out.println("Area : "+area);
    }
     public void perimeter()
    {

        float area=2*(length*width);
        System.out.println("Area : "+area);
    }
     public static void main(String args[])
    {
       Reactangle r=new Reactangle();
       r.getDetails(5,5);
       r.area();
       r.perimeter();
    }
}