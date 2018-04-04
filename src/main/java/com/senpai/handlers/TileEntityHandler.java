package com.senpai.handlers;

import com.senpai.tileEntity.TileEntityBeacon;
import com.senpai.tileEntity.TileEntityCanvas;
import com.senpai.tileEntity.TileEntityCore;
import com.senpai.tileEntity.TileEntityEnergyCell;
import com.senpai.tileEntity.TileEntityPipe;
import com.senpai.util.Reference;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBeacon.class, Reference.MODID + ":TileEntityBeacon");
		GameRegistry.registerTileEntity(TileEntityCanvas.class, Reference.MODID + ":TileEntityCanvas");
		GameRegistry.registerTileEntity(TileEntityCore.class, Reference.MODID + ":TileEntityCore");
		GameRegistry.registerTileEntity(TileEntityEnergyCell.class, Reference.MODID + ":TileEntityEnergyCell");
		GameRegistry.registerTileEntity(TileEntityPipe.class, Reference.MODID + ":TileEntityPipe");
	
	}
}
