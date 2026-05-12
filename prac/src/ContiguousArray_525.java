import java.util.*;

public class ContiguousArray_525 {
    public static void main(String[] args) {
        int [] nums={0,1};                        //Now think — when does a subarray sum to 0? When prefix[r+1] - prefix[l] = 0 → prefix[r+1] = prefix[l]
        int[] prefix=new int[nums.length+1];         //So HashMap stores {prefixSum → first index where it appeared}
        prefix[0]=0;                             //When same prefix sum appears again → currentIndex - firstIndex = subarray length!
        Map<Integer,Integer> map=new HashMap<>();  //Don't update map if key already exists — keep first index
        map.put(0,0);
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        for(int j=1;j<=nums.length;j++){
            prefix[j]=prefix[j-1]+nums[j-1];
            if(map.containsKey(prefix[j])){
                maxLen=Math.max(maxLen,j-map.get(prefix[j]));
            }
            else{
                    map.put(prefix[j], j);
            }
        }
        System.out.println(maxLen);
    }
}
