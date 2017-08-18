package JTL.tutorialmod.handlers;

import JTL.tutorialmod.gen.TutorialOreGen;
import JTL.tutorialmod.init.ArmorInit;
import JTL.tutorialmod.init.BlockInit;
import JTL.tutorialmod.init.EntityInit;
import JTL.tutorialmod.init.ItemInit;
import JTL.tutorialmod.init.ToolInit;
import JTL.tutorialmod.init.entity.projectile.EntityCustomSnowball;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {

	public static void Client() {
		//BlockInit.registerRenders();
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
		
//		RenderingRegistry.registerEntityRenderingHandler(EntityCustomSnowball.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), ItemInit.test_snowball,  Minecraft.getMinecraft().getRenderItem()));
	}
	
	public static void Common() {
		ItemInit.init();
		ItemInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
//		EntityRegistry.registerModEntity(EntityCustomSnowball.class, "Test Snowball", 0, , 64, 10, true);
		
		GameRegistry.registerWorldGenerator(new TutorialOreGen(), 0);
	}
}
