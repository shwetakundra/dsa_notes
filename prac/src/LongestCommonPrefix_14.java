public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String []strs = {"flower","flowi","flight"};
        String s=strs[0];
        for(int i=1;i< strs.length;i++){
            s=lcp(s,strs[i]);
        }

        System.out.println(s);
    }
    public static String lcp(String s1, String s2){
        String result="";
        int loop=Math.min(s1.length(), s2.length());
        for(int i=0;i<loop;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return result;
            }
            else{
                result+=s2.charAt(i);
            }
        }
        return result;
    }
}
