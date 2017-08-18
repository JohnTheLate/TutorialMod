package JTL.tutorialmod.init;

import JTL.tutorialmod.TutorialMod;
import JTL.tutorialmod.init.blocks.CustomBlockStairs;
import JTL.tutorialmod.init.blocks.CustomIngotBlock;
import JTL.tutorialmod.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
	
	public static Block tutorial_ore;
	public static Block tutorial_block;
	public static Block tutorial_stairs;

	public static void init() {
		tutorial_ore = new CustomOre("tutorial_ore", 2.0F, 4.0F, 2);
		tutorial_block = new CustomIngotBlock("tutorial_block", 2.0F, 4.0F, 2);
		tutorial_stairs = new CustomBlockStairs("tutorial_stairs", tutorial_block.getDefaultState());
	}
	
	public static void register() {
		registerBlock(tutorial_ore);
		registerBlock(tutorial_block);
		registerBlock(tutorial_stairs);
	}
	
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(TutorialMod.tutorialtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	
	
	
//	public static void registerRenders() {
//		registerRender(tutorial_ore);
//	}
//	
//	public static void registerRender(Block block) {
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation
//		(Reference.MODID + ":" + block.getUnlocalizedName().substring(5)));
//	}
	
}
