public class quickPow {
    public static void main(String[] args) {
        //快速幂计算
        long a = 2;
        long b = 10000;
        long mod = 1000000007;
        System.out.println(quickPow(a, b, mod));
    }

    // 快速幂模板
    public static long quickPow(long a, long b, long mod) {
        long res = 1;
        a = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
