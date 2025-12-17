import java.util.*;

class LowerToUpper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "";
        int i = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            result = result + ch;
            i++;
        }

        System.out.println(result);
    }
}
