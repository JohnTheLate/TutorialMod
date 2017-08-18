package JTL.tutorialmod.init;

import JTL.tutorialmod.Reference;
import JTL.tutorialmod.init.armor.CustomArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmorInit {
	
	public static final ArmorMaterial tutorial_armor = EnumHelper.addArmorMaterial("tutorial", Reference.MODID + ":tutorial", 35, new int[]{3, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	
	public static Item tutorial_helmet, tutorial_chestplate, tutorial_leggins, tutorial_boots;

	public static void init() {
		tutorial_helmet = new CustomArmor("tutorial_helmet", tutorial_armor, 1, EntityEquipmentSlot.HEAD);
		tutorial_chestplate = new CustomArmor("tutorial_chestplate", tutorial_armor, 1, EntityEquipmentSlot.CHEST);
		tutorial_leggins = new CustomArmor("tutorial_leggins", tutorial_armor, 1, EntityEquipmentSlot.LEGS);
		tutorial_boots = new CustomArmor("tutorial_boots", tutorial_armor, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register() {
		registerItem(tutorial_helmet);
		registerItem(tutorial_chestplate);
		registerItem(tutorial_leggins);
		registerItem(tutorial_boots);
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
//		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
