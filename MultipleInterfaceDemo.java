interface Switchable
{
    void turnOn();
    void turnOff();
}

interface Chargeable
{
    int MAX_BATTERY = 100;   // public static final by default
    void charge();
}

class SmartPhone implements Switchable, Chargeable
{
    int batteryLevel = 20;

    @Override
    public void turnOn()
    {
        if(batteryLevel > 0)
            System.out.println("Phone turned ON");
        else
            System.out.println("Battery empty. Cannot turn ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Phone turned OFF");
    }

    @Override
    public void charge()
    {
        batteryLevel = MAX_BATTERY;
        System.out.println("Phone charged to " + batteryLevel + "%");
    }
}

public class MultipleInterfaceDemo
{
    public static void main(String args[])
    {
        SmartPhone sp = new SmartPhone();

        sp.turnOn();
        sp.charge();
        sp.turnOn();
        sp.turnOff();
    }
}
