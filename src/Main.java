
import java.util.ArrayList;

import com.q.entities.player.PlayerCharacter;
import com.q.magic.system.effects.DoT;

public class Main
{
	public static void main(String[] args)
	{
		PlayerCharacter pc = new PlayerCharacter();
		DoT dot = new DoT(10, pc, 5, 2, null, null);
	}
}
