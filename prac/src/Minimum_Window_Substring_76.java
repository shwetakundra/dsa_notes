import java.util.*;

public class Minimum_Window_Substring_76 {      // have==need 1. calculate minlen 2. decresase freq of l char 3. check if freq2[l]<freq1[l] have--
    public static void main(String[] args) {    // l++;

        String s = "ADOBECODEBANC";
        String t = "ABC";
        int l = 0;
        int r = 0;
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i),0)+1);
        }
        int need=tmap.size();
        int have=0;
        int minlen= Integer.MAX_VALUE;
        int minstart=0;
        while(r<s.length()){
            smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r),0)+1);
            if(tmap.containsKey(s.charAt(r)) && smap.get(s.charAt(r))==tmap.get(s.charAt(r))){
                have++;
            }
            while(have==need){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    minstart = l;  //to return substring from l to r
                }
                smap.put(s.charAt(l),smap.get(s.charAt(l))-1);
                if(tmap.containsKey(s.charAt(l)) && smap.get(s.charAt(l))<tmap.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
            r++;
        }
        if (minlen == Integer.MAX_VALUE)
            System.out.println("");
        else {
            // return (s.substring(minStart,minStart+minLen));
            System.out.println(s.substring(minstart, minstart + minlen));
        }
    }
}
