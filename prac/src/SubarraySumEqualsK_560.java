import java.util.*;

public class SubarraySumEqualsK_560 {           //Can't use sliding window — array may have negatives
    public static void main(String[] args) {    //Formula — prefix[l] = prefix[r] - k → you're looking for complement in map, not the value itself
        int []nums = {1,1,1};                   //Order in loop — CHECK first, INSERT after → prevents self-matching
        int k = 2;                              //Initialize map.put(0, 1) before loop → handles subarrays starting from index 0
        int prefix[]=new int[nums.length+1];
        prefix[0]=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=1;i<=nums.length;i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
            if (map.containsKey(prefix[i] - k)) {
                count += map.get(prefix[i]-k);
            }
            map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
        }
        System.out.println(count);

    }
}
