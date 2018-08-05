class gg
{
 int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class third 
{
	public static void main(String args[]) throws Exception 
	{
	gg g1=new gg();
	Thread t1=new Thread(new Runnable()
			{
				public void run()
				{
					for(int i=0;i<100;i++)
					{
						g1.increment();
					}
				}
			});
	Thread t2=new Thread(new Runnable()
	{
		public void run()
		{
			for(int i=0;i<=50;i++)
			{
				g1.increment();
			}
		}
	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(g1.count);
}
}
