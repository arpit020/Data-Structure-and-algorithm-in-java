public class BubbleSort {
    public static void main(String args[]){
        int a[]={56,45,23,89,52};

        int count=0;


        //this methods takes the highest value in the end first
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j + 1]) {
                    count++;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

         /*
        //this method takes the smallest value in front
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

          */

        System.out.println("No of swaps :"+count);

        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+",");
        }





    }
}

