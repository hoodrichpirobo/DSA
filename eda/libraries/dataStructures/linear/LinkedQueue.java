package libraries.dataStructures.linear;

import libraries.dataStructures.linear.*;
import libraries.dataStructures.models.*;

public class LinkedQueue<E> implements Queue<E> {
    protected LinkedNode<E> qBegin, qEnd;
    protected int size;
    
    public LinkedQueue() {
        qBegin = qEnd = null;
        size = 0;
    }
    
    public void enqueue(E e) {
        LinkedNode<E> nuevo = new LinkedNode<E>(e);
        if(qBegin == null) qBegin = nuevo;
        else qEnd.next = nuevo;
        qEnd = nuevo;
        size++;
    }
    
    public E dequeue() {
        E dataS = qBegin.data;
        qBegin = qBegin.next;
        if( qBegin == null ) qEnd = null;
        size--;
        return dataS;
    }
    
    public E first() {
        return qBegin.data;
    }
    
    public boolean isEmpty() {
        return (qBegin == null);
    }
    
    public String toString() {
        String res = "";
        for(LinkedNode<E> aux = qBegin; aux != null; aux = aux.next)
            res += aux.data.toString()+"|";
        return res;
    }
}