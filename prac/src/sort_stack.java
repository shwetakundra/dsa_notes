import java.util.Stack;

public class sort_stack {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(8);
        stack1.push(3);
        stack1.push(2);
        stack1.push(4);
        stack1.push(1);

        Stack<Integer> stack2=new Stack<>();
        while(!stack1.isEmpty()){
            int top=stack1.pop();
            while(!stack2.isEmpty() && top>stack2.peek()){
                stack1.push(stack2.pop());
            }
            stack2.push(top);
        }

        while(!stack2.isEmpty()){
            int ans=stack2.pop();
            System.out.println(ans);
        }
    }
}
