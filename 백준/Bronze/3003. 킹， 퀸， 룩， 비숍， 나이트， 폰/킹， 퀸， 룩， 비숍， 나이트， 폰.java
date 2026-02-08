import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 수정된 부분: new Scanner(...) 
        Scanner sc = new Scanner(System.in);
        
        int[] a = {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i < 6; i++) {
            int b = sc.nextInt();
            System.out.print((a[i] - b) + " ");
        }
        
        sc.close();
    }
}