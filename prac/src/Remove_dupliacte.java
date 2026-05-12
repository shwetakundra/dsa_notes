import java.util.Arrays;

public class Remove_dupliacte {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
         int i=0;
         for(int j=1;j<arr.length;j++){
             if(arr[i]!=arr[j]){
                 i++;
                 arr[i]=arr[j];
             }

         }
//         for(int k=0;k<=i;k++){
//             System.out.println(arr[k]);
//         }
        int[] result = new int[i + 1];
         for(int k=0;k<=i;k++){
             result[k]= arr[k];
         }
         System.out.println(Arrays.toString(result));


    }
}
