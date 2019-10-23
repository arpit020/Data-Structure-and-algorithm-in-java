public class CountingSort {
    public static void main(String args[]){
        int a[]={2,5,9,8,2,8,7,10,4,3};
        CountSort(a,2,10);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void CountSort(int []arr,int min,int max){
        int arr1[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]-min]++;
        }

        int j=0;
        for(int i=min;i<=max;i++){
            while (arr1[i-min]>0){
                arr[j++]=i;
                arr1[i-min]--;
            }

        }

    }
}
