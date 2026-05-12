public class Permutation_in_String_567 {
    public static void main(String[] args) {   // maintain 2 freq array for s1 and s2 || compare array
        String s1="ab";
        String s2 = "eidbaooo";
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int windowSize=s1.length();
        int l=0;
        int r=windowSize-1;
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<windowSize;j++){
            freq2[s2.charAt(j)-'a']++;
        }
        if(isPermuataion(freq1,freq2)) {
            System.out.println("true");
        }
        while(r<s2.length()-1){
            r++;
            freq2[s2.charAt(r)-'a']++;
            freq2[s2.charAt(l)-'a']--;
            if(isPermuataion(freq1,freq2)){
                System.out.println("true");
            }
            l++;

        }
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
