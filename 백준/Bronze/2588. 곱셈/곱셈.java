import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        
        int c = (b%10)*a;
        int d = ((b%100)/10)*a;
        int e = (b/100)*a;
        
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }
}