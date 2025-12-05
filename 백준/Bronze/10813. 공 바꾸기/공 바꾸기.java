import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] basket = new int[N+1];
        
        for(int i = 1; i <= N; i++)
        {
            basket[i] = i;
        }

        for(int b = 0; b < M; b++)
        {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for(int i = 1; i <= N; i++)
        {
            System.out.print(basket[i] + " ");
        }
        

        scanner.close();
    }
}