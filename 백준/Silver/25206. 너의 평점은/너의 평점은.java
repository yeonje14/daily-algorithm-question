import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double totalScore = 0.0;
        double totalCredits = 0.0;
        
        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            
            StringTokenizer st = new StringTokenizer(line);
            String subject = st.nextToken(); 
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (grade.equals("P")) {
                continue;
            }
            
            double point = 0.0;
            char firstChar = grade.charAt(0);
            
            if (firstChar == 'A') point = 4.0;
            else if (firstChar == 'B') point = 3.0;
            else if (firstChar == 'C') point = 2.0;
            else if (firstChar == 'D') point = 1.0;
            else if (firstChar == 'F') point = 0.0;
            
            if (grade.length() > 1 && grade.charAt(1) == '+') {
                point += 0.5;
            }
            
            totalScore += (credit * point);
            totalCredits += credit;
        }
        
        if (totalCredits != 0) {
            System.out.printf("%.6f\n", totalScore / totalCredits);
        }
    }
}