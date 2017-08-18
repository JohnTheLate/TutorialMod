package JTL.tutorialmod.init.blocks;

import net.minecraft.block.Block;

public class CustomIngotBlock extends CustomBlock {
	
	public CustomIngotBlock(String name, float hardness, float resistance, int harvestLevel) {
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
}
