public class ziDianXu {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";

        int res = str1.compareTo(str2);
        System.out.println(res);
        if(res<0){
            System.out.printf("%s字典序小于%s",str1,str2);
        }else if(res>0){
            System.out.printf("%s字典序大于%s",str1,str2);
        }else{
            System.out.println("一样大");
        }
    }
}
