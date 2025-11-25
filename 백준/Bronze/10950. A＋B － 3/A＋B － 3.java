import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        
        for(int i = 1; i <= time; i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
        
        scanner.close();
    }
}