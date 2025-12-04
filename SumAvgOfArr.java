import java.util.*;
class SumAvgOfArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Element : ");
        int arr[]=new int[5];

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
         for(int i=0;i<arr.length;i++)
        {
           sum=sum+arr[i];
        }
        System.out.println("Sum Of Array Elements "+sum);
        System.out.println("Average Of Array "+sum/5);
        
    }
}
