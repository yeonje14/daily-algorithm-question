import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = 0;
        int[] score1 = new int[N];
        double[] score2 = new double[N];
        double avg = 0;

        for(int i = 0; i < N; i++)
        {
            score1[i] = scanner.nextInt();
            if(score1[i] > max)
            {
                max = score1[i];
            }
        }

        for(int i = 0; i < N; i++)
        {
            score2[i] = ((double)score1[i] / max) * 100;
            avg += score2[i];
        }

        avg = avg / N;
        System.out.printf("%.2f", avg); 
        scanner.close();
    }
}