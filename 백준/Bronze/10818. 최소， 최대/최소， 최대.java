import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();  
        long[] array = new long[size];  

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLong();  
        }

        long min = array[0];
        long max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        System.out.println(min + " " + max); 
        scanner.close();
    }
}