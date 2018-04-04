package com.senpai.mod.objects.blocks.planks;

import java.util.ArrayList;
import java.util.List;

import com.senpai.mod.Main;
import com.senpai.mod.init.BlockInit;
import com.senpai.mod.init.ItemInit;
import com.senpai.mod.objects.blocks.item.ItemBlockVariants;
import com.senpai.mod.util.handlers.EnumHandler;
import com.senpai.mod.util.interfaces.IHasModel;
import com.senpai.mod.util.interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import scala.actors.threadpool.Arrays;

public class Planks_Tonicium  extends Block implements IMetaName, IHasModel
{
	public static final PropertyEnum<EnumHandler.ElementType> VARIANT = PropertyEnum.<EnumHandler.ElementType>create("variant", EnumHandler.ElementType.class);
	
	private String name = "planks_tonicium";
	private EnumHandler.ElementType type;
	
	public Planks_Tonicium(EnumHandler.ElementType type) 
	{
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.ElementType.TONICIUM));
		setCreativeTab(Main.TAB);
		this.type = type;
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumHandler.ElementType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(EnumHandler.ElementType customblockplanks$enumtype : EnumHandler.ElementType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.ElementType.byMetadata(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandler.ElementType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}

	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return type.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), 0, "planks_" + type, "inventory");
	}
}
