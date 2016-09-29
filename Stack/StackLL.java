import java.util.*;

public class StackLL
{
    private LLNode front;

    public StackLL()
    { front = null; }
    
    // adds a node to front of list
    public void push(int value)
    {
	if (front == null)
		front = new LLNode(value); 
	else
	{
	    LLNode current = front;
	    front = new LLNode(value);
	    front.next = current;
	}
    }

    // removes node from front
    public LLNode pop()
    {
	if (front == null)
	    throw new EmptyStackException();
	LLNode retNode = front;
	front = front.next;
	return retNode;
    }

    public void print()
    { 
	int i = 0;
	for (LLNode current = front; current != null; current = current.next)
	{
	    System.out.printf("%3d ", current.data);
	    if ((i+1) % 10 == 0)
		System.out.println();
	    i++;
	}
    }
}
