import java.util.Scanner;
public class Continuous{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int consecutive = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutive++;
            } else {
                if (consecutive > 2) {
                    count++;
                }
                consecutive = 1; 
            }
        }
        if (consecutive > 2) {
            count++;
        }
        System.out.println(count);
    }
}
