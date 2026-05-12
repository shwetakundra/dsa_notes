//Expand r to grow the window until condition is met
//Once met, shrink l in a while loop to find the smallest valid window
//Record answer during the shrink phase//
public class Minimum_Size_Subarray_Sum_209 {
    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};
        int sum=0;
        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE){
            System.out.println(0);
        }
        System.out.println(minlen);

    }
}
