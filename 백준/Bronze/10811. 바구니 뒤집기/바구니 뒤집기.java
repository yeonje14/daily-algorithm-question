import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[] basket = new int[N];
        for(int i = 0; i < N; i++)
        {
            basket[i] = i + 1;
        }
        
        for(int t = 0; t < M; t++)
        {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int left = i - 1;
            int right = j - 1;
            while(left < right)
            {
                int temp = basket[left];
                basket[left] = basket[right];
                basket[right] = temp;
                left++;
                right--;
            }
        }
       
        for (int num : basket) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}