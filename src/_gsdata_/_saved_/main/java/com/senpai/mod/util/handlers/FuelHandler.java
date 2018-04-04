package com.senpai.mod.util.handlers;

import com.senpai.mod.init.BlockInit;
import com.senpai.mod.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{

	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.getItem() ==  ItemInit.TONICIUM) return 25000;
		if(fuel.getItem() == Item.getItemFromBlock(BlockInit.BLOCK_TONICIUM)) return 50000;
		return 0;
	}

}
