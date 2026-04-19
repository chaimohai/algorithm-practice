import java.util.ArrayList;
import java.util.Arrays;

public class quChong {
    public static void main(String[] args) {
        int[] arr = {1,5,6,13,5,9,6,5,5,5,4,4,5,6,2,1,4,515,6,8,1,5};
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int num:arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
