import java.util.*;

class HighestOccurChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        int i = 0;
        char maxChar = ' ';
        int maxCount = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);
            int count = 0;
            int flag = 0;

            int k = 0;
            while(k < i)
            {
                if(str.charAt(k) == ch)
                {
                    flag = 1;
                    break;
                }
                k++;
            }

            if(flag == 0)
            {
                int j = 0;
                while(j < str.length())
                {
                    if(str.charAt(j) == ch)
                    {
                        count++;
                    }
                    j++;
                }

                if(count > maxCount)
                {
                    maxCount = count;
                    maxChar = ch;
                }
            }

            i++;
        }

        System.out.println("Highest occurring character is " + maxChar + " with frequency " + maxCount);
    }
}
