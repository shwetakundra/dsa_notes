import java.util.HashMap;
import java.util.Map;

public class subarraysWithKDistinct_992 {       // So for every valid window, number of subarrays ending at r is r - l + 1
    public static void main(String[] args) {    //exactly K = atMost(K) - atMost(K-1)
        int arr[]={1,2,1,2,3};                 //Remove key from map when freq hits 0
        int k=2;
        int res=atMost(arr,k);
        int res1=atMost(arr,k-1);
        System.out.print(res-res1);

        }
        public static int atMost(int arr[],int k){
            Map<Integer,Integer> map=new HashMap<>();
            int l=0,r=0;
            int count=0;
            while(r<arr.length){
                map.put(arr[r], map.getOrDefault(arr[r],0)+1);
                while(map.size()>k){
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                }
                count+=r-l+1;
                r++;
            }
            return count;
        }
    }

