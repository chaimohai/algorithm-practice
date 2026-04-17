import java.util.Scanner;

public class NOIP2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            int sum = i;
            while (sum > 0) {
                if (sum % 10 == 2) {
                    count++;
                }
                sum /= 10;
            }
        }
        System.out.println(count);
    }
}
