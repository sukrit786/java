class bankcc
{
	public double k=1000;
	public synchronized  void money(char ch)
	{
		System.out.println(k);
		if(ch=='d')
		{
			k=k-100;
		}
		else if(ch=='c')
		{
			k=k+100;
		}
	}
}
public class bank {

		public static void main(String args[]) throws Exception
		{
			bankcc c1=new bankcc();
			Thread t1=new Thread(new Runnable()
					{
						public void run()
						{
							c1.money('c');
						}
					});
			Thread.sleep(10);
			Thread t2=new Thread(new Runnable()
					{
						public void run()
						{
							c1.money('d');
						}
					});
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(c1.k);
		}
}
