package com.q.magic.system.effects;

import javax.management.Descriptor;

import com.q.magic.system.enums.DamageType;

public class DoT extends ActiveEffect
{
	
	private DamageType dmgType;
	private Descriptor[] descArr;
	private int timeInterval;
	private int damage;
	
	public DoT()
	{
		super.setDuration(3);
	}

	// Damage over Time effects only apply on specified time intervals, so apply only deals damage when duration % time interval == 0
	@Override
	public void apply()
	{
		if(this.getDuration() % this.timeInterval == 0)
		{
			System.out.println("Damage dealt!");
			// TODO Deal damage in DoT Class
		}
	}

	@Override
	public void remove()
	{
		// Nothing special is done when a DoTis removed
	}

}
