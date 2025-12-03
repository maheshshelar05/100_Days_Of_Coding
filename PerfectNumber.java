import java.util.*;
class PerfectNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();


       
        int sum=0;

        
        int i=1;
        while(i <num)
        {
            if(num % i ==0)
            {
                sum=sum+i;

            
            }
              i++; 
        }
        
        if(num ==sum)
        
            System.out.println("Perfect Number ");

        else
            System.out.println("NOT Perfect Number ");


        
    }
}       