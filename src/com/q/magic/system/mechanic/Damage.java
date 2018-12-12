package com.q.magic.system.mechanic;

import com.q.entities.Entity;
import com.q.magic.system.enums.DamageType;

public class Damage implements Mechanic
{
	private Entity		target;
	private Entity		caster;
	private DamageType	dmgType;

	private int			damage;

	public Damage(Entity target, Entity caster, DamageType dmgType, int damage)
	{
		this.target = target;
		this.caster = caster;
		this.dmgType = dmgType;
		this.damage = damage;

		apply();
	}

	@Override
	public void apply()
	{
		double[] mod = this.dmgType.damageModifiers(this.caster, this.target);

		int damageDealt = (int) ((this.damage * (1 - mod[1])) - mod[0]);

		this.target.setHealth(this.target.getHealth() - damageDealt);
	}

}
