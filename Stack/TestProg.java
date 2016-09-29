public class TestProg
{
    public static void main(String[] args)
    {
	LinkedList list = new LinkedList();
	LinkedList rlist = new LinkedList();
	for (int i = 1; i <= 100; i++)
	    list.push(i);

	for (int i = 1; i <= 101; i++)
	{
	    list.pop();
	}

	list.print();
    }
}
