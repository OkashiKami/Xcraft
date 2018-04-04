package com.senpai.items.basic;

import com.senpai.util.Reference;
import com.senpai.handlers.EnumHandler.ChipTypes;
import com.senpai.blocks.BlockMachine;
import com.senpai.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * This class makes our chip item have metadata
 * @author CJMinecraft
 *
 */
public class ItemChip extends Item {
	
	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemChip(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setHasSubtypes(true); //This just says the item has metadata
	}
	
	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		//TODO: create variants for each type
	}
	
	/**
	 * Gets the correct unlocalized name using the {@link ChipTypes} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < ChipTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + ChipTypes.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + ChipTypes.BASIC.getName();
	}
	
	/**
	 * Upgrades machines to the next tier of machine
	 */
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		IBlockState state = world.getBlockState(pos);
		if(state != null) {
			if(state.getBlock() instanceof BlockMachine) {
				BlockMachine machine = (BlockMachine) state.getBlock();
				ItemStack heldStack = player.getHeldItem(hand);
				machine.updateMachineTier(world, player, hand, pos, heldStack);
			}
		}
		return EnumActionResult.PASS;
	}

}
