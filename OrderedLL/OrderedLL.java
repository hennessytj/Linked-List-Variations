import java.util.*;

public class OrderedLL
{
    private LLNode front;

    public OrderedLL()
    { front = null; }
    
    public boolean isEmpty()
    { return front == null; }

    // LIFO data structure, add to back
    public void add(int value)
    {
	// 1. Empty list
	if (isEmpty())
	    front = new LLNode(value);
	// 2. Insert at front
	else if (front.data > value)
	{
	    LLNode current = front;
	    current = new LLNode(value);
	    current.next = front;
	    front = current;
	}
	// 3. Insert between
	else
	{
	    LLNode current = front;
	    LLNode precedes = front;
	    while (value > current.data)
	    {
		precedes = current;
		current = current.next;
	    }
	}
	// 4. Insert at end
    }

    // LIFO data structure, so remove from front
    public LLNode remove()
    {
	    throw new IllegalStateException();
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
