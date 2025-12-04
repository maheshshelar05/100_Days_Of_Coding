import java.util.*;
class LargestNumInArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Element : ");
        int arr[]=new int[5];

        int max=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

         for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
        }

    System.out.println("Largest Number In Array is "+max);
    }
}
