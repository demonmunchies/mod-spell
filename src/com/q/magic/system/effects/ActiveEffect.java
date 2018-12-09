package com.q.magic.system.effects;

// ActiveEffect is implemented as a Command Design Pattern interface
public interface ActiveEffect
{
	public void apply();
	public void remove();
}
