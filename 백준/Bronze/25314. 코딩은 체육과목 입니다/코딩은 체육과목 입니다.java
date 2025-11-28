import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        while(N >= 1)
        {
            System.out.print("long ");
            N -= 4;
        }
        System.out.print("int");
        scanner.close();
    }
}