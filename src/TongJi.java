import java.util.HashMap;
import java.util.Map;

public class TongJi {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,5,5,5,4,8,8,8,9,10,1,10,1,10,10,12,12,11,11,13,14};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
