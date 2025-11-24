import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (first == second && second == third)
            System.out.println(10000+(first * 1000));
        else if (first == second || first == third)
            System.out.println(1000+(first * 100));
        else if (second == third)
            System.out.println(1000+(second*100));
        else {
            int max = first;
            if (second > max) max = second;
            if (third > max) max = third;
                System.out.println(max * 100);
        }
        scanner.close();
    }
}
