package applications.census;

import libraries.dataStructures.models.ListPOI;
import libraries.dataStructures.linear.LinkedListPOI;
import libraries.dataStructures.linear.SortedLinkedListPOI;

/**
 * VoterList: represents a list of residents registered in
 *            the census, and, thus, voters
 *
 * @author  EDA Professors
 * @version September 2023 (Translation Feb. 24)
 */

public class VoterList {

    private ListPOI<Resident> census;
    private int size;

    /**
     * Field getter methods
     */
    public ListPOI<Resident> getCensus() { return census; }
    public int getSize() { return size; }

    /**
     * Returns the String that represents a VoterList
     *
     * @return the String with the VoterList in the given textual format.
     */
    public String toString() {
        String res = "";
        if (size == 0) return res;
        census.begin();
        for (int pos = 0; pos <= census.size() - 2; pos++) {
            res += census.get() + ", \n";
            census.next();
        }
        res += census.get();
        return res;
    }

    /**
     * Creates a VoterList...
     *
     * @param sorted A boolean that shows whether the census must be
     *               sorted in ascending order (true) or not (false).
     * @param n     An int that shows the size (number of elements) of the list
     */
    public VoterList(boolean sorted, int n) {
        size = n;
        // TO BE COMPLETED
        if(sorted) census = new SortedLinkedListPOI<>();
        else census = new LinkedListPOI<>();

        census.begin();
        while(census.size() < size){
            Resident r = new Resident();
            if(index(r) == -1) census.add(r);
        }
    }

    /**
     * Returns the index or position of Resident r in a VoterList,
     * or -1 if r doesn't belong to the list.
     *
     * @param r a Resident
     * @return r's index in a census, an int, 0 or positive
     *         if r is in the census, or -1 otherwise.
     */
    protected int index(Resident r) {
        // TO BE COMPLETED
        census.begin();
        for(int i = 0; i < census.size(); i++){
            if(census.get().equals(r)) return i;
            census.next();
        }
        
        return -1;
    }

    public VoterList getLocalCensus(int pc1, int pc2){
        VoterList ans = new VoterList(census instanceof SortedLinkedListPOI, 0);
        census.begin();
        for(int i = 0; i < census.size(); i++){
            Resident r = census.get();
            int thisPC = r.getPC();
            if(pc1 <= thisPC && thisPC <= pc2){
                ans.getCensus().add(r);
                ans.size++;
            }
            census.next();
        }
        
        return ans;
    }
    
    public VoterList search(String prefix){
        VoterList ans = new VoterList(census instanceof SortedLinkedListPOI, 0);
        census.begin();
        for(int i = 0; i < census.size(); i++){
            Resident r = census.get();
            if(r.getSurname1().startsWith(prefix) || r.getSurname2().startsWith(prefix)){
                ans.getCensus().add(r);
                ans.size++;
            }
            census.next();
        }
        
        return ans;
    }
}