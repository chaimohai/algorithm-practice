import java.sql.SQLOutput;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        // 求最小公倍数 公式：lcm(a,b) = a*b /(gcd(a,b));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = gcd(a, b);
        int lcm = a / c * b;  // 先出后乘，防止溢出
        System.out.println(lcm);

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}



