import java.util.*;

public class palindrome_partition_131 {
    public static void main(String[] args) {
       String s = "aab";
       List<String> partion=new ArrayList<>();
       List<List<String>> result=new ArrayList<>();
       backtrack(s,partion,result);
       System.out.println(result);



    }
    public static List<List<String>> backtrack(String s,List<String> partion,List<List<String>> result){
        if(s.length()==0){
            result.add(new ArrayList<>(partion));
            return result;
        }
        for(int i=0;i<s.length();i++){
            String parts=s.substring(0,i+1);
            if(isPalindrom(parts)){
                partion.add(parts);
                backtrack(s.substring(i+1),partion,result);
                partion.remove(partion.size()-1);
            }
        }
        return result;
    }
    public static boolean isPalindrom(String s1){
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        return s1.equals(rev);
    }
}
