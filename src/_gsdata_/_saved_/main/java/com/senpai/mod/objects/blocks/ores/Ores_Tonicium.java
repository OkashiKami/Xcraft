package com.senpai.mod.objects.blocks.ores;

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

public class Ores_Tonicium extends Block implements IHasModel, IMetaName
{
	public static final PropertyEnum<EnumHandler.ElementType> VARIANT = PropertyEnum.<EnumHandler.ElementType>create("variant", EnumHandler.ElementType.class);
	
	private static final String name = "ore_tonicium";
	private List<String> dimension = new ArrayList<String>();
	
	public Ores_Tonicium(EnumHandler.ElementType type, String... dimension) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TAB);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, type));

		this.dimension = Arrays.asList(dimension);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumHandler.ElementType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandler.ElementType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.ElementType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(EnumHandler.ElementType variant : EnumHandler.ElementType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return EnumHandler.ElementType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumHandler.ElementType.values().length; i++)
		{
			for(int x = 0; x < this.dimension.size(); x++)
			{		
				Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension.get(i) + "_" + EnumHandler.ElementType.values()[i].getName(), "inventory");
			}
		}
	}
}
