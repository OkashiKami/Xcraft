package com.senpai.mod.util.handlers;

import java.util.List;

import com.senpai.mod.Main;
import com.senpai.mod.init.BiomeInit;
import com.senpai.mod.init.BlockInit;
import com.senpai.mod.init.EntityInit;
import com.senpai.mod.init.ItemInit;
import com.senpai.mod.util.interfaces.IHasModel;
import com.senpai.mod.world.gen.WorldGenCustomOres;
import com.senpai.mod.world.gen.WorldGenCustomStructures;
import com.senpai.mod.world.types.WorldTypeCopper;
import com.senpai.mod.world.types.WorldTypeCustom;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.ModClassLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		//TileEntityHandler.registerTileEntities();
	}
	@SubscribeEvent
	public static void onRecipeRegister(RegistryEvent event)
	{
		
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		BiomeInit.registerBiomes();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
		//NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	public static void postInitRegistries()
	{
		WorldType COPPER = new WorldTypeCopper();
		WorldType CUSTOM = new WorldTypeCustom();
	}
	
}
