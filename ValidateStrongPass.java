import java.util.*;

class ValidateStrongPass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String pass = sc.nextLine();

        int i = 0;
        int upper = 0;
        int digit = 0;
        int special = 0;

        while(i < pass.length())
        {
            char ch = pass.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                upper = 1;
            }
            else if(ch >= '0' && ch <= '9')
            {
                digit = 1;
            }
            else if(!(ch >= 'a' && ch <= 'z'))
            {
                special = 1;
            }
            i++;
        }

        if(upper == 1 && digit == 1 && special == 1)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
