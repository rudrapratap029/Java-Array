public class Secondlargest {
     public static void main(String[] args) {

         int arr[] = {20,54,15,12,34,67,95,95,45,105};
        int max = arr[0];
          int smax = arr[0];
        for(int i =0;i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
     for(int i =0;i<arr.length; i++){
        if(arr[i]>smax && arr[i]!=max){
           smax=arr[i];
           
        }
        
     }
 System.out.println("second largest number is: " + smax);
}
}
