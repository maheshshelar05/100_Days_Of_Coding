import java.util.*;
class SmallestNumInArr
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
        
        int min= arr[0];

         for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
            min=arr[i];
          }
        }

    System.out.println("Smallest Number In Array is "+min);
    }
}
