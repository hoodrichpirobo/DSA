package libraries.dataStructures.linear;

import libraries.dataStructures.models.*;

public class ArrayStack<E> implements Stack<E> {
    protected E[] theArray;
    protected int top;
    protected static final int DEFAULT_CAPACITY = 50;
    
    @SuppressWarnings("unchecked")
    public ArrayStack() {
        theArray = (E[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }
    
    public void push(E e) {
        if(top + 1 == theArray.length) duplicateArray();
        top++;
        theArray[top] = e;
    }
    
    @SuppressWarnings("unchecked")
    protected void duplicateArray() {
        E[] newArray = (E[]) new Object[theArray.length * 2];
        System.arraycopy(theArray, 0, newArray, 0, top);
        theArray = newArray;
    }
    
    public E pop() {
        E res = theArray[top];
        top--;
        return res;
    }
    
    public E top() {
        return theArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for(int i = top; i >= 0; i--) res.append(theArray[i]);
        res.append("]");
        return res.toString();
    }
}