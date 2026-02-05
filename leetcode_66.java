public class leetcode_66 {
   static void plusone(int arr[]){
    for(int i = arr.length-1 ; i>=0 ; i--){
        if(arr[i]!= 9){
            arr[i]= arr[i]+1;
           for(int num : arr) {
                    System.out.print(num + " ");
                }
             return ;
          
        }
          arr[i]= 0;
    }

    int result [] = new int [arr.length+1];
    result[0]=1;
         for(int num : result) {
                    System.out.print(num + " ");
                }
   }
 
 
 
 
    public static void main (String[] args){
        int arr[] = {9,9,9,9,9,5,4};
          plusone(arr);
    }
}
