import java.util.*;

class CopyArray
{
    public static void main(String args [])
    {
        int arr[]={1,2,3,4,5};
        int arr1[]=new int[5];

        for(int i=0;i<5;i++)
        {
           arr1[i]=arr[i];
        }

        System.out.println("_______");
        for(int i=0;i<5;i++)
        System.out.println(arr1[i]+" ");


    }
}