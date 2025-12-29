import java.util.*;

class ExtractDigit
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

           if(ch>='0' && ch<='9')
            {
                result = result + ch;
            }
            i++;
        }

        System.out.println("String after Extract Digit : ");
        System.out.println(result);
    }
}
