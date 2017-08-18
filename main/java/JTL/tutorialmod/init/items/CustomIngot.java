package JTL.tutorialmod.init.items;

import JTL.tutorialmod.TutorialMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item {
	
	public CustomIngot(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(TutorialMod.tutorialtab);
	}
}
