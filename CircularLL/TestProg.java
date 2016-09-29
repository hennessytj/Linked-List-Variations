public class TestProg
{
    public static void main(String[] args)
    {
	QueueLL list = new QueueLL();
	for (int i = 1; i <= 100; i++)
	    list.add(i);
	System.out.println(list.toString());
    }
}
