import  java.util.*;
public class permutation_Recursion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};        //Base case — permutation complete → add to result Choose → Explore → Unchoose — always in this orderTrack used — boolean array or contains check
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, current, result);
        System.out.println(result);
    }

    public static List<List<Integer>> backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // base case
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return result;
        }
        // explore
        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
                // choose
                current.add(nums[i]);
                // explore
                backtrack(nums, current, result);
                // unchoose
                current.remove(current.size() - 1);
            }
        return result;
        }
    }

