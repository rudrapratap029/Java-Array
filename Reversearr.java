public class Reversearr {
     public static void main (String[] args){
        int arr[] = {5,5,4,78,1,98,36,48,72,02,21,20,95};
        int first =0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]= temp;
            first++;
            last--;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);

        // }
        // We can use for each loop for printing
        for(int ele: arr){
            System.out.println(ele);
        }
    }
    
}
