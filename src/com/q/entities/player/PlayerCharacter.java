package com.q.entities.player;

import java.util.ArrayList;

import com.q.entities.Entity;
import com.q.magic.system.effects.ActiveEffect;

public class PlayerCharacter extends Entity
{
	public PlayerCharacter()
	{
		super.setAeArr(new ArrayList<ActiveEffect>());
	}
}
