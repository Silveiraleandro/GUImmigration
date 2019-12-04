package viewnova;

import modelnova.Person;
import modelnova.Priority;
import modelnova.PriorityQueue;

public class App
{
    public static void main( String[] args ){

        PriorityQueue pq = new PriorityQueue();

        Person p = new Person("Tom", "beet", "iii" );
        pq.add(p, Priority.HIGH);
        Person p2 = new Person("Tom2", "beet", "iii" );
        pq.add(p2, Priority.LOW);
        Person p3 = new Person("Tom3", "beet", "iii" );
        pq.add(p3, Priority.MEDIUM);
        Person p4 = new Person("Tom4", "beet", "iii" );
        pq.add(p4, Priority.LOW);
        Person p5 = new Person("Tom5", "beet", "iii" );
        pq.add(p5, Priority.HIGH);
        Person p6 = new Person("Tom6", "beet", "iii" );
        pq.add(p6, Priority.MEDIUM);
        Person p7 = new Person("Tom7", "beet", "iii" );
        pq.add(p7, Priority.HIGH);


        System.out.println(pq.getTotalSize());

        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        System.out.println(pq);

        System.out.println(pq.getTotalSize());
    }
}
