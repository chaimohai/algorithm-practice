import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        //排序从小到大
        int[] res = {12,2145,123,4,56,231,151515,584,51,1};
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
