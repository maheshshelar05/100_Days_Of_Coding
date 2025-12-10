class MergeArrays
{
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={0,9,8,7,6};

        int arr3[]=new int[10];
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr3[index]=arr1[i];
            index++;
        }

        for(int j=0;j<arr2.length;j++)
        {
            arr3[index]=arr2[j];
            index++;
        }


        for(int k=0;k<arr3.length;k++)
        {
            System.out.println(arr3[k]);
        }
    }
}