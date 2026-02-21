import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i = 0; i < N; i++) {
            for(int a = 0; a < N - 1 - i; a++) {
                System.out.print(" ");
            }
            for(int b = 0; b < (2 * i + 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int j = 0; j < N - 1; j++) {
            for(int c = 0; c <= j; c++) {
                System.out.print(" ");
            }
            for(int d = 0; d < 2 * (N - 1 - j) - 1; d++) {
                 System.out.print("*");   
            }
            System.out.println();
        }
        scanner.close();
    }
}