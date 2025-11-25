import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int total_price = scanner.nextInt();
        int total_quantity = scanner.nextInt();
        int each_price = 0, each_quantity = 0, sum_price = 0;
        
        for(int i = 1; i <= total_quantity; i++)
        {
            each_price = scanner.nextInt();
            each_quantity = scanner.nextInt();
            sum_price += (each_price * each_quantity);
        }
        
        if(total_price == sum_price)
            System.out.print("Yes");
        else
            System.out.print("No");
        
        scanner.close();
    }
}