class hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
				try{Thread.sleep(1000);}catch(Exception e){};
				System.out.println("hi");
			}
	}
}
class hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
			try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println("hello");
			}
	}
}
public class first {
	public static void main(String args[])
	{
		hi h=new hi();
		hello h2=new hello();
		h.start();
		try{Thread.sleep(10);}catch(Exception e){}
		h2.start();
	}
}
