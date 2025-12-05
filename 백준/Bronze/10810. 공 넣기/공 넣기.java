import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[101];
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        for(int a = 0; a < M; a++)
        {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for(int b = i; b <= j; b++)
            {
                basket[b] = k; 
            }
        }

        for(int a = 1; a <= N; a++)
        {
            System.out.print(basket[a] + " ");
        }

        scanner.close();
    }
}