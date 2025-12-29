import java.util.*;

class CountUpperLowerCase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

       int upperCount=0;
       int lowerCount=0;
        int i = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

           if(ch>='A' && ch<='Z')
            {
              upperCount++;
            }
            else if(ch>='a' && ch<='z')
            {
                lowerCount++;
            }
            i++;
        }

    
        System.out.println("Number of Upper Case Lattersm :"+upperCount);
        System.out.println("Number of Lower Case Latters :"+lowerCount);
    }
}
