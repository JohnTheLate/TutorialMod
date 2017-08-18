package JTL.tutorialmod.init;

import JTL.tutorialmod.TutorialMod;
import JTL.tutorialmod.init.items.CustomIngot;
import JTL.tutorialmod.init.items.CustomSnowball;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {

	public static Item tutorial_ingot;
	public static Item test_snowball;

	public static void init() {
		tutorial_ingot = new CustomIngot("tutorial_ingot");
		test_snowball = new CustomSnowball("test_snowball");
	}
	
	public static void register() {
		registerItem(tutorial_ingot);
		registerItem(test_snowball);
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(TutorialMod.tutorialtab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
//		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
