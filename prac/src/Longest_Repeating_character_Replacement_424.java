import java.util.*;

public class Longest_Repeating_character_Replacement_424 {
    public static void main(String[] args) {    //window_size - max_frequency > k → INVALID
       String s = "AABABBA";
       int k = 2;
       int l=0;
       int r=0;
       int Maxfreq=0;
       int maxlen=0;
       Map<Character,Integer> map=new HashMap<>();
       while(r<s.length()){
           map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
           Maxfreq= Math.max(Maxfreq,map.get(s.charAt(r)));
           while((r-l+1)-Maxfreq>k){
               map.put(s.charAt(l),map.get(s.charAt(l))-1);
               l++;
           }
           maxlen=Math.max(maxlen,r-l+1);
           r++;
       }
       System.out.println(maxlen);

    }
}
