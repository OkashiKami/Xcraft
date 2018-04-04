package com.senpai.util;

import com.senpai.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tab extends CreativeTabs
{
	public Tab(String label) { super("tutorialtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.XCRAFT_HANDBOOK);}
}
