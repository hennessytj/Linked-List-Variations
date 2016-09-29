import java.util.*;

public class QueueLL
{
    private LLNode front;
    private LLNode back;

    public QueueLL()
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
    public void add(int value)
    {
	// 1. Empty list
	if (isEmpty())		// predicate method
	{
	    front = new LLNode(value);
	    back = front;
	}
	// 2. Only one node in list
	else if (front == back)
	{
	/*  
	    Using a loop with two cases, code below:
	    // 2. Insert at end
	    LLNode current = front;
	    while (current.next != null)
		current = current.next;
	    current.next = new LLNode(value);
	    back = current.next;
	*/
	    LLNode current = front;
	    current.next = new LLNode(value);
	    back = current.next;
	}   
        // 3. Insert at end
	else
	{
	    LLNode current = back;
	    current.next = new LLNode(value);
	    back = current.next;
	}
    }

    // LIFO data structure, so remove from front
    public LLNode remove()
    {
	// 1. List is empty
	if (isEmpty())
	    throw new IllegalStateException();
	// 2. List not empty; remove node at front
	LLNode retNode = front;
	front = front.next;
	return retNode;
    }

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

}
