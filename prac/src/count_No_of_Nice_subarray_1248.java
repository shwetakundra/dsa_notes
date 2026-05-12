import java.util.HashMap;
import java.util.Map;

public class count_No_of_Nice_subarray_1248 {
    public static void main(String[] args) {
        int []nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int res=atMostk(nums,k);
        int res1=atMostk(nums,k-1);
        System.out.println(res-res1);

    }
    public static int atMostk(int[] nums,int k){
        int oddCount=0;
        int count=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                oddCount++;
            }
            while(oddCount>k){
                if(nums[l]%2!=0){
                    oddCount--;
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}
