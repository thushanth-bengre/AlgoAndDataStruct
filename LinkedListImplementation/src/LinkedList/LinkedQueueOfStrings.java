/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Bengre
 */
public class LinkedQueueOfStrings {
    private Node first, last;

        

 private class Node
 { 
    String item;
    Node next;
 }

 public boolean isEmpty()
 { return first == null; }

    public void enqueue(String item)
    {
    Node oldlast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) first = last;
    else oldlast.next = last;
    }

    public String dequeue()
    {
    String item = first.item;
    first = first.next;
    if (isEmpty()) last = null;
    return item;
    }
}
