class FrecuencyOfEle
{
    public static void main(String args[])
    {
        int arr[]={12,23,33,4,5,5,4,12,33,33,8};

        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
             boolean isCount = false;

            for(int k = 0; k < i; k++)
            {
                if(arr[i] == arr[k])
                {
                    isCount = true;  
                }
            }


            if(isCount==false)
            {
                counter=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        counter++;
                    }
                }
                   
                System.out.println("Frecuency of "+arr[i]+" is "+counter);
                  
            }
        }
    }
}