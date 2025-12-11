import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[26];
        String word = scanner.next();
        
        for(int i = 0; i < 26; i++)
        {
            index[i] = -1;
        }
        
        for(int i = 0; i < word.length(); i++)
        {
            int ch = word.charAt(i) - 'a';
            if(index[ch] == -1)
            {
                index[ch] = i;
            }
        }
        
        for(int i = 0; i < 26; i++)
        {
            System.out.print(index[i] + " ");
        }
        scanner.close();
    }
}