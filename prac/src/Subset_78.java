import java.util.ArrayList;
import java.util.List;

public class Subset_78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int start=0;
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

         backtrack(nums,start,current,result);
        System.out.println(result);
    }
    public static List<List<Integer>> backtrack(int[] nums, int start,List<Integer> current, List<List<Integer>> result) {
        // base case
            result.add(new ArrayList<>(current));
        // explore
        for (int i = start; i < nums.length; i++) {
            // choose
            current.add(nums[i]);
            // explore
            backtrack(nums, i+1,current, result);
            // unchoose
            current.remove(current.size() - 1);
        }
        return result;
    }
}
