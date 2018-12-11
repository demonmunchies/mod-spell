package com.q.entities;

import java.util.ArrayList;

import com.q.magic.system.effects.ActiveEffect;

public abstract class Entity
{
	// Entity Stat Block
	private int						health;
	private int						mana;
	private int						stamina;

	private int						fireResistance;
	private int						coldResistance;
	private int						electricResistance;
	private int						acidResistance;
	private int						forceResistance;
	private int						positiveResistance;
	private int						negativeResistance;

	// Entity Active Effects
	private ArrayList<ActiveEffect>	aeArr;

	// Entity Abstract Methods
	// TODO FIll out Entity Abstract Methods

	// Entity Getters / Setters
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

	public int getFireResistance()
	{
		return fireResistance;
	}

	public void setFireResistance(int fireResistance)
	{
		this.fireResistance = fireResistance;
	}

	public int getColdResistance()
	{
		return coldResistance;
	}

	public void setColdResistance(int coldResistance)
	{
		this.coldResistance = coldResistance;
	}

	public int getElectricResistance()
	{
		return electricResistance;
	}

	public void setElectricResistance(int electricResistance)
	{
		this.electricResistance = electricResistance;
	}

	public int getAcidResistance()
	{
		return acidResistance;
	}

	public void setAcidResistance(int acidResistance)
	{
		this.acidResistance = acidResistance;
	}

	public int getForceResistance()
	{
		return forceResistance;
	}

	public void setForceResistance(int forceResistance)
	{
		this.forceResistance = forceResistance;
	}

	public int getPositiveResistance()
	{
		return positiveResistance;
	}

	public void setPositiveResistance(int positiveResistance)
	{
		this.positiveResistance = positiveResistance;
	}

	public int getNegativeResistance()
	{
		return negativeResistance;
	}

	public void setNegativeResistance(int negativeResistance)
	{
		this.negativeResistance = negativeResistance;
	}

	public ArrayList<ActiveEffect> getAeArr()
	{
		return aeArr;
	}

	public void setAeArr(ArrayList<ActiveEffect> aeArr)
	{
		this.aeArr = aeArr;
	}

}
