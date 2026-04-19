public class PrintfDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.14159;
        String s = "Java";

        System.out.printf("整数：%d\n",a);
        System.out.printf("整数：%8d\n",a);
        System.out.printf("保留两位小数：%f\n",b);
        System.out.printf("字符串：%s\n",s);
        System.out.printf("我爱学习%s\n",s);

    }
}
