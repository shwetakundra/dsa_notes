import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {         //1.oppsosite direction
       int []nums= {-1,0,1,2,-1,-4};                 // Sort first — enables two pointer movement
       Arrays.sort(nums);                             //Fix i, two pointers l = i+1, r = n-1
       List<List<Integer>> list=new ArrayList<>();     //sum < 0 → l++, sum > 0 → r--, sum == 0 → record triplet
        for(int i=0;i<nums.length;i++) {
           int j = i + 1;                              //Skip duplicates — if(i>0 && nums[i]==nums[i-1]) continue and while(j<k && nums[j]==nums[j-1]) j++
           int k = nums.length - 1;
           if (i > 0 && nums[i] == nums[i - 1]) {
               continue;
           }
           while (j < k) {
               int sum = nums[i] + nums[j] + nums[k];
               if (sum < 0) {
                   j++;
               } else if (sum > 0) {
                   k--;
               } else {
                   List<Integer> res = new ArrayList<>();
                   res.add(nums[i]);
                   res.add(nums[j]);
                   res.add(nums[k]);
                   list.add(res);
                   j++;
                   k--;
                   while (j < k && nums[j] == nums[j - 1]) {
                       j++;
                   }
               }
           }
       }
      System.out.println(list);
    }
}
