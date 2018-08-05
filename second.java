class blue implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
				try{Thread.sleep(1000);}catch(Exception e){};
				System.out.println("blue");
			}
	}
}
class green implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
				try{Thread.sleep(1000);}catch(Exception e){};
				System.out.println("green");
			}
	}
}
public class second {
	public static void main(String args[]) throws Exception
	{
		Runnable obj1=new blue();
		Runnable obj2=new green();
		Thread t1=new Thread(obj1,"hithread");
		Thread t2=new Thread(obj2);
		t1.start();
		System.out.println(t1.getName());
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Bye-Bye");
	}
}
