class Address
{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode)
    {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}

class StudentHasARealation
{
    int id;
    String name;
    Address address;   // HAS-A relationship

    StudentHasARealation(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display()
    {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.pincode);
    }

    public static void main(String args[])
    {
        Address a = new Address("Dhule", "Maharashtra", 424001);
        StudentHasARealation s = new StudentHasARealation(1, "Mahesh", a);

        s.display();
    }
}
