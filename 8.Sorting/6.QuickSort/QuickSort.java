public class QuickSort {

    public static void main(String args[]){
        int a[]={23,12,6,7,45,89,33};


        quick(a,0,a.length);

        for(int i:a){
            System.out.print(i+" ");
        }


    }

    static void quick(int arr[],int start,int end){
        if(end-start<=1){
            return;
        }

        int pivotIndex=partition(arr,start,end);
        quick(arr,start,pivotIndex);
        quick(arr,pivotIndex+1,end);
    }

    static int partition(int arr[],int start,int end){

        int pivot=arr[start];
        int i=start;
        int j=end;
        while(i<j){
            while (i<j && arr[--j]>=pivot);
            if(i<j){
                arr[i]=arr[j];
            }
            while(i<j && arr[++i]<=pivot);
            if(i<j){
                arr[j]=arr[i];
            }
        }

        arr[j]=pivot;
        return j;

    }
}
