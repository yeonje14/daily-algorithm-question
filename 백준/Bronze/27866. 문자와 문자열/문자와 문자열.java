import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        int num = scanner.nextInt();
        System.out.println(line.charAt(num - 1)); 
        scanner.close();
    }
}