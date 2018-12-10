
import com.q.entities.player.PlayerCharacter;
import com.q.magic.system.effects.DoT;
import com.q.magic.system.engines.ActiveEffectEngine;
import com.q.magic.system.enums.DamageType;
import com.q.magic.system.enums.DescriptorType;
import com.q.magic.system.enums.SchoolType;

public class Main
{
	public static void main(String[] args)
	{
		PlayerCharacter pc = new PlayerCharacter();
		DoT dot = new DoT(10, pc, 5, 2, null, null);
	}
}
