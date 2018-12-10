package com.q.entities;

import java.util.ArrayList;

import com.q.magic.system.effects.ActiveEffect;

public abstract class Entity
{
	// Entity Stat Block
	private int						health;
	private int						mana;
	private int						stamina;

	private double					fireResistance;
	private double					coldResistance;
	private double					electricResistance;
	private double					acidResistance;
	private double					forceResistance;
	private double					positiveResistance;
	private double					negativeResistance;

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

	public double getFireResistance()
	{
		return fireResistance;
	}

	public void setFireResistance(double fireResistance)
	{
		this.fireResistance = fireResistance;
	}

	public double getColdResistance()
	{
		return coldResistance;
	}

	public void setColdResistance(double coldResistance)
	{
		this.coldResistance = coldResistance;
	}

	public double getElectricResistance()
	{
		return electricResistance;
	}

	public void setElectricResistance(double electricResistance)
	{
		this.electricResistance = electricResistance;
	}

	public double getAcidResistance()
	{
		return acidResistance;
	}

	public void setAcidResistance(double acidResistance)
	{
		this.acidResistance = acidResistance;
	}

	public double getForceResistance()
	{
		return forceResistance;
	}

	public void setForceResistance(double forceResistance)
	{
		this.forceResistance = forceResistance;
	}

	public double getPositiveResistance()
	{
		return positiveResistance;
	}

	public void setPositiveResistance(double positiveResistance)
	{
		this.positiveResistance = positiveResistance;
	}

	public double getNegativeResistance()
	{
		return negativeResistance;
	}

	public void setNegativeResistance(double negativeResistance)
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
