import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={20,30,5,7,8,9,10,1,3,4};
        System.out.println("Enter number to search");
        int num=sc.nextInt();

        int found=0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]==num)
            {
                found=1;
                break;
            }
            i++;
        }
        if(found==1)
        System.out.println("Number found at index "+i);
        else
        System.out.println("Number NOT found ");
    }
}