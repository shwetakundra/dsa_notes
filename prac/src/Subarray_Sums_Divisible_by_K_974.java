import java.util.HashMap;
import java.util.Map;

public class Subarray_Sums_Divisible_by_K_974 {
    public static void main(String[] args) {
        int[] nums = {-1,2,9};            //Store remainders — prefix[i] % k in HashMap, not prefix itself. Same remainder = subarray divisible by k
        int k = 2;                        //Negative remainder fix — if(rem < 0) rem += k — Java gives negative remainders for negative numbers
        int prefix[]=new int[nums.length+1]; //Initialize map.put(0, 1) — handles subarrays starting from index 0
        prefix[0]=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=1;i<=nums.length;i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
            int rem=prefix[i]%k;
            if(rem<0){
                rem=prefix[i]%k+k;
            }
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        System.out.println(count);

    }
}
