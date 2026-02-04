public class leetcode_27 {

static void remove(int arr[] , int key ){
    int k =0;
    for(int i = 0; i<arr.length;i++){
        if(arr[i]!=key){
            arr[i] = k;
               k++;
        }
     
    }
        System.out.println(k);
}



    public static void main (String [] args){
        int arr [] = {1,2,5,7,9,6,5,2,9,87,97 };
        int key = 97;
        remove(arr,key);
    }
}
