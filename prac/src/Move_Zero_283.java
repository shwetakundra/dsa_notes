import java.util.Arrays;

public class Move_Zero_283 {                      // both l and r pointer moves together if non0's occur
    public static void main(String[] args) {       // as soon 0 come l stops and r move for non0's and swap happen
        int [] nums = {1,1,0,3,12};             // 1.When arr[r] != 0 → swap arr[l] and arr[r], then l++ 2.r always moves forward
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]!=0){
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
            }
            r++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
