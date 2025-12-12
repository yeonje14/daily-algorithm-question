import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.trim();
        
        if(line.isEmpty())
        {
            System.out.println(0);
        }
        else 
        {
            String[] words = line.split(" ");
            System.out.println(words.length);
        }

        scanner.close();
    }
}