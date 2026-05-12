//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxSum_subrray_k {
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2};
        int k=3;
        int sum=0;
        int l=0, r=k-1;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        while(r<arr.length-1){
            r++;
            sum=sum+arr[r]-arr[l];
            l++;
            maxSum=Math.max(sum,maxSum);

        }
        System.out.println(maxSum);

    }
}