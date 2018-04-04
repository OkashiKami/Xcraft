package com.senpai.items.basic;

import java.util.List;

import com.senpai.util.Utils;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * This item heals the player by one heart when right clicked
 * 
 * @author CJMinecraft
 *
 */
public class ItemHeart extends ItemBase {

	/**
	 * As with every item
	 */
	public ItemHeart(String name) {
		super(name);
	}

	/**
	 * Increases the player health when right clicked if they aren't at full health
	 */
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (player.getHealth() < player.getMaxHealth()) {
			player.heal(2); // Heals them 2 HP or 1 heart
			player.inventory.decrStackSize(player.inventory.currentItem, 1); // NEW 1.11
			worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F,
					worldIn.rand.nextFloat() * 0.1F + 0.9F);
		}
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
				
	}

	/**
	 * Adds a tool tip to the item
	 */
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add(TextFormatting.AQUA + Utils.getLang().localize("heart.tooltip"));
	}

}
