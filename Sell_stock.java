public class Sell_stock {
    public static void main(String[] args){
        int arr[] = {4,2,5,7,9,5,3};
        int min_price = arr[0];
        int max_price=0;
        for(int i = 1; i<arr.length ; i++){
         if(arr[i]<min_price){
            min_price = arr[i];
         }
         int profit = arr[i] - min_price;

         if(max_price <profit){
            max_price = profit;

         }
       }

       System.out.println(max_price);

    }
}