package com.senpai.items;

import com.senpai.Main;
import com.senpai.init.ItemInit;
import com.senpai.interfaces.IHasModel;
import com.senpai.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class XcraftHandbook extends Item implements IHasModel
{
	public XcraftHandbook() 
	{
		String name ="xcraft_handbook";
		setUnlocalizedName(Reference.MODID + "." +  name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
