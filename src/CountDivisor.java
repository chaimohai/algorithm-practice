import java.util.Scanner;

public class CountDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i==num/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        System.out.printf("%d,一共有%d个正约数",num,count);
        System.out.println();
    }
}