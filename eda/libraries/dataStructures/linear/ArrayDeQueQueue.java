package libraries.dataStructures.linear;

import libraries.dataStructures.models.*;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeQueQueue<E> extends ArrayDeque<E> implements Queue<E> {
    protected ArrayDeque theArray;
    
    @SuppressWarnings("unchecked")
    public ArrayDeQueQueue() {
        theArray = new ArrayDeque();
    }
    
    public void enqueue(E e) {
        theArray.add(e);
    }
    
    public E dequeue() {
        return (E) theArray.poll();
    }
    
    public E first() {  return (E) theArray.peekFirst(); }
    
    public boolean isEmpty() {  return theArray.size() == 0; }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("]");
        
        for(Integer j = 0; j < theArray.size(); j++)
            res.append(theArray.toArray()[j].toString());
            
        res.append("]");
        return res.toString();
    }
}