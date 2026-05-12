import java.util.*;

public class LetterCombinationsofPhoneNumber_17 {
    public static void main(String[] args) {
        String digits="23";
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        String temp="";
        List<String> result=new ArrayList<>();
        int indx=0;
        backtrack(indx,digits,temp,map,result);
            System.out.println(result);
    }
    public static List<String> backtrack(int indx,String digits,String temp,Map<Character,String> map,List<String> result){
        if(indx==digits.length()){
            result.add(temp);
            return result;
        }
        char ch=digits.charAt(indx);
        String s=map.get(ch);
        for(char i:s.toCharArray()){
            temp+=i;
            backtrack(indx+1,digits,temp,map,result);
            temp=temp.substring(0,temp.length()-1);

        }
        return result;
    }
}
