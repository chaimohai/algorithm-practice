import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.printf("%d是素数。", num);
        } else {
            System.out.printf("%d不是素数。", num);
        }
    }

    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
