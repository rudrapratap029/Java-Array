public class merge2sortArray {

   static void merge(int[]c , int[]a, int[]b){
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            c[k]= a[i];
            k++;
            i++;
           }
           else{
            c[k] = b[j];
            k++;
            j++;

           }

           if(i==a.length){
             while(j<b.length){
                c[k]=b[j];
                k++;
                j++;

             }
           }
           else{
            if(j==b.length){
                while(i<a.length){
                    c[k]=a[i];
                    k++;
                    i++;
                }
            }
           }
  
      }
   }
    

 public static void main (String[] args){

int a [] = {2,5,7,13,15,58};
int b[]= {1,5,6,15,18,25,27,45,95};
int c [] =  new int [ a.length + b.length];
for(int ele : c)  System.out.println(ele + " ");
 System.out.println();
 merge(c,a,b);
 for(int ele : c)  System.out.println(ele + " ");
 System.out.println();


}
}

