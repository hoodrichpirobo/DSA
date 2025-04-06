package libraries.dataStructures.linear;

import libraries.dataStructures.models.*;

public class LinkedStack<E> implements Stack<E> {
        
    protected LinkedNode<E> top;
    protected int size;

    /** creates an empty Stack **/
    public LinkedStack() {
        /*TO BE COMPLETED*/
        LinkedNode<E> top = null;
        size = 0;
    }
      
    /** pushes an Element e onto a Stack, or places it at its top **/
    public void push(E e) {
        /*TO BE COMPLETED*/
        top = new LinkedNode<E>(e, top);
        size++;
    }
      
    /** IFF !isEmpty():
     * obtains and removes from a list the Element at its top
     */
    public E pop() {
        /*TO BE CHANGED AND COMPLETED*/
        E dataS = top.data;
        top = top.next;
        size--;
        return dataS;
    }
      
    /** IFF !isEmpty():
     * obtains the Element at the top of a Stack
     */
    public E top() {
        /*CHANGE THIS*/
        return top.data;
    }
      
    /** checks whether a Stack is empty **/
    public boolean isEmpty() {
        /*CHANGE THIS*/
        return (top == null);
    }
      
    /** returns a String with the Elements of a Stack in LIFO order,
     * or the reverse of its insertion order, with the format used
     * in Java's standard. Thus, if a Stack contains Integers from 1 to 4,
     * in LIFO order, toString returns [4, 3, 2, 1]; if the Stack is
     * empty, then returns []
     */
    public String toString() { 
        StringBuilder res = new StringBuilder();
        res.append("["); 
        /*TO BE COMPLETED*/
        for(LinkedNode<E> aux = top; aux != null; aux = aux.next) res.append(aux.data.toString() + "|");
        res.append("]");
        return res.toString(); 
    }
}