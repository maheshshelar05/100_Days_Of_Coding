import java.util.*;

class FirstNonRepeateChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int i = 0;
        while(i < str.length())
        {
            char ch = str.charAt(i);
            int count = 0;

            int j = 0;
            while(j < str.length())
            {
                if(ch == str.charAt(j))
                {
                    count++;
                }
                j++;
            }

            if(count == 1)
            {
                System.out.println("First non-repeating character is: " + ch);
                break;
            }
            i++;
        }

        if(i == str.length())
        {
            System.out.println("No non-repeating character found");
        }
    }
}
