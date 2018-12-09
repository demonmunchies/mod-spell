
import com.q.entities.player.PlayerCharacter;
import com.q.magic.system.effects.DoT;
import com.q.magic.system.engines.ActiveEffectEngine;

public class Main {

	public static void main(String[] args)
	{
		PlayerCharacter pc = new PlayerCharacter();
		DoT dot = new DoT();
		
		System.out.println(pc.getAeArr());
		
		pc.getAeArr().add(dot);
		
		System.out.println(pc.getAeArr());
		
		ActiveEffectEngine.getInstance().entityArr.add(pc);
		ActiveEffectEngine.getInstance().updateActiveEffects();
	}

}
