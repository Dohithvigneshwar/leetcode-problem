class CustomStack {
    int[] a;
    int insertIndex;
    int capacity;
    public CustomStack(int maxSize) {
        a = new int[maxSize];
        capacity = maxSize;
    }
    public void push(int x) {
        if(insertIndex<capacity){
            a[insertIndex++] = x;
        }
    }
    public int pop() {
        if(insertIndex == 0){
            return -1;
        }
        int pop = a[insertIndex-1];
        insertIndex--;
        return pop;
    }
    public void increment(int k, int val) {
        for(int i=0;i<k;i++){
            if(i == capacity) break;
            a[i] += val;
        }
    }
}

