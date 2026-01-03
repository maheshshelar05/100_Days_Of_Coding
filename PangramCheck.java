import java.util.*;

class PangramCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int alphabet[] = new int[26];
        int i = 0;

        str = str.toLowerCase();

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                alphabet[ch - 'a'] = 1;
            }
            i++;
        }

        int flag = 1;
        i = 0;
        while(i < 26)
        {
            if(alphabet[i] == 0)
            {
                flag = 0;
                break;
            }
            i++;
        }

        if(flag == 1)
            System.out.println("String is a Pangram");
        else
            System.out.println("String is NOT a Pangram");
    }
}
