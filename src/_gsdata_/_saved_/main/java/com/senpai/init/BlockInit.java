package com.senpai.init;

import java.util.ArrayList;
import java.util.List;

import com.senpai.objects.blocks.BlockBase;
import com.senpai.objects.blocks.BlockDirts;
import com.senpai.objects.blocks.BlockLeaf;
import com.senpai.objects.blocks.BlockLogs;
import com.senpai.objects.blocks.BlockOres;
import com.senpai.objects.blocks.BlockPlank;
import com.senpai.objects.blocks.BlockSaplings;
import com.senpai.objects.blocks.machines.reactor.BlockPipe;
import com.senpai.objects.blocks.machines.reactor.BlockReactor;
import com.senpai.objects.blocks.machines.reactor.BlockReactorEngine;
import com.senpai.objects.blocks.machines.sinterer.BlockSinteringFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block RICE_PLANT = new BlockBase("rice_plant", Material.PLANTS);
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sentering_furnace");

	//Reactor
	public static final Block REACTOR_ENGINE = new BlockReactorEngine("reactor_engine");
	public static final Block REACTOR_CORE = new BlockBase("reactor_core", Material.GLASS);
	public static final Block REACTOR_COOLANT = new BlockBase("reactor_coolant", Material.CLOTH);
	public static final Block PIPE = new BlockPipe("pipe");
	
}
