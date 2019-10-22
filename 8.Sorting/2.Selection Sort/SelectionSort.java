public class SelectionSort {
    static int count=0;

    static void swap(int aa[],int x,int y){
        if (x!=y){
            int temp=aa[x];
            aa[x]=aa[y];
            aa[y]=temp;
            count++;
        }
    }
    public static void main(String args[]){

        int a[]={56,45,23,89,52};
        for(int i=a.length-1;i>0;i--){
             int largest=0;
            for(int k=0;k<=i;k++){
                if(a[largest]<a[k]){
                    largest=k;
                }
            }

        swap(a,i,largest);

        }

        System.out.println("No of counts :"+count);

        for(int m=0;m<a.length;m++){
            System.out.print(a[m]+" ,");
       }
    }
}
