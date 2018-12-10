package com.q.magic.system.engines;

public class ActiveEffectThread extends Thread
{
	public ActiveEffectThread()
	{
		System.out.println("Thread made!");
	}

	synchronized public void run()
	{
		while (true)
		{
			ActiveEffectEngine.getInstance().updateActiveEffects();
			try
			{
				wait(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
