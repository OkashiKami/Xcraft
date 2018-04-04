package com.senpai.items.tool;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.senpai.items.basic.ItemHeart;
import com.senpai.util.Reference;
import com.senpai.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

/**
 * This is a custom tool which when you hit a mob causes them to drop a {@link ItemHeart}
 * Refer to {@link SoulStealerEvents}
 * @author CJMinecraft
 *
 */
public class ToolSoulStealer extends ItemTool {

	/**
	 * Says that the tool is not effective on any blocks
	 */
	private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});
	
	public ToolSoulStealer(String unlocalizedName) {
		super(EnumHelper.addToolMaterial(Reference.MODID + ":soul_stealer", 0, 100, 0, 1, 0), EFFECTIVE_BLOCKS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	/**
	 * Tool tip
	 */
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add(TextFormatting.BLUE + Utils.getLang().localize("soul_stealer.tooltip"));
	}
}
