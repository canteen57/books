/* Thread Rev */




import java.util.*;
public class thread_rev extends Thread
{
	public void run()
	{
		try
		{
			for(int i=100;i>=0;i--)
			{
				System.out.println(i);
				Thread.sleep(6000);
			}
		}
		catch(Exception e) {}
	}
	
	public static void main(String[] args) 
	{
		thread_rev ob=new thread_rev();
		ob.start();
	}

}
