public class leetcode1929 {
    public static void main (String[] args){
        int arr[] = {1,0,1,5,2,9,7,2,2,5,8,};
        int n = arr.length;
        int nums[] = new int[2*n];
        for(int i = 0 ; i<n; i++){
            nums[i] = arr[i];
             nums[i+n] = arr[i];
        }
        
        for( int num : nums){
            System.out.print(num + " ");

        }
    }
    
}
