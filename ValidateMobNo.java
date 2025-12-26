import java.util.*;

class ValidateMobNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile Number:");
        String str = sc.nextLine();

        int i = 0;
        int flag = 1;

        if(str.length() == 10)
        {
            while(i < str.length())
            {
                char ch = str.charAt(i);

                if(ch < '0' || ch > '9')
                {
                    flag = 0;
                    break;
                }
                i++;
            }

            if(flag == 1)
                System.out.println("Valid Mobile Number");
            else
                System.out.println("Invalid Mobile Number");
        }
        else
        {
            System.out.println("Invalid Mobile Number");
        }
    }
}
