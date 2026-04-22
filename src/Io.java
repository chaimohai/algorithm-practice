import java.util.Scanner;

public class Io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* int t = sc.nextInt();

        while (t>0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            t--;
            System.out.println(num1+num2);
        } */
        while(sc.hasNextLine()){
            String s =sc.nextLine();
            System.out.println(s.length());
        }
    }
}
