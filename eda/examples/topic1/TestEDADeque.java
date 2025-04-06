package examples.topic1;

import libraries.dataStructures.linear.*;
import libraries.dataStructures.models.*;

public class TestEDADeque {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayQueue<Integer>();
        
        int sizeQ = 0;
        System.out.println("Created Queue with " + sizeQ + " Integer, q = " + q.toString());
        q.enqueue(new Integer(10));
        sizeQ++;
        q.enqueue(new Integer(20));
        sizeQ++;
        q.enqueue(new Integer(30));
        sizeQ++;
        System.out.println("Current Queue = " + q.toString());
        System.out.println("Using other methods to display your data the result is...");
        String dataQ = "";
        while(!q.isEmpty()) {
            Integer first = q.first();
            if(first.equals(q.dequeue())) dataQ += first + " ";
            else dataQ += "ERROR ";
            sizeQ--;
        }
        System.out.println(" the same, " + dataQ + ", BUT q is empty, q = " + q.toString());
    }
}