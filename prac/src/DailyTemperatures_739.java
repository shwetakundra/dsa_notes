import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739 {
    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
