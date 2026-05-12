public class Container_With_Most_Water_11 {
    public static void main(String[] args) {  // area is min(height[l],height[r])*(r-l)// opposite direction pointer
        int[] nums={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=nums.length-1;
        int area=0;
        int res=0;
        while(l<r){
            area=Math.min(nums[l],nums[r])*(r-l);
            res=Math.max(res,area);
            if(nums[l]<nums[r]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(res);
    }
}
