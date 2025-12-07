import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        while(num-- > 0)
        {
            String list = scanner.next();
            char first = list.charAt(0);
            char last = list.charAt(list.length() - 1);
            System.out.println(first+ "" + last);
        }
        scanner.close();
    }
}