import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
            }
        }
        if(flag){
            System.out.println("是回文字符串！");
        }else{
            System.out.println("不是回文字符串！");
        }
    }
}
