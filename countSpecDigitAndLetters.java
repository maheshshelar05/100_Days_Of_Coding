import java.util.*;
class countSpecDigitAndLetters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        int latters=0;
        int digits=0;
        int speSymbol=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            
                latters++;
            
            else if(ch>='0' && ch<='9')
            
                digits++;
            else
              speSymbol++;
          
    
        }
         System.out.println("Number of letters : "+latters);
         System.out.println("Number of digits : "+digits);
         System.out.println("Number of special symbols : "+speSymbol);
    }
}