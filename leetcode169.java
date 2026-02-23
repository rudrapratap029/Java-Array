public class leetcode169 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3 };
        int n = arr.length;

        int count = 0;
        int k = n / 2;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                   if (count > k){
            System.out.println("majority element is found " + arr[i]);
            return ;
        }
    }
    System.out.println("majority element is not  found ");
    }
     
}
