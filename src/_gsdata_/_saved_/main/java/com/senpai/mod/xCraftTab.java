package com.senpai.mod;

import com.senpai.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class xCraftTab extends CreativeTabs
{
	public xCraftTab(String label) { super("xcrafttab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COPPER);}
}
