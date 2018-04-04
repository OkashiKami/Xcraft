package com.senpai.mod.objects.blocks.normal;

import com.senpai.mod.Main;
import com.senpai.mod.init.BlockInit;
import com.senpai.mod.init.ItemInit;
import com.senpai.mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockAluminium extends Block implements IHasModel
{
	public BlockAluminium() 
	{
		super(Material.IRON);
		setUnlocalizedName("block_tonicium");
		setRegistryName("block_tonicium");
		setCreativeTab(Main.TAB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}