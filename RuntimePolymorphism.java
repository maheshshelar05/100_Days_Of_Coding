class Notification
{
    void send()
    {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification
{
    @Override
    void send()
    {
        System.out.println("Sending Email Notification");
    }
}

class SmsNotification extends Notification
{
    @Override
    void send()
    {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends Notification
{
    @Override
    void send()
    {
        System.out.println("Sending Push Notification");
    }
}

public class RuntimePolymorphism
{
    public static void main(String args[])
    {
        Notification n;   

        n = new EmailNotification();
        n.send();   

        n = new SmsNotification();
        n.send();  

        n = new PushNotification();
        n.send();   
    }
}
