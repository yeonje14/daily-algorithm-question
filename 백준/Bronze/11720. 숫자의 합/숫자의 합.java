import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String arr = scanner.next();
        int result = 0;
        
        for(int i = 0; i < N; i++)
        {
            result += arr.charAt(i) - '0';    
        }
        System.out.print(result);
        scanner.close();
    }
}