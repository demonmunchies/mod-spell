
import java.util.ArrayList;

import com.q.entities.player.PlayerCharacter;
import com.q.magic.system.effects.DoT;
import com.q.magic.system.engines.ActiveEffectEngine;
import com.q.magic.system.enums.DamageType;

public class Main
{
	public static void main(String[] args)
	{
		ActiveEffectEngine.initialize();
		PlayerCharacter pc = new PlayerCharacter();
		pc.setHealth(100);
		DoT dot = new DoT(10, pc, 5, 2, DamageType.FIRE, null);
	}
}
