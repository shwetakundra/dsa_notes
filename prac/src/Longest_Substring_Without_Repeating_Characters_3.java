import java.util.*;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        String str="abcabcbb";
        int len=0;
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        while(r<str.length()){
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r),0)+1);
            while(map.get(str.charAt(r))>1){
                map.put(str.charAt(l),map.get(str.charAt(l))-1);
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        System.out.print(len);

    }
}
//index apprroch
// if(map.containsKey(str.charAt(r))&& map.get(str.charAt(r))>=l){
//               l=map.get(str.charAt(r))+1;
//           }
//           map.put(str.charAt(r),r);
//           len=Math.max(len,r-l+1);
//            r++;
//Yes! l jumps to index 2 which is c. The formula is:
//
//l = map.get(duplicate_char) + 1
//So l = 1 + 1 = 2. Window becomes [c, b] — done in one step instead of two.
