package com.senpai.tileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

public class TileEntityPipe extends TileEntity
{
	public int itemCount, maxItemCount = 64;
	
	public boolean AddItem()
	{
		if(itemCount < maxItemCount) 
		{
			itemCount++;
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			return true;
		}
		return false;
	}
	public void RemoveItem() 
	{
		if(itemCount > 0)
		{
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state,  state, 3);
			markDirty();
		}
	}

	@Override public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("itemCount", this.itemCount);
		return compound;
	}
	@Override public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.itemCount = compound.getInteger("itemCount");
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		NBTTagCompound compound = pkt.getNbtCompound();
		readUpdateTag(compound);
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() 
	{
		NBTTagCompound compound = new NBTTagCompound();
		this.writeUpdateTag(compound);
		return new SPacketUpdateTileEntity(pos, getBlockMetadata(), compound);
	}
	
	@Override
	public NBTTagCompound getUpdateTag()
	{
		NBTTagCompound compound = super.getUpdateTag();
		writeUpdateTag(compound);
		return compound;
	}
	
	public void writeUpdateTag(NBTTagCompound compound)
	{
		compound.setInteger("itemCount", this.itemCount);
	}
	
	public void readUpdateTag(NBTTagCompound compound)
	{
		this.itemCount = compound.getInteger("itemCount");
	}
	

	
}

