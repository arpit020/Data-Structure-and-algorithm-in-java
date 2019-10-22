public class InsertionSort {
    public static void main(String args[]){

        int a[]={56,45,23,89,52,12,-10};


        for(int i=1;i<a.length;i++){
            int k=a[i];
            int x=i;
            for(int j=i-1;j>=0 && a[j]>k;j--){
                    a[j+1]=a[j];
                    x=j;
            }
            a[x]=k;
        }


        for(int m=0;m<a.length;m++){
            System.out.print(a[m]+" ,");
        }
    }
}
