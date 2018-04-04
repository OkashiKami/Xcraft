package com.senpai.mod.world.biomes;

import java.util.Random;

import com.senpai.mod.init.BlockInit;
import com.senpai.mod.objects.blocks.BlockDirts;
import com.senpai.mod.objects.blocks.BlockOres;
import com.senpai.mod.objects.blocks.BlockPlank;
import com.senpai.mod.util.handlers.EnumHandler;
import com.senpai.mod.world.gen.generators.trees.WorldGenCopperTree;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCopper extends Biome 
{
	protected static final WorldGenAbstractTree TREE = new WorldGenCopperTree();
	
	public BiomeCopper() 
	{
		super(new BiomeProperties("Copper").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(16711680));
		
		topBlock = BlockInit.DIRT.getDefaultState().withProperty(BlockDirts.VARIANT, EnumHandler.ElementType.COPPER);
		fillerBlock = BlockInit.getBlock(EnumHandler.ElementType.COPPER, EnumHandler.BlockType.BlockNormal).getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.ElementType.COPPER);
		
		this.decorator.coalGen = new WorldGenMinable(BlockInit.getBlock(EnumHandler.ElementType.COPPER, EnumHandler.BlockType.BlockPlanks).PLANKS.getDefaultState().withProperty(BlockPlank.VARIANT, EnumHandler.ElementType.COPPER), 10);
		
		this.decorator.treesPerChunk = 2;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		//this.spawnableCreatureList.add(new SpawnListEntry(EntityWither.class, 10, 1, 5));
		//this.spawnableCreatureList.add(new SpawnListEntry(EntityDragon.class, 5, 1, 2));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}
