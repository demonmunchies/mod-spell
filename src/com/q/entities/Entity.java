package com.q.entities;

import java.util.ArrayList;

import com.q.magic.system.effects.ActiveEffect;

public abstract class Entity
{
	private ArrayList<ActiveEffect> aeArr;
	
	public ArrayList<ActiveEffect> getAeArr()
	{
		return aeArr;
	}

	public void setAeArr(ArrayList<ActiveEffect> aeArr)
	{
		this.aeArr = aeArr;
	}
}
