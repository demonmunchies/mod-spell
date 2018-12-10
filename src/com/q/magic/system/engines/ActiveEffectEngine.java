package com.q.magic.system.engines;

import java.util.ArrayList;
import com.q.entities.Entity;
import com.q.magic.system.effects.ActiveEffect;

// This class acts as the engine that handles the application of active effects.
// This class is implemented as a Singleton
public class ActiveEffectEngine
{
	public ArrayList<Entity>				entityArr;
	public ActiveEffectThread				aeeThread;
	private static final ActiveEffectEngine	INSTANCE	= new ActiveEffectEngine();

	private ActiveEffectEngine()
	{
		this.entityArr = new ArrayList<Entity>();
		this.aeeThread = new ActiveEffectThread();
		this.aeeThread.start();
	}

	public static synchronized ActiveEffectEngine getInstance()
	{
		return INSTANCE;
	}

	// This method updates every active effect in the game space.
	public synchronized void updateActiveEffects()
	{
		// A new array is created so that old entities can be removed.
		// This array is added to if the current entity will still have active effects.
		// Avoids concurrency issues.
		ArrayList<Entity> tempEntity = new ArrayList<Entity>();

		// Iterates through all entities in the entity array list.
		for (Entity e : this.entityArr)
		{
			// Much like the tempEntity list, this one is so that active effects with 0
			// duration are removed.
			ArrayList<ActiveEffect> tempEffect = new ArrayList<ActiveEffect>();
			// Iterates through all active effects on the given entity
			for (ActiveEffect ae : e.getAeArr())
			{
				// If the duration is greater than 0, the effect is applied.
				if (ae.getDuration() >= 0)
				{
					// Effect applied
					ae.apply();
					//System.out.println("Effect Applied!");
					// Adds the active effect back into the temp array to then be calculated next
					// cycle
					tempEffect.add(ae);
				}
				// The duration was 0 or below
				else
				{
					// The active effect has its remove() method called
					ae.remove();
					//System.out.println("Effect Removed!");

				}
				// Decrements the duration
				ae.setDuration(ae.getDuration() - 1);
			}
			// Updates the entities' active effects list to only have the effects with
			// durations left
			e.setAeArr(tempEffect);
			// If there are more active effects affecting the entity, the entity is added
			// back into the array list of entites with active effects.
			if (!e.getAeArr().isEmpty())
			{
				// The entity is added
				tempEntity.add(e);
			}
		}
		// The array list is upated to hold all entities that still have active effects
		this.entityArr = tempEntity;
	}
}
