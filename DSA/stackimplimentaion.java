package DSA;

class Stack {
    int top = -1;
    int size = 5;
    int[] arr = new int[size];

    void push(int x) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else
            arr[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + arr[top--]);
    }
}

class stackimplimentaion {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.pop();
    }
}