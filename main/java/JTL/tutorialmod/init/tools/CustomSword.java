package JTL.tutorialmod.init.tools;

import JTL.tutorialmod.TutorialMod;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	public CustomSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
