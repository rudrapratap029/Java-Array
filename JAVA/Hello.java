// class Hello {
//     public static void main(String[] args) {
//         int arr[] = { 23, 100, 64, 22, 65, 76 };
//         int min = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min)
//                 min = arr[i];
//         }
//         System.out.println(min);
//     }
// }
// import java.util.Arrays;
// class Hello {
//     public static void main(String[] args) {
//         int arr[]= {21,17,57,58,43};
//       marks(arr);
//        Arrays.sort(arr);
//          marks(arr);
//     }
// public static void marks(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println("  ");
// }
// }


// class Hello {
//     public static void main(String[] args) {

//     int arr[] = {3,4,8,5,7,2,3,9}
// ;
// for(int i = 0; i<arr.length; i++){
//     if( i==0){
//     arr[i] = arr[i];
// System.out.println(arr[i]) ;
// }
//   else  if(i%2==0){
//        arr[i]= arr[i]*10;
//  System.out.println(arr[i]) ;
//     }

// else{
// arr[i]  = arr[i]*2;
// System.out.println(arr[i]);
// }
// }
//     }
// }

import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,7,8,6,3,7};
           System.out.println("enter an arry");
        int key = sc.nextInt();
     
        for(int i = 0;i<arr.length; i++){
            if(arr[i]== key){
                System.out.println("Key found at index: " + i);
            }
            else{
                System.out.println("Key not found at index: " +i);
            }
        }
    }
}