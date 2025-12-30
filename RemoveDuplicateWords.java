import java.util.*;

class RemoveDuplicateWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String result = "";

        int i = 0;
        while(i < words.length)
        {
            int count = 0;
            int j = 0;

            while(j < i)
            {
                if(words[i].equals(words[j]))
                {
                    count = 1;
                    break;
                }
                j++;
            }

            if(count == 0)
            {
                result = result + words[i] + " ";
            }
            i++;
        }

        System.out.println("Sentence after removing duplicate words:");
        System.out.println(result.trim());
    }
}
