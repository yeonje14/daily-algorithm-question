import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[9];
        for(int i = 0; i < 9; i++)
        {
            list[i] = scanner.nextInt();
        }
        int max = list[0];
        int location = 1;
        
        for(int i = 0; i < 9; i++)
        {
            if(list[i] > max)
            {
                max = list[i];
                location = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(location);
        scanner.close();
    }
}