/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.AbstractQueue;
import java.util.Queue;

/**
 *
 * @author Bengre
 */
public class TestLinkedQueueOfStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedQueueOfStrings lq = new LinkedQueueOfStrings();
        boolean isEmpty = lq.equals(lq);
        System.out.println("The Linked list is empty: " +isEmpty);
        lq.enqueue("This");
        System.out.println("Added 'This' to the linked list");
        lq.enqueue("is");
        System.out.println("Added 'is' to the linked list");
        lq.enqueue("a");
        System.out.println("Added 'a' to the linked list");
        lq.enqueue("linked");
        System.out.println("Added 'linked' to the linked list");
        lq.enqueue("list");
        System.out.println("Added 'list' to the linked list");
        System.out.println("Dequeueing '" +lq.dequeue() + "' from the Linked list");
        lq.enqueue("again");
        System.out.println("Added 'again' to the linked list");
        System.out.println("Dequeueing '" +lq.dequeue() + "' from the Linked list");
        System.out.println("Dequeueing '" +lq.dequeue() + "' from the Linked list");
        boolean isEmptyagain = lq.equals(lq);
        System.out.println("The Linked list is empty: " +isEmptyagain);
    }
    
}
