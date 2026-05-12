import java.util.*;
//3 things to remember:
//
//Substring/subarray + condition → Sliding Window
//At most K distinct → Variable window, use HashMap, shrink when map.size() > k
//Find longest → track maxLen = r - l + 1
//
public class fruits_into_basket_904 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2};
        int l=0;
        int r=0;
        int len=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<arr.length){
            map.put(arr[r], map.getOrDefault(arr[r],0)+1);
            while(map.size()>2){
                map.put(arr[l], map.get(arr[l]) - 1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        System.out.print(len);
    }
}
