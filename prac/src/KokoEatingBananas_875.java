import java.util.*;

public class KokoEatingBananas_875 {
    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};  //Search space — not the array, but the range of possible answers. For Koko: [1, max(piles)]
        int h = 8;                   //Check function — "is this answer valid?" For Koko: can finish in h hours at speed mid?Valid → try smaller → r = mid-1Invalid → try larger → l = mid+1
        int l = 1;                   //Return l when loop ends — always points to minimum valid answer
        int r = Arrays.stream(piles).max().getAsInt();
        while (l <= r) {
            int mid = (l+r)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(piles[i] + mid - 1) / mid;//Math.ceilDiv(piles[i],mid);
            }
            if(sum<=h){
                r=mid-1;
            }
            else if(sum>h){
                l=mid+1;
            }

        }
        System.out.println(l);
    }

}
