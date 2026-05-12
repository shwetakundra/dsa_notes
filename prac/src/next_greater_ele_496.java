import java.util.*;

public class next_greater_ele_496 {
    public static void main(String[] args) {
        int []nums1={4,1,2};
        int []nums2={1,3,4,2};
        Map<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        System.out.println(Arrays.toString(ans));

    }
}
