import java.util.Arrays;
import java.util.Scanner;

public class P1223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += arr[i];
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.printf("%.2f",sum*1.0/n);
    }
}
