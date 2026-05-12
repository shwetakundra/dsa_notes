import java.util.*;

public class Substrings_of_Size_Three_with_Distinct_Characters_1876 {
    public static void main(String[] args) {
        String str="xyzzaz";
        int count=0;
        int l=0;
        while(l<str.length()-2){
            if(str.charAt(l)!=str.charAt(l+1) && str.charAt(l+1)!=str.charAt(l+2) && str.charAt(l)!=str.charAt(l+2)) {
                count++;
            }
            l++;
        }

        System.out.println(count);

    }
}
