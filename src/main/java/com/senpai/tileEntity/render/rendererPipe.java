package com.senpai.tileEntity.render;

import com.senpai.init.ItemInit;
import com.senpai.tileEntity.TileEntityPipe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class rendererPipe extends TileEntitySpecialRenderer<TileEntityPipe>
{
	@Override
	public void renderTileEntityFast(TileEntityPipe te, double x, double y, double z, float partialTicks, int destroyStage, float partial, BufferBuilder buffer) 
	{
		super.renderTileEntityFast(te, x, y, z, partialTicks, destroyStage, partial, buffer);
		GlStateManager.pushMatrix();
		{
			GlStateManager.translate(x, y, z);
			GlStateManager.rotate(90f, 1, 0, 0);
			GlStateManager.translate(0.5, 0, -0.5);
			EntityItem ei = new EntityItem(Minecraft.getMinecraft().world, 0, 0, 0, new ItemStack(Blocks.CONCRETE));
			for(int i = 0; i < te.itemCount; i++)
			{
				Minecraft.getMinecraft().getRenderManager().renderEntity(ei, 0, 0, 0, 0F, 0F, false);
				GlStateManager.translate(0, 0, -0.625);
			}
		}
		GlStateManager.popMatrix();
		
	}
}
