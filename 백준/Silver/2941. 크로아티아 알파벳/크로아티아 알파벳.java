import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int len = str.length();
        
        for(int i = 0; i < len; i++)
        {
            count ++;
            
            if(i < len - 1)
            {
                char now = str.charAt(i);
                char next = str.charAt(i + 1);
                
                if (now == 'c') 
                {
                    if (next == '=' || next == '-') i++;
                } 
                else if (now == 'd') 
                {
                    if (next == '-') i++;
                    else if (next == 'z' && i < len - 2 && str.charAt(i + 2) == '=') 
                    {
                        i += 2; 
                    }
                }
                else if ((now == 'l' || now == 'n') && next == 'j')
                {
                    i++;
                } 
                else if ((now == 's' || now == 'z') && next == '=') 
                {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}