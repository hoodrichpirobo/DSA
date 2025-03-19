package libraries.dataStructures.linear;

/**
 * Write a description of class SortedLinkedListPOI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortedLinkedListPOI<E extends Comparable<E>> extends LinkedListPOI<E>
{
    @Override
    public void add(E e) {
        this.begin();
        
        while(!this.isEnd() && this.get().compareTo(e) < 0){
            this.next();
        }
        
        super.add(e);
    }
}
