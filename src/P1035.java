import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        double sum = 0;
        int n = 1;
        while (true) {
            sum = sum + (1.0 / n);
            if (sum > s) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
