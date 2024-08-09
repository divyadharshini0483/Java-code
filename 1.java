import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer first = null;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    first = arr[i];
                    break;
                }
            }
            if (first != null) {
                break;
            }
        }
        Integer last = null;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    last = arr[i];
                    break;
                }
            }
            if (last != null) {
                break;
            }
        }
        if (first != null && last != null) {
            int difference = last - first;
            System.out.println(difference);
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}
