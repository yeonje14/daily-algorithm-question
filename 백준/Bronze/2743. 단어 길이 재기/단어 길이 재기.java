import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.next();
        
        int count = 0;
        for(int i = 0; i < alpha.length(); i++)
        {
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}