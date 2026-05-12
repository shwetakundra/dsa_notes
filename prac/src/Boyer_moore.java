public class Boyer_moore {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3};
        int n = arr.length;
        int candidate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println(candidate);
        } else {
            System.out.println(-1);

        }
    }
}
