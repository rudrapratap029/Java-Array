import java.util.Arrays;

public class leetcode217 {
    
    public static void main(String[] args) {
      
        int arr[] = {1,2,3,4,5,1};
        Arrays.sort(arr);

        boolean found = false;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
