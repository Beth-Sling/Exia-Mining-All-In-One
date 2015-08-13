package scripts.mining.locations.osrs;

import scripts.mining.locations.Location;

import java.awt.Color;
import java.util.Map;

import com.runemate.game.api.hybrid.entities.GameObject;

public abstract class OSRSLocation extends Location{
	
	@Override
	public boolean validate(GameObject o) {
		Map<Color, Color> colors = o.getDefinition().getColorSubstitutions();
		for (int i = 0; i < ore.colors.length; i++) {
			if(colors.containsValue(ore.colors[i]) && o.getDefinition().getName().contains("Rock"))return true;
		}
		return false;

	}
}
