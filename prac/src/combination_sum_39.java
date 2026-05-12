import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target=7;
        int start=0,sum=0;
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,start,sum,current, result,target);
        System.out.println(result);
    }
    public static List<List<Integer>> backtrack(int[] nums,int start,int sum,List<Integer> current, List<List<Integer>> result,int target) {
        // base case
        if(sum==target) {
            result.add(new ArrayList<>(current));
            return result;
        }
        if(sum>target){
            return result;
        }
        // explore
        for (int i =start; i < nums.length; i++) {
            // choose
            current.add(nums[i]);
            // explore
            backtrack(nums,i,sum+nums[i],current, result,target);
            // unchoose
            current.remove(current.size() - 1);
        }
        return result;
    }
}
