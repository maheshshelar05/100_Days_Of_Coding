class RemoveDupliFromArr
{
    public static void main(String args[])
    {
        int arr[] = {5,6,7,3,3,5,8,9,7};
        int arr1[] = new int[10];

        int index = 0;

        for(int i=0; i<arr.length; i++)
        {
            int found = 0;  

            for(int j=0; j<index; j++)
            {
                if(arr[i] == arr1[j])
                {
                    found = 1;   
                }
            }
            if(found == 0)
            {
                arr1[index] = arr[i];
                index++;
            }
        }

        for(int k=0; k<index; k++)
        {
            System.out.println(arr1[k]);
        }
    }
}
