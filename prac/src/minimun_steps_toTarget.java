import java.util.Arrays;

public class minimun_steps_toTarget {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
//        int target=5;
//        int sum=0;
//        int step=0;
//        while((sum<target)|| (sum-target)%2!=0){
//            step++;
//            sum+=step;
//        }
//        System.out.println(step);
        int j = 1;
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ans = 1;
            while (j <=nums.length - 1) {
                ans=ans * nums[j];
                j++;
            }
            result[i]=ans;
        }
        System.out.println(Arrays.toString(result));
    }
}
