public class ArrayList {

    int arr[];
    int size;

    ArrayList(int x){
        if(x<=0){
            System.out.println("array size must be greater than 0");
        }else{
            arr=new int[x];
        }
    }

    ArrayList(){
        arr=new int[10];

    }


    public boolean isEmpty(){

        return size==0;
    }

    public int size() {
        return size;
    }
    public void add(int x){
        if(arr.length==size){
            int bb[]=new int[2*size];
            System.arraycopy(arr,0,bb,0,size);
            arr=bb;
        }
        arr[size]=x;
        size++;
    }
    public int get(int x){
        if(x<0 || x>=size){
            throw new IndexOutOfBoundsException("index "+x+" size "+size);
        }else{
            return arr[x];
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int remove(int x){
        if(x<0 || x>=size){
            throw new IndexOutOfBoundsException("index "+x+" size "+size);
        }else{
            int kk=arr[x];
            for(int i=x-1;i<size;i++){
                arr[i]=arr[i+1];
            }
            arr[--size]=0;
            return kk;
        }
    }

    public int indexOf(int x){
        for(int i=0;i<size;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public void insertAt(int position,int value) {

        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("index "+position+" size "+size);
        } else {
            if (arr.length == size) {
                int bb[] = new int[2 * size];
                System.arraycopy(arr, 0, bb, 0, size);
                arr = bb;
            }


            for (int i = size - 1; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
            arr[position] = value;
            size++;
        }
    }
}

