package com.senpai.init;

import com.senpai.blocks.BlockBase;
import com.senpai.blocks.BlockBeacon;
import com.senpai.blocks.BlockCanvas;
import com.senpai.blocks.BlockDirts;
import com.senpai.blocks.BlockLeaf;
import com.senpai.blocks.BlockLogs;
import com.senpai.blocks.BlockOres;
import com.senpai.blocks.BlockPlank;
import com.senpai.blocks.BlockSaplings;
import com.senpai.blocks.BlockTeleporter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//Blocks
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	public static final Block BLOCK_TIN = new BlockBase("block_tin", Material.DRAGON_EGG);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block TELEPORTER = new BlockTeleporter("block_teleporter");
	
	public static final Block BEACON = new BlockBeacon("block_beacon");
	
	//Plants
	public static final Block RICE_PLANT = new BlockBase("rice_plant", Material.PLANTS);

	//Reactor
	
	//Engineering
	public static final Block CAANVAS = new BlockCanvas("canvas");
}
