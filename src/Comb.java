public class Comb {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(comb(n, k));
    }

    // 递归递推版
    public static int comb(int n, int k) {
        if (k == 0 || k == n) return 1;
        return comb(n-1,k-1) + comb(n-1,k);
    }
}