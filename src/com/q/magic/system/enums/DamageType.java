package com.q.magic.system.enums;

import com.q.entities.Entity;

public enum DamageType
{
	FIRE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getFireResistancePercent())) - target.getFireResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	COLD
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getColdResistancePercent())) - target.getColdResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	ACID
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getAcidResistancePercent())) - target.getColdResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	ELECTRIC
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getElectricResistancePercent())) - target.getElectricResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	FORCE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getForceResistancePercent())) - target.getForceResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	POSITIVE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getPositiveResistancePercent())) - target.getPositiveResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	},
	NEGATIVE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			int totalDamage = (int)(damage * (1 - target.getNegativeResistancePercent())) - target.getNegativeResistanceFixed();
			if(totalDamage < 0)
			{
				totalDamage = 0;
			}
			return totalDamage;
		}
	};

	public int calculateDamageDealt(Entity caster, Entity target, int damage)
	{
		return 0;
	}
}
