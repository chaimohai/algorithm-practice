import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        //求a和b的最大公约数
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
