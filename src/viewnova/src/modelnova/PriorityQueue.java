package modelnova;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PriorityQueue {
    private Node head;
    private int totalSize;

    public PriorityQueue() {
        head = null;
        totalSize = 0;
    }
        //method for testing purposes
   /* @Override
    public String toString() {
        String rtn = "";
        if ( head == null ) {
            rtn = "<Empty>";
        } else {
            Node current = head;
            while ( current != null ) {
                rtn += "<" + current.getData() + " " + current.getPriority() + "> ";
                current = current.getNext();
            }
        }

        return rtn;
    }*/

    public void add( Person data, Priority priority ) {
        /*
        * Create a new node
        */
        Node n = new Node();
        n.setData( data );
        n.setPriority( priority );

        if ( head == null ) {
            head = n;
        } else {
            n.setNext( head );
            head.setPrev( n );
            head = n;
        }
        totalSize++;
    }

    public Person remove() {
        if ( head == null ) {
            return null;
        } else {
            // go through the list and find the last item with the largest priority
            // get the value from the map with the biggest number

            // create an map
            Map<Integer, Node> map = new HashMap<Integer, Node>();
            Node current = head;

            while ( current != null ) {
                map.put( current.getPriority(), current );
                current = current.getNext();
            }

            // then get all keys in the map,
            Set<Integer> allKeys = map.keySet();

            // find the biggest number
            Integer biggestPriority = Collections.max( allKeys );

            // get the element
            Node target = map.get( biggestPriority );

            // remove the node from the linked list
            if ( target.getPrev() == null && target.getNext() == null ) {
                // when there is only one node left
                head = null;
            } else if ( head == target ){
                head = target.getNext();
                head.setPrev( null );
            } else {
                /*
                    Connect the target's previous node to the target's next node
                    Need to avoid edge cases here
                    Cases highest priority is at ether end then the next or previous node is null and we will
                    throw a null pointer reference
                */

                if( target.getNext() != null ){
                    target.getNext().setPrev( target.getPrev() );
                }
                if( target.getPrev() != null ){
                    target.getPrev().setNext( target.getNext() );
                }
            }

            totalSize--;
            return target.getData();
        }

    }

    public int getTotalSize() {
        return totalSize; }
}
