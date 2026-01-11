
final class Vehicle
{

    final int speedLimit = 80;

   
    final void display()
    {
        System.out.println("Speed Limit: " + speedLimit);
    }
}

class FinalClass
{
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        v.display();

        // v.speedLimit = 100;   //cannot change final variable
    }
}
