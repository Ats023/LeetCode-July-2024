class CustomStack {
    int[] al;
    int capacity, size;
    
    public CustomStack(int maxSize) {
        al = new int[maxSize];
        capacity = maxSize;
        size = 0;
    }
    
    public void push(int x) {
        if(size==capacity) return;
        al[size++]=x;
    }
    
    public int pop() {
        if(size==0) return -1;
        return al[--size];
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<size; i++) al[i]+=val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */