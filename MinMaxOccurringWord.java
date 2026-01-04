import java.util.*;

class MinMaxOccurringWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        int minCount = words.length;
        int maxCount = 0;

        String minWord = "";
        String maxWord = "";

        int i = 0;
        while(i < words.length)
        {
            int count = 1;
            int j = i + 1;

            while(j < words.length)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                }
                j++;
            }

            if(count > maxCount)
            {
                maxCount = count;
                maxWord = words[i];
            }

            if(count < minCount)
            {
                minCount = count;
                minWord = words[i];
            }
            i++;
        }

        System.out.println("Maximum occurring word: " + maxWord);
        System.out.println("Minimum occurring word: " + minWord);
    }
}
