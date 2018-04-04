package com.senpai;

import com.senpai.proxy.CommonProxy;
import com.senpai.util.Reference;
import com.senpai.util.Tab;
import com.senpai.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs TAB = new Tab(Reference.NAME);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) { RegistryHandler.preInitRegistries(); }
	@EventHandler
	public static void init(FMLInitializationEvent event) { RegistryHandler.initRegistries(); }
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) { RegistryHandler.postInitRegistries(); }
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) { RegistryHandler.serverRegistries(event); }
}
