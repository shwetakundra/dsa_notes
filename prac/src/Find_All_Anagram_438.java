import java.util.*;
//Two int[26] freq arrays — one for pattern, one for window
//Slide: add s.charAt(r), remove s.charAt(l), compare arrays
public class Find_All_Anagram_438 {
    public static void main(String[] args) {
        String s2 = "cbaebacd";
        String s1 = "abc";
    int freq1[]=new int[26];
    int freq2[]=new int[26];
    int windowSize=s1.length();
    int l=0,r=windowSize-1;
    List<Integer> res=new ArrayList<>();
        if(s1.length()>s2.length()){
        System.out.println(res);
    }
        for(int i=0;i<s1.length();i++){
        freq1[s1.charAt(i)-'a']++;
    }
        for(int i=0;i<windowSize;i++){
        freq2[s2.charAt(i)-'a']++;
    }
        if(isPermuataion(freq1,freq2)) {
        res.add(0);
    }
        while(r<s2.length()-1){
        r++;
        freq2[s2.charAt(r)-'a']++;
        freq2[s2.charAt(l)-'a']--;
        if(isPermuataion(freq1,freq2)){
            res.add(l+1);
        }
        l++;
    }
        System.out.println(res);
}
public static boolean isPermuataion(int[] freq1, int [] freq2){
    for(int i=0;i<26;i++) {
        if (!(freq1[i]==freq2[i])){
            return false;
        }
    }
    return true;
}
}
