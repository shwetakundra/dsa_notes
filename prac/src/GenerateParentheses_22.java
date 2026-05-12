import java.util.*;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        int n=3;
        int open=n;
        int close=n;
        String s="";
        List<String> result=new ArrayList<>();
        backtrack(n, open,close,s, result);
        System.out.println(result);

    }
    public static List<String> backtrack(int n,int open ,int close, String op,List<String> result){
        if(open==0 && close==0){
            result.add(op);
            return result;

        }
        if(open!=0){
           String op1=op;
           op1+="(";
           backtrack(n,open-1,close,op1,result);
        }
        if(close>open){
            String op2=op;
            op2+=")";
            backtrack(n,open,close-1,op2,result);
        }
        return  result;
    }
}
