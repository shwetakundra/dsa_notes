import java.util.*;

public class Count_subarrays_with_at_most_K_distinct_integers {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int k=2;
        Map<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        int count=0;
        while(r<arr.length){
            map.put(arr[r], map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        System.out.println(count);
    }
}
