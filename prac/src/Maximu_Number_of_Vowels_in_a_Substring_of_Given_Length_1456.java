public class Maximu_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {
    public static void main(String[] args) {
        String str= "ibpbhixfiouhdljnjfflpapptrxgcomvn";
        int k=33;
         int count=0;
        int l=0;
        int r=k-1;
         for(int i=0;i<k;i++){
             if(isVowle(str.charAt(i))){
                 count++;
             }
         }
         int maxCount=count;
         while(r<str.length()-1){
             r++;
             if(isVowle(str.charAt(r))){
                 count++;
             }
             if(isVowle(str.charAt(l))){
                 count--;
             }
             maxCount=Math.max(count,maxCount);
             l++;
         }
         System.out.println(maxCount);
    }
    public static boolean isVowle(char c){
        return(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u');
    }
}
