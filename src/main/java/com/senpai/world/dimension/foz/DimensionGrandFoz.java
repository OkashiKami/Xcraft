package com.senpai.world.dimension.foz;

import com.senpai.init.BiomeInit;
import com.senpai.init.DimensionInit;
import com.senpai.world.biomes.BiomeFoz;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionGrandFoz extends WorldProvider
{
	public DimensionGrandFoz()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.FOZ_DIMENSION);
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.FOZ;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorFoz(world, true, world.getSeed(), null);
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
