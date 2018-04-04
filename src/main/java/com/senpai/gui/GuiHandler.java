package com.senpai.gui;

import com.senpai.container.ContainerEnergyCell;
import com.senpai.tileEntity.TileEntityEnergyCell;
import com.senpai.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Handles all of the gui's
 * @author CJMinecraft
 *
 */
public class GuiHandler implements IGuiHandler {
	
	/**
	 * Should return the container for that gui. This is called server side because servers handle items in guis
	 */
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch(ID) {
		case Reference.GUI_BLOCK_BREAKER:
			return null;
		case Reference.GUI_ENERGY_CELL:
			return new ContainerEnergyCell(player.inventory, (TileEntityEnergyCell) world.getTileEntity(pos));
		}
		return null;
	}

	/**
	 * Should return the actual gui. This is called client side as thats where guis are rendered
	 */
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch(ID) {
		case Reference.GUI_BLOCK_BREAKER:
			return null;
		case Reference.GUI_ENERGY_CELL:
			return new GuiEnergyCell(player.inventory, (TileEntityEnergyCell)world.getTileEntity(pos));
		}
		return null;
	}

}
