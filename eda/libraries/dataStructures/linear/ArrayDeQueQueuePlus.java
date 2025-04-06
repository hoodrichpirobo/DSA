package libraries.dataStructures.linear;
import libraries.dataStructures.models.*;

public class ArrayDeQueQueuePlus<E> extends ArrayDeQueQueue<E> implements QueuePlus<E> {
    public int size() {
        return theArray.size();
    }
    
    public void reverse(){}
}