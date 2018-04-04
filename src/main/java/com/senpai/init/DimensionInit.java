package com.senpai.init;

import com.senpai.util.Reference;
import com.senpai.world.dimension.foz.DimensionGrandFoz;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType FOZ = DimensionType.register("FOZ", "_foz", Reference.FozDimensionID, DimensionGrandFoz.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(Reference.FozDimensionID, FOZ);
	}
}
