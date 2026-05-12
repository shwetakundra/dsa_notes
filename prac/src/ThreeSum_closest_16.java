import java.util.Arrays;

public class ThreeSum_closest_16 {
    public static void main(String[] args) { //Same as 3Sum: sort, fix i, two pointers l = i+1, r = n-1
        int[] nums = {-1, -1,3,3,2, 1, -4};         //Track closestSum, update when Math.abs(target - sum) < closestSum)
        int target = 1;                      //sum < target → l++, sum > target → r--, sum == target → return target
        int closestSum = Integer.MAX_VALUE;
        int bestSum=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<closestSum){
                    closestSum=Math.abs(target-sum);
                    bestSum=sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    while (j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    System.out.println(target); // return target
                    break;
                }

            }

        }
        System.out.println(bestSum);

    }
}
