import java.util.Arrays;

public class Prefix_Array {
    public static void main(String[] args) {
        int[]nums={2, 4, 1, 3, 5};
        int res[]=new int [nums.length+1];
        res[0]=0;
        for(int i=1;i<=nums.length;i++){
            res[i]=res[i-1]+nums[i-1];
        }
        System.out.println(Arrays.toString(res));
        System.out.print(res[3+1]-res[1]);
    }
}
