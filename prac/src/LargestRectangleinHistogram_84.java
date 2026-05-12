import java.util.*;

public class LargestRectangleinHistogram_84 {
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        int n=heights.length;
        int [] rightSmaller=new int[n];
        int [] leftSmaller=new int[n];
        int currARea=0;
        int maxArea=0;
        Stack<Integer> stack=new Stack<>();

        //right next smaller
        for(int i=n-1;i>=0;i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightSmaller[i] = n;
            } else {
                rightSmaller[i] = stack.peek();

            }
            stack.push(i);
        }
       while(!stack.isEmpty()){        // clean up stack
           stack.pop();
       }
        //left next smaller
        for(int i=0;i<n;i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftSmaller[i] = -1;

            } else {
                leftSmaller[i] = stack.peek();

            }
            stack.push(i);
        }

        for(int i=0;i<heights.length;i++){
            currARea=heights[i]*(rightSmaller[i]-leftSmaller[i]-1);
            maxArea=Math.max(maxArea,currARea);
        }
        System.out.println(maxArea);
    }
}
