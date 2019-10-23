public class MergeSort {

    public static void main(String args[]){
        int a[]={45,23,12,67,40};

        mergeSort(a,0,a.length);
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+",");
        }

    }

    public static void mergeSort(int arr[],int start,int end){
        if(end-start<2){
            return;
        }

        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[],int start,int mid,int end){
        if(arr[mid-1]<arr[mid]){
            return;
        }

        int i=start;
        int j=mid;
        int tempIndex=0;
        int temp[]=new int[end-start];

        while (i<mid &&  j<end){
            temp[tempIndex++]=arr[i]<=arr[j] ? arr[i++]:arr[j++];
        }
        System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
        System.arraycopy(temp,0,arr,start,tempIndex);

    }
}
