package com.senpai.mod.objects.items.food;

import com.senpai.mod.Main;
import com.senpai.mod.init.ItemInit;
import com.senpai.mod.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood  extends ItemFood implements IHasModel
{

	public ItemCustomFood(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
