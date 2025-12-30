import java.util.*;

class RemoveSpecificChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter Character to Remove ");
        char c=sc.next().charAt(0);

        String result = "";
        int i = 0;

        while(i<str.length())
        {
            char ch=str.charAt(i);

            if(ch!=c)
             result=result + ch;
           
          
               
           
            i++;
        }

         System.out.println(result);
    }
}