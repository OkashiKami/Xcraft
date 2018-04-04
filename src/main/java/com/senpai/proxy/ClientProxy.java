package com.senpai.proxy;

import com.senpai.init.ItemInit;
import com.senpai.tileEntity.TileEntityEnergyCell;
import com.senpai.tileEntity.TileEntityPipe;
import com.senpai.tileEntity.render.rendererPipe;
import com.senpai.util.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new rendererPipe());
		
	}
		
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
	}
}
