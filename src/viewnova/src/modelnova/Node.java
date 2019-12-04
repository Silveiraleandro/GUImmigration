package modelnova;


public class Node
{

    private Person data;
    private Priority priority;
    private Node next;
    private Node prev;

    /* SETTERS */

    public void setData( Person data ) {
        this.data = data;
    }

    public void setPrev( Node prev ) {

        this.prev = prev;
    }

    public void setNext( Node next ) {

        this.next = next;
    }

    public void setPriority( Priority priority ) {

       this.priority = priority;

    }

    /* GETTERS */

    public Person getData() {

        return data;
    }

    public Node getNext() {

        return next;
    }

    public Node getPrev() {

        return prev;
    }

    public int getPriority() {

        return priority.getPriority();
    }
}
