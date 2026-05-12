import java.util.*;

public class Boyre_moore_n3 {
    public static void main(String[] args) {
        int nums[]={2,2,3,1,3,2,1,1}; //At most 2 elements can appear more than n/3 times (if 3+ elements each appear >n/3, total exceeds n).
        int n = nums.length;          //Total count = A + B + C > (n/3) + (n/3) + (n/3) = n But we only have n total elements, so this is impossible.
        int candidate1 = 0, candidate2 = 0; //Therefore, at most 2 elements can appear more than n/3 times
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            // Slot 1
            if (count1 == 0) {
                candidate1 = num;
            }
            if (num == candidate1) {
                count1++;
            }
            // Slot 2
            else if (count2 == 0) {
                candidate2 = num;
            }else if (num == candidate2) {
                count2++;
            }
            // Both filled, cancel
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // Return sorted
        Collections.sort(result);
        System.out.println(result);
    }
}
