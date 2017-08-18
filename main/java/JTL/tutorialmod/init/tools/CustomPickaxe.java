package JTL.tutorialmod.init.tools;

import JTL.tutorialmod.TutorialMod;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {

	public CustomPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
