package com.q.entities;

import java.util.ArrayList;

import com.q.magic.system.effects.ActiveEffect;

public abstract class Entity
{
	// Entity Stat Block
	private int						health;
	private int						mana;
	private int						stamina;

	private int						fireResistanceFixed;
	private int						coldResistanceFixed;
	private int						electricResistanceFixed;
	private int						acidResistanceFixed;
	private int						forceResistanceFixed;
	private int						positiveResistanceFixed;
	private int						negativeResistanceFixed;

	private double					fireResistancePercent;
	private double					coldResistancePercent;
	private double					electricResistancePercent;
	private double					acidResistancePercent;
	private double					forceResistancePercent;
	private double					positiveResistancePercent;
	private double					negativeResistancePercent;

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

	public int getFireResistanceFixed()
	{
		return fireResistanceFixed;
	}

	public void setFireResistanceFixed(int fireResistanceFixed)
	{
		this.fireResistanceFixed = fireResistanceFixed;
	}

	public int getColdResistanceFixed()
	{
		return coldResistanceFixed;
	}

	public void setColdResistanceFixed(int coldResistanceFixed)
	{
		this.coldResistanceFixed = coldResistanceFixed;
	}

	public int getElectricResistanceFixed()
	{
		return electricResistanceFixed;
	}

	public void setElectricResistanceFixed(int electricResistanceFixed)
	{
		this.electricResistanceFixed = electricResistanceFixed;
	}

	public int getAcidResistanceFixed()
	{
		return acidResistanceFixed;
	}

	public void setAcidResistanceFixed(int acidResistanceFixed)
	{
		this.acidResistanceFixed = acidResistanceFixed;
	}

	public int getForceResistanceFixed()
	{
		return forceResistanceFixed;
	}

	public void setForceResistanceFixed(int forceResistanceFixed)
	{
		this.forceResistanceFixed = forceResistanceFixed;
	}

	public int getPositiveResistanceFixed()
	{
		return positiveResistanceFixed;
	}

	public void setPositiveResistanceFixed(int positiveResistanceFixed)
	{
		this.positiveResistanceFixed = positiveResistanceFixed;
	}

	public int getNegativeResistanceFixed()
	{
		return negativeResistanceFixed;
	}

	public void setNegativeResistanceFixed(int negativeResistanceFixed)
	{
		this.negativeResistanceFixed = negativeResistanceFixed;
	}

	public double getFireResistancePercent()
	{
		return fireResistancePercent;
	}

	public void setFireResistancePercent(double fireResistancePercent)
	{
		this.fireResistancePercent = fireResistancePercent;
	}

	public double getColdResistancePercent()
	{
		return coldResistancePercent;
	}

	public void setColdResistancePercent(double coldResistancePercent)
	{
		this.coldResistancePercent = coldResistancePercent;
	}

	public double getElectricResistancePercent()
	{
		return electricResistancePercent;
	}

	public void setElectricResistancePercent(double electricResistancePercent)
	{
		this.electricResistancePercent = electricResistancePercent;
	}

	public double getAcidResistancePercent()
	{
		return acidResistancePercent;
	}

	public void setAcidResistancePercent(double acidResistancePercent)
	{
		this.acidResistancePercent = acidResistancePercent;
	}

	public double getForceResistancePercent()
	{
		return forceResistancePercent;
	}

	public void setForceResistancePercent(double forceResistancePercent)
	{
		this.forceResistancePercent = forceResistancePercent;
	}

	public double getPositiveResistancePercent()
	{
		return positiveResistancePercent;
	}

	public void setPositiveResistancePercent(double positiveResistancePercent)
	{
		this.positiveResistancePercent = positiveResistancePercent;
	}

	public double getNegativeResistancePercent()
	{
		return negativeResistancePercent;
	}

	public void setNegativeResistancePercent(double negativeResistancePercent)
	{
		this.negativeResistancePercent = negativeResistancePercent;
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
