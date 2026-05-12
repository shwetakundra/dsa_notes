import java.util.Arrays;

public class Split_Array_Larget_sum_410 {
    public static void main(String[] args) {
        int []nums = {7,2,5,10,8};
        int k = 2;
        int l= Arrays.stream(nums).max().getAsInt();  //Return l
        int r=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];
        }
        while(l<=r){
            int mid=(l+r)/2;
            int count=findnnoofSubarray(nums,mid);
            if(count<=k){
                r=mid-1;
            }
            else if(count>k){
                l=mid+1;
            }
        }
        System.out.println(l);

    }
    public static int findnnoofSubarray(int [] nums,int parts){
        int part=1;
        int currSubarray=0;
        for(int i=0;i<nums.length;i++){
            if(currSubarray+nums[i]>parts){
                part+=1;
                currSubarray=nums[i];
            }else{
                currSubarray+=nums[i];
            }
        }
        return part;
    }
}
