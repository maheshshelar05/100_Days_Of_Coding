import java.util.*;
class RemoveSpaceFromString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String str2="";
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);

            if(ch==' ')
            
                continue;
            

            str2=str2+ch;
        }

        System.out.println(str2);
    }
}