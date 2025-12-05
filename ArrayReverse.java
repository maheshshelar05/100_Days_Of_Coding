import java.util.*;
class ArrayReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
  
        int arr[]=new int[5];
        System.out.println("Enter Array Element :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("__Reverse Array__");
        int i=arr.length-1;
        while(i>=0)
        {
            System.out.println(arr[i]);
            i--;
        }

    }
}
