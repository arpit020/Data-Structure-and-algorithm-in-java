public class LinearSearch {
     public static int search(int arr[],int number){
         for(int i=0;i<arr.length;i++){
             if(arr[i]==number){
                 return i;
             }
         }
          return -1;
     }
    public static void main(String args[]){
        int[] a={23,12,56,-10,34};
        System.out.println(search(a,-10));
    }
}
