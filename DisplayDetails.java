import java.util.*;
class DisplayDetails
{
    int id;
    String name;
    int marks;
    public void getDetails()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter ID , Name and Marks :");
        id=sc.nextInt();

        sc.nextLine(); 

        name=sc.nextLine();
        
        marks=sc.nextInt();
       
    }

    public void DispDetails()
    {
        getDetails();
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }
    public static void main(String args[])
    {
       DisplayDetails dd=new DisplayDetails();
       dd.DispDetails();
    }
}