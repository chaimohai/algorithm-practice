import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,6,6,6,5,5,5,5,8,8,8,9,9,5,4,1,2,3,6,5,2,5,8,9,5,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

    }
}
