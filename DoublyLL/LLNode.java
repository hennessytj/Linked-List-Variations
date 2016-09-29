public class LLNode
{
    public int data;
    public LLNode next;
    public LLNode prev;

    // constructor
    public LLNode()
    {
	data = 1;
	next = null;
	prev = null;
    }

    public LLNode(int val)
    {
	data = val;
	next = null;
	prev = null;
    }
}
