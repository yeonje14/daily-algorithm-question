import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        
        int a1 = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int b1 = Integer.parseInt(new StringBuilder(b).reverse().toString());
        
        System.out.println(Math.max(a1, b1));
        scanner.close();         
    }
}