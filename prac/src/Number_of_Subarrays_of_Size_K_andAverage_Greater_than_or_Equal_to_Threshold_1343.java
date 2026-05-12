public class Number_of_Subarrays_of_Size_K_andAverage_Greater_than_or_Equal_to_Threshold_1343 {
    public static void main(String[] args) {
       int [] arr = {11,13,17,23,29,31,7,5,2,3};
       int k = 3;
       int threshold = 5;
       int sum=0;
       int l=0;
       int r=k-1;
       int count=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
       }
       if(sum>=threshold*k){
           count++;
       }
       while(r<arr.length-1){
           r++;
           sum=sum+arr[r]-arr[l];
           if(sum>=threshold*k){
             count++;
           }
           l++;

       }
       System.out.print(count);
    }
}
