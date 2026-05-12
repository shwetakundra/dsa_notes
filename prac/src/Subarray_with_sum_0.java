import java.util.HashSet;

public class Subarray_with_sum_0 {
    public static void main(String[] args) {
        int arr[]={4, 2, 1, 6};
        System.out.println(isSubarraySUmWithZero(arr));
    }
    public static boolean isSubarraySUmWithZero(int nums[]){
        int [] prefix=new int[nums.length+1];
        prefix[0]=0;
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(0);
        for(int i=1;i<=nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
            if(hashset.contains(prefix[i])){
                return true;
            }
            hashset.add(prefix[i]);
        }
        return false;
    }
}
