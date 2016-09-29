import java.util.*;

public class DoublyLL
{
    private LLNode front;
    private LLNode back;

    public DoublyLL()
    {
	front = null;
	back = null;
    }
    
    // returned LLNode can be null
    public LLNode getFront()
    { return front; }

    // returned LLNode can be null
    public LLNode getBack()
    { return back; }

    public boolean isEmpty()
    { return front == null; }

    // LIFO data structure, add to back
    // pre: list has been instantiated
    // post: a new node is added to list
    public void add(int value)
    {
	// 1. Empty
	if (isEmpty())
	{
	    // next = null & prev = null
	    front = new LLNode(value);
	    back = front;
	}
	// 2. Only one node
	else if (front == back)
	{
	    front.next = new LLNode(value);
	    front.next.prev = front;
	    back = front.next;
	}
	// 3. More than one node, insert at end
	else
	{
	    LLNode current = back;
	    current.next = new LLNode(value);
	    current.next.prev = current;
	    back = current.next;
	}
    }

    // Removes node at front
    // pre: list is instantiated and is not empty
    // post: node is removed from front and returned
    public LLNode removeFront()
    {
	// 1. List is empty
	if (isEmpty())
	    throw new IllegalStateException("Attempt to remove node from empty list");
	// 2. Only one node in list
	else if (front == back)
	{
	    LLNode retNode = front;
	    front = null;
	    back = front;
	    return retNode;
	}
	// 3. List contains more than one node; remove node at front
	else
	{
	    LLNode retNode = front;
	    front = front.next;
	    front.prev = null;
	    return retNode;
	}
    }

    // Print list from back to front
    // pre: list has been instantiated
    // post: list is printed out in reverse order
    public void reversePrint()
    {
	// 1. Empty list
	if (isEmpty())
	    System.out.println("Empty List");
	// 2. List not empty
	int i = 0;
	for (LLNode current = back; current != null; current = current.prev)
	{
	    System.out.printf("%3d ", current.data);
	    if ((i + 1) % 10 == 0)
		System.out.println();
	    i++;
	}
	System.out.println();
    }
	
    // Return list as a String
    // pre: list has been instantiated
    // post: properly formatted string is returned
    public String toString()
    {
	// 1. Empty list
	if (isEmpty())
	    return "[]";
	// 2. List not empty
	LLNode current = front;
	String stringList = "[" + current.data;
	while (current.next != null)
	{
	    current = current.next;
	    stringList += ", " + current.data;
	}
	stringList += "]";
	return stringList;
    }
} // end of DoublyLL class
