package JTL.tutorialmod.init.tools;

import JTL.tutorialmod.TutorialMod;
import net.minecraft.item.ItemHoe;

public class CustomHoe extends ItemHoe {

	public CustomHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
