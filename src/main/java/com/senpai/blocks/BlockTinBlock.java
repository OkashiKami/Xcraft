package com.senpai.blocks;

import com.senpai.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

/**
 * A block of tin, similar to an iron block
 * @author CJMinecraft
 *
 */
public class BlockTinBlock extends BlockBase {
	
	/**
	 * Default constructor which sets the hardness and resistance
	 * @param name The unlocalized name
	 */
	public BlockTinBlock(String name) {
		super(name, Material.IRON);
		this.setUnlocalizedName(name);
		this.setRegistryName(Reference.MODID + "." + name);
		this.setHardness(3);
		this.setResistance(20);
	}

}
