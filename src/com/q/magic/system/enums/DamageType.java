package com.q.magic.system.enums;

import com.q.entities.Entity;

public enum DamageType
{
	FIRE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	COLD
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	ACID
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	ELECTRICITY
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	FORCE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	POSITIVE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	NEGATIVE
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	},
	POISON
	{
		@Override
		public int calculateDamageDealt(Entity caster, Entity target, int damage)
		{
			return 0;
		}
	};
	
	public int calculateDamageDealt(Entity caster, Entity target, int damage)
	{
		return 0;
	}
}
