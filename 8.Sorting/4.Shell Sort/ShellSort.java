public class ShellSort {

    public static void main(String args[]){
        int a[]={12,34,23,89,67,40};
        Shell(a);


    }

    public static void Shell(int arr[]){
        int k=arr.length;
        int gap=k/2;
        while (gap>=1){
            for(int i=gap;i<k;i++){
                int newElement=arr[i];
                int j=i;
                while (j>=gap && arr[j-gap]>newElement){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=newElement;
            }
            gap=gap/2;
        }

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+",");
        }
    }
}
