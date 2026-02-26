public class leetcode724 {
    public static void main(String [] args){

     int arr[] = {2,1,-1};
     int leftcount = 0 ;
     int rightcount = 0 ;
     for(int i = 0 ; i < arr.length ; i++){
          leftcount = 0 ;
          rightcount = 0 ;
        if(i == 0 ){
            leftcount = 0;
        }
       
            for(int j = i-1 ; j>=0 ; j--){
                leftcount += arr[j];
            }
            for(int k = i+1 ; k<arr.length ; k++){
                rightcount += arr[k];
            }
              if(leftcount == rightcount){
        System.out.println("pivot index is at" + " " + i);
        return ;
     }
        
        
     } 
     System.out.println("pivot index Not found ");

  }
    
}
