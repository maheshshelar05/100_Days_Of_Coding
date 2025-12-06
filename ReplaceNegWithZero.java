class ReplaceNegWithZero
{
    public static void main(String args[])
    {
        int arr[]={1,2,-3,-4,5,-7,8};
        
        System.out.println("Befor Replacing ");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=0)
                arr[i]=0;
            
        }
        System.out.println("After Replacing ");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}