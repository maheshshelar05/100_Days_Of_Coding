import java.util.*;
class checkingSmallestNum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==b && a==c && b==c)
        {
            System.out.println("All are Equal ");
        }
       else if(a<b)
        {
            if(a<c)
                System.out.println("A is Smallest ");
            else
               System.out.println("C is Smallest ");
        }
        else
        {
            if(b<c)
             System.out.println("B is Smallest ");
            else
             System.out.println("C is Smallest ");
        }
    }

}