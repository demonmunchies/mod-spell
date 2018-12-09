package com.q.entities.player;

import java.util.ArrayList;

import com.q.entities.Entity;
import com.q.magic.system.effects.ActiveEffect;

public class PlayerCharacter extends Entity
{
	private int						health;
	private int						mana;
	private int						stamina;

	public PlayerCharacter()
	{
		super.setAeArr( new ArrayList<ActiveEffect>());
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public int getMana()
	{
		return mana;
	}

	public void setMana(int mana)
	{
		this.mana = mana;
	}

	public int getStamina()
	{
		return stamina;
	}

	public void setStamina(int stamina)
	{
		this.stamina = stamina;
	}

}
