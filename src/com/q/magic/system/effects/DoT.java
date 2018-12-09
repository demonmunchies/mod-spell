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

	@Override
	public void apply()
	{
		// TODO Auto-generated method stub
		System.out.println("You got a DoT on you!");

	}

	@Override
	public void remove()
	{
		// TODO Auto-generated method stub

	}

}
