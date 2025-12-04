import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] array = new int[10000];
        
        for(int i = 0; i < N; i++)
        {
            int A = scanner.nextInt();
            array[i] = A;
        }
        for(int i = 0; i < N; i++)
        {
            if(array[i] < X)
            {
                System.out.print(array[i]+" ");
            }
        }
        scanner.close();
    }
}