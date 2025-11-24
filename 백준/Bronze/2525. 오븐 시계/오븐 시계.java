import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int hour = a.nextInt();
        int minute = a.nextInt();
        int add = a.nextInt();
        
        int total = 0;
        total = (hour*60) + minute + add;
        hour = total / 60;
        minute = total % 60;
        if(hour >= 24)
            hour = hour % 24;
        System.out.println(hour + " "+minute);
        
        a.close();
    }
}