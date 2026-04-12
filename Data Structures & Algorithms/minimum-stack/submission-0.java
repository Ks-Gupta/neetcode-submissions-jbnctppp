class MinStack {

    private Stack<Integer> st = new Stack<>();
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int mini = st.peek();

        while(!st.isEmpty()){
            mini = Math.min(mini,st.peek());
            tmp.push(st.pop());
        }

        while(!tmp.isEmpty()){
            st.push(tmp.pop());
        }

        return mini;
    }
}
