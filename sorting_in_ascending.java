public class sorting_in_ascending {
    public static void main (String[] args){
        int arr[] = {1,4,3,2,9,6,5,0,9,1,24,45,657,2,21};
        for(int i = 0 ; i<arr.length ; i++){
            for(int j= i+1; j<arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j]  = temp;
                    //  i++;
                    //  j++;

                }
   
            }
             System.out.print(arr[i]+ " ");
        }
      
    } 
}
