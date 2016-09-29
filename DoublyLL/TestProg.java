public class TestProg
{
    public static void main(String[] args)
    {
	DoublyLL list = new DoublyLL();
	for (int i = 1; i <= 100; i++)
	    list.add(i);
/*
	list.reversePrint();
	System.out.println(list.toString());	
	System.out.println("Front = " + list.getFront().data);
	System.out.println("Back = " + list.getBack().data);
    	list.add(42);
	System.out.println(list.toString());
	list.removeFront();
	System.out.println(list.toString());
	list.add(43);
	list.add(44);
	list.add(45);
	System.out.println(list.toString());
	System.out.println("Front = " + list.getFront());
	System.out.println("Back = " + list.getBack());
*/

	for (int i = 0; i < 10; i++)
	    list.removeFront();
	list.reversePrint();
    }
}
