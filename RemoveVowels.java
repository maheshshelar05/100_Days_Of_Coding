import java.util.*;

class RemoveVowel
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

            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' &&
               ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                result = result + ch;
            }
            i++;
        }

        System.out.println("String after removing vowels:");
        System.out.println(result);
    }
}
