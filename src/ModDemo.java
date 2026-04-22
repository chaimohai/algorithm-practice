public class ModDemo {
    public static void main(String[] args) {
        int mod = 1000000007;
        int a = 100000;
        int b = 200000;

        long add = (1l * (a + b)) % mod;
        long mul = (1l * a * b) % mod;
        System.out.println(add);
        System.out.println(mul);
    }
}
