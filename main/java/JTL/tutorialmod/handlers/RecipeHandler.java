package JTL.tutorialmod.handlers;

import JTL.tutorialmod.init.ArmorInit;
import JTL.tutorialmod.init.BlockInit;
import JTL.tutorialmod.init.ItemInit;
import JTL.tutorialmod.init.ToolInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCrafting() {
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:tutorial_ore"), new ResourceLocation("tm:tutorial_blocks"), 
			new ItemStack(BlockInit.tutorial_ore), new Object[] {"SSS","SIS","SSS",'S',Blocks.STONE,'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapelessRecipe(new ResourceLocation("tm:test_snowball"), new ResourceLocation("tm:tutorial_items"), 
			new ItemStack(ItemInit.test_snowball, 8), new Ingredient[]{Ingredient.fromItem(ItemInit.tutorial_ingot)});
		
		registerToolCrafting(ToolInit.tutorial_axe, ToolInit.tutorial_hoe, ToolInit.tutorial_pickaxe, ToolInit.tutorial_shovel, ToolInit.tutorial_sword, ItemInit.tutorial_ingot);
		registerArmorCrafting(ArmorInit.tutorial_helmet,ArmorInit.tutorial_chestplate,ArmorInit.tutorial_leggins,ArmorInit.tutorial_boots,ItemInit.tutorial_ingot);
	}
	
	public static void registerSmelting() {
		GameRegistry.addSmelting(BlockInit.tutorial_ore, new ItemStack(ItemInit.tutorial_ingot), 10);
	}
	
	private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot) {

		GameRegistry.addShapedRecipe(new ResourceLocation(""+axe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(axe), new Object[] {"II ","IS "," S ",'S',Items.STICK,'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+hoe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(hoe), new Object[] {"II"," S"," S",'S',Items.STICK,'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+pickaxe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(pickaxe), new Object[] {"III"," S "," S ",'S',Items.STICK,'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+shovel.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(shovel), new Object[] {"I","S","S",'S',Items.STICK,'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+sword.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(sword), new Object[] {"I","I","S",'S',Items.STICK,'I',ItemInit.tutorial_ingot});
	}
	
	private static void registerArmorCrafting(Item helmet, Item chestplate, Item leggins, Item boots, Item ingot) {

		GameRegistry.addShapedRecipe(new ResourceLocation(""+helmet.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(helmet), new Object[] {"III","I I",'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+chestplate.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(chestplate), new Object[] {"I I","III","III",'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+leggins.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(leggins), new Object[] {"III","I I","I I",'I',ItemInit.tutorial_ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation(""+boots.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), 
			new ItemStack(boots), new Object[] {"I I","I I",'I',ItemInit.tutorial_ingot});	
	}
}
