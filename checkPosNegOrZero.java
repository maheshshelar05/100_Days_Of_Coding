import java.util.*;
class checkPosNegOrZero
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Numbers : ");

        int num=sc.nextInt();

        if(num>0)
            System.out.println("Number is Positive : ");
        else if(num<0)
         System.out.println("Number is Negative : "); 
         else
          System.out.println("Number is zero : ");

    }
}
