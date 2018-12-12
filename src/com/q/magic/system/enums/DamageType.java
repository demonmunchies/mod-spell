package com.q.magic.system.enums;

import com.q.entities.Entity;

public enum DamageType
{
	FIRE
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getFireResistanceFixed(), target.getFireResistancePercent() };
		}
	},
	COLD
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getColdResistanceFixed(), target.getColdResistancePercent() };
		}
	},
	ACID
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getAcidResistanceFixed(), target.getAcidResistancePercent() };
		}
	},
	ELECTRIC
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getElectricResistanceFixed(), target.getElectricResistancePercent() };
		}
	},
	FORCE
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getForceResistanceFixed(), target.getForceResistancePercent() };
		}
	},
	POSITIVE
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getPositiveResistanceFixed(), target.getPositiveResistancePercent() };
		}
	},
	NEGATIVE
	{
		@Override
		public double[] damageModifiers(Entity caster, Entity target)
		{
			return new double[] { target.getNegativeResistanceFixed(), target.getNegativeResistancePercent() };
		}
	};

	public double[] damageModifiers(Entity caster, Entity target)
	{
		return null;
	}
}
