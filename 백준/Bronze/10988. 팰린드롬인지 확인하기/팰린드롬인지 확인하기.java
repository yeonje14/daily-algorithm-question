import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        int len = word.length();
        int palindrome = 1;
        
        for(int i = 0; i < len; i++)
        {
            if(word.charAt(i) != word.charAt(len - 1 - i))
            {
                palindrome = 0;
                break;
            }
        }
        System.out.println(palindrome);
        
        sc.close();
    }
}

       