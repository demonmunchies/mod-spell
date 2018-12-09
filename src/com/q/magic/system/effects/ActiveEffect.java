package com.q.magic.system.effects;

import com.q.entities.Entity;

// ActiveEffect is implemented as a Command Design Pattern interface
public abstract class ActiveEffect
{
	private int duration;
	private Entity target;
	
	public abstract void apply();
	public abstract void remove();
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
}
