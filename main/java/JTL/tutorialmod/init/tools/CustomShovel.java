package JTL.tutorialmod.init.tools;

import JTL.tutorialmod.TutorialMod;
import net.minecraft.item.ItemSpade;

public class CustomShovel extends ItemSpade {

	public CustomShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
