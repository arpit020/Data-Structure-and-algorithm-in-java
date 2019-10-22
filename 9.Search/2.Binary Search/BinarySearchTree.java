public class BinarySearchTree {


    //method1:: using recursion
    public static int search(int arr[],int value,int start,int end){
        if(start>=end){
            return -1;
        }
        int k=(start+end)/2;
        if(value>arr[k]){
            return search(arr,value,k+1,end);
        }else if(value<arr[k]){
            return search(arr,value,start,k);
        }else if(value==arr[k]){
            return k;
        }

        return -1;
    }

    //method 2:: using iteration
    public static int search1(int arr[],int value){
        int start=0;
        int end=arr.length;
        while (start<end){
            int midpoint=(start+end)/2;
            if(arr[midpoint]==value){
                return midpoint;
            }else if(arr[midpoint]<value){
                start=midpoint+1;
            }else{
                end=midpoint;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int a[]={12,34,56,78,90,100};
        int start=0;
        int end=a.length;
        System.out.println(search(a,101,0,end));
        System.out.println(search1(a,100));

    }
}
