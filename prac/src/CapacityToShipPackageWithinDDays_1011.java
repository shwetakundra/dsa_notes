import java.util.Arrays;

public class CapacityToShipPackageWithinDDays_1011 {
    public static void main(String[] args) {
        int []weights = {3,2,2,4,1,4};             // Search space — l = max(weights), r = sum(weights)
        int days = 3;                     //Check function — can ship in days with capacity mid?Count days greedily — keep adding until capacity exceededValid → r = mid-1, Invalid → l = mid+1
        int l= Arrays.stream(weights).max().getAsInt();  //Return l
        int r=0;
        for(int i=0;i<weights.length;i++){
            r+=weights[i];
        }
        while(l<=r){
            int mid=(l+r)/2;
            int day=findnoOfDays(weights,mid);
            if(day<=days){
                r=mid-1;
            }
            else if(day>days){
                l=mid+1;
            }
        }
        System.out.println(l);
    }
    public static int findnoOfDays(int [] weight,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weight.length;i++){
            if(load+weight[i]>capacity){
                days+=1;
                load=weight[i];
            }else{
                load+=weight[i];
            }
        }
        return days;
    }
}
