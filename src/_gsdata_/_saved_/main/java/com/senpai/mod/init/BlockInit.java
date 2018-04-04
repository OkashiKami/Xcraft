package com.senpai.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.senpai.mod.objects.blocks.BlockDirts;
import com.senpai.mod.objects.blocks.BlockLeaf;
import com.senpai.mod.objects.blocks.BlockLogs;
import com.senpai.mod.objects.blocks.BlockRicePlant;
import com.senpai.mod.objects.blocks.BlockSaplings;
import com.senpai.mod.objects.blocks.BlockRedWire;
import com.senpai.mod.objects.blocks.normal.BlockAluminium;
import com.senpai.mod.objects.blocks.normal.BlockCopper;
import com.senpai.mod.objects.blocks.normal.BlockTonicium;
import com.senpai.mod.objects.blocks.ores.Ores_Aluminium;
import com.senpai.mod.objects.blocks.ores.Ores_Copper;
import com.senpai.mod.objects.blocks.ores.Ores_Tonicium;
import com.senpai.mod.objects.blocks.planks.Planks_Aluminium;
import com.senpai.mod.objects.blocks.planks.Planks_Copper;
import com.senpai.mod.objects.blocks.planks.Planks_Tonicium;
import com.senpai.mod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;


public class BlockInit 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block getBlock(EnumHandler.ElementType element, EnumHandler.BlockType blocktype)
	{
		switch(blocktype)
		{
		case BlockOre:
			if(element == EnumHandler.ElementType.COPPER) return ORE_COPPER;
			else if(element == EnumHandler.ElementType.ALUMINIUM) return ORE_ALUMINIUM;
			else if(element == EnumHandler.ElementType.TONICIUM) return ORE_TONICIUM;
		case BlockNormal:
			if(element == EnumHandler.ElementType.COPPER) return BLOCK_COPPER;
			else if(element == EnumHandler.ElementType.ALUMINIUM) return BLOCK_ALUMINIUM;
			else if(element == EnumHandler.ElementType.TONICIUM) return BLOCK_TONICIUM;
		default:
			break;
		}
		
		return null;
	}
	
	//NORMAL
	public static final Block BLOCK_COPPER = new BlockCopper();
	public static final Block BLOCK_TONICIUM = new BlockTonicium();
	public static final Block BLOCK_ALUMINIUM = new BlockAluminium();
	//ORS	
	public static final Block ORE_COPPER = new Ores_Copper(EnumHandler.ElementType.COPPER, "end", "overworld", "nether");
	public static final Block ORE_ALUMINIUM = new Ores_Aluminium(EnumHandler.ElementType.ALUMINIUM, "end", "overworld", "nether");
	public static final Block ORE_TONICIUM = new Ores_Tonicium(EnumHandler.ElementType.TONICIUM, "end", "overworld", "nether");
	//Planks
	public static final Block PLANKS_COPPER = new Planks_Copper(EnumHandler.ElementType.COPPER);
	public static final Block PLANKS_ALUMINIUM = new Planks_Aluminium(EnumHandler.ElementType.ALUMINIUM);
	public static final Block PLANKS_TONICIUM = new Planks_Tonicium(EnumHandler.ElementType.TONICIUM);
	//Logs
	
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block RICE_PLANT = new BlockRicePlant("rice_plant");
	
	//public static final Block TONICIUM_WIRE = new BlockRedWire("tonicium_wire");
}
