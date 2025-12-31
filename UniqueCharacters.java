import java.util.*;

class UniqueCharacters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int freq[] = new int[256];
        int i = 0;
        int flag = 1;

        while(i < str.length())
        {
            char ch = str.charAt(i);
            freq[ch]++;

            if(freq[ch] > 1)
            {
                flag = 0;
                break;
            }
            i++;
        }

        if(flag == 1)
            System.out.println("String contains only unique characters");
        else
            System.out.println("String contains duplicate characters");
    }
}
