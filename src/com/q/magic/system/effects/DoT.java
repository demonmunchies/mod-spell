package com.q.magic.system.effects;

import com.q.entities.Entity;
import com.q.magic.system.enums.DamageType;
import com.q.magic.system.enums.DescriptorType;

public class DoT extends ActiveEffect
{

	private DamageType			dmgType;
	private DescriptorType[]	descArr;
	private int					timeInterval	= 1;
	private int					damage;

	public DoT(int duration, Entity target, int damage, int timeInterval, DamageType dmgType, DescriptorType[] descArr)
	{
		super.setDuration(duration);
		super.setTarget(target);
		this.damage = damage;
		this.timeInterval = timeInterval;
		this.dmgType = dmgType;
		this.descArr = descArr;

		addToActiveEffectEngine(this);
	}

	// Damage over Time effects only apply on specified time intervals, so apply
	// only deals damage when duration % time interval == 0
	@Override
	public void apply()
	{
		if (this.getDuration() % this.timeInterval == 0)
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

	@Override
	public void calculate()
	{
		// TODO Write code for resistance against

	}

}
