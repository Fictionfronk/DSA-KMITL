public class MyArray{

    private int MAX_SIZE = 100000000;
    private int data[];
    private int size = 0;

    public MyArray(){
        data = new int[MAX_SIZE];
    }

    public void add(int d){
        if(size < MAX_SIZE){
            data[size++] = d;
        }
    }

    public void insert(int d, int index){
        for(int i = size; i > index; i--){
            data[i] = data[i-1];
        }
        data[index] = d;
        size++;
    }
    
    public int find(int d){
        for(int i = 0; i < size; i++){
            if(data[i]==d){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int d){
        int a = 0;
        int b = size - 1;
        while(a<=b){
            int m = (a + b) / 2;
            if(data[m]==d) return m;
            if(d<data[m]) b = m - 1;
            else a = m + 1;
        }
        return -1;
    }

    public void deleteU(int index){
        data[index] = data[--size];
    }

    public void deleteO(int index){
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        size--;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i = 0; i < size-1; i++){
            sb.append(data[i]);
            sb.append(",");
        }
        if(size < 0) sb.append(data[size-1]);
        sb.append("]");
        return sb.toString();
    }

    public int getAt(int i){
        return data[i];
    }

    public void setAt(int d, int index){
        data[index] = d;
    }

    public boolean isFull(){
        return size==MAX_SIZE;
    }

    public boolean isEmpty(){
        return size==0;
    }

}