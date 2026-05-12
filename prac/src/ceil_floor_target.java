public class ceil_floor_target {
    public static int[] calculateCeilFloor(String[] args) {
        int arr[]={1,3,5,7,9};
        int target=6;
        int l=0;
        int r=arr.length-1;
        int result[]=new int[2];
        int ceil=0;
        int floor=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return new int[]{arr[mid],arr[mid]};
            }
            else if(arr[mid]<target){
                floor=arr[mid];
                l=mid+1;

            }else{
                ceil=arr[mid];
                r=mid-1;
            }
        }
        return new int[]{floor, ceil};
    }
}
