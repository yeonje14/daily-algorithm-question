import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int totalGroupWord = 0;
        
        for(int i = 0; i < num; i++)
        {
            String word = sc.next();
            boolean[] alphabet = new boolean[26];
            boolean isBad = false;
            
            for(int j = 0; j < word.length(); j++)
            {
                int index = word.charAt(j) - 'a';
                
                if(alphabet[index])
                {
                    if(word.charAt(j) != word.charAt(j - 1))
                    {
                        isBad = true;
                        break;
                    }
                }
                alphabet[index] = true;
            }
            if(!isBad)
            {
                totalGroupWord++;
            }
        }
        System.out.println(totalGroupWord);
        sc.close();
    }
}


              