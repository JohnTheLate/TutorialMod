package JTL.tutorialmod.init;

import JTL.tutorialmod.Reference;
import JTL.tutorialmod.init.tools.CustomAxe;
import JTL.tutorialmod.init.tools.CustomHoe;
import JTL.tutorialmod.init.tools.CustomPickaxe;
import JTL.tutorialmod.init.tools.CustomShovel;
import JTL.tutorialmod.init.tools.CustomSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit {
	public static final ToolMaterial tutorial_tool = EnumHelper.addToolMaterial("tutorial", 3, 1200, 7.0F, 2.5F, 8);
	
	public static Item tutorial_pickaxe, tutorial_axe, tutorial_hoe, tutorial_shovel, tutorial_sword;

	public static void init() {
		tutorial_pickaxe = new CustomPickaxe("tutorial_pickaxe", tutorial_tool);
		tutorial_axe = new CustomAxe("tutorial_axe", tutorial_tool);
		tutorial_hoe = new CustomHoe("tutorial_hoe", tutorial_tool);
		tutorial_shovel = new CustomShovel("tutorial_shovel", tutorial_tool);
		tutorial_sword = new CustomSword("tutorial_sword", tutorial_tool);
	}
	
	public static void register() {
		registerItem(tutorial_pickaxe);
		registerItem(tutorial_axe);
		registerItem(tutorial_hoe);
		registerItem(tutorial_shovel);
		registerItem(tutorial_sword);
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
//		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
