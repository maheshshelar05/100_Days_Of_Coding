import java.util.*;

class StringCompression
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";
        int i = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);
            int count = 1;

            int j = i + 1;
            while(j < str.length() && str.charAt(j) == ch)
            {
                count++;
                j++;
            }

            result = result + ch + count;
            i = j;   
        }

        System.out.println("Compressed string:");
        System.out.println(result);
    }
}
