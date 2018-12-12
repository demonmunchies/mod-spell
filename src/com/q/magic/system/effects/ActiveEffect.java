package com.q.magic.system.effects;

import com.q.entities.Entity;
import com.q.magic.system.engines.ActiveEffectEngine;

// ActiveEffect is implemented as a Command Design Pattern interface
public abstract class ActiveEffect
{
	private int		duration;
	private Entity	target;
	private Entity	caster;

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

	public Entity getTarget()
	{
		return this.target;
	}

	public void setTarget(Entity target)
	{
		this.target = target;
	}

	public Entity getCaster()
	{
		return this.caster;
	}

	public void setCaster(Entity caster)
	{
		this.caster = caster;
	}

	public void addToActiveEffectEngine(ActiveEffect ae)
	{
		this.target.getAeArr().add(ae);
		ActiveEffectEngine.getInstance().entityArr.add(this.target);
	}
}
