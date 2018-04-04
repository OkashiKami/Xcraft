package com.senpai.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EnergyBar extends GuiButton
{

	public int energy;
	public int capacity;

	public EnergyBar(int id, int x, int y, int widthIn, int heightIn, int min, int max) 
	{
		super(id, x, y, widthIn, heightIn, "");
		this.energy = min;
		this.capacity = max;
	}

	public void syncData(BlockPos pos, EnumFacing north)
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
