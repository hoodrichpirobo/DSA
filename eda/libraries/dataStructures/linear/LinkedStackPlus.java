package libraries.dataStructures.linear;

import libraries.dataStructures.models.*;

public class LinkedStackPlus<E> extends LinkedStack<E> implements StackPlus<E> {
    public E base() {
        LinkedNode<E> aux = top;
        while(aux.next != null) aux = aux.next;
        return aux.data;
    }
    
    // public E base() {
        // E res, aux = pop();
        // if(isEmpty()) res = aux;
        // else res = base();
        // push(aux);
        // return res;
    // }
}