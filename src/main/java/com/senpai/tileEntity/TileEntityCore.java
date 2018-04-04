package com.senpai.tileEntity;

import cjminecraft.core.energy.EnergyUnits;
import cjminecraft.core.energy.EnergyUtils;
import cjminecraft.core.energy.compat.forge.CustomForgeEnergyStorage;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityCore extends TileEntity implements ITickable
{
	private ItemStackHandler handler;
	private CustomForgeEnergyStorage storage;

	public TileEntityCore() 
	{
		this.handler = new ItemStackHandler(2);
		this.storage = new CustomForgeEnergyStorage(1000000, 0);
	}
	
	@Override public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return (T) this.handler;
		}
		if(capability == CapabilityEnergy.ENERGY)
		{
			return (T) this.storage;
		}
		
		return super.getCapability(capability, facing);
	}
	
	@Override public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return true;
		}
		if(capability == CapabilityEnergy.ENERGY)
		{
			return true;
		}
		return super.hasCapability(capability, facing);
	}
	
	@Override public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		compound.setTag("inventory", this.handler.serializeNBT());
		this.storage.writeToNBT(compound);
		return super.writeToNBT(compound);
	}
	@Override public void readFromNBT(NBTTagCompound compound)
	{
		this.handler.deserializeNBT(compound.getCompoundTag("inventory"));
		this.storage.readFromNBT(compound);
		super.readFromNBT(compound);
	}
	
	@Override public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		NBTTagCompound compound = pkt.getNbtCompound();
		readUpdateTag(compound);
	}
	@Override public SPacketUpdateTileEntity getUpdatePacket() 
	{
		NBTTagCompound compound = new NBTTagCompound();
		this.writeUpdateTag(compound);
		return new SPacketUpdateTileEntity(pos, getBlockMetadata(), compound);
	}
	@Override public NBTTagCompound getUpdateTag()
	{
		NBTTagCompound compound = super.getUpdateTag();
		writeUpdateTag(compound);
		return compound;
	}
	
	public void writeUpdateTag(NBTTagCompound compound)
	{
		compound.setTag("inventory", this.handler.serializeNBT());
		this.storage.writeToNBT(compound);
	}
	public void readUpdateTag(NBTTagCompound compound)
	{
		this.handler.deserializeNBT(compound.getCompoundTag("inventory"));
		this.storage.readFromNBT(compound);
	}

	
	@Override public void update()
	{
		if(this.world != null && !this.world.isRemote)
		{
			this.storage.extractEnergyInternal((int) EnergyUtils.giveEnergyAllFaces(this.world, this.pos, 1000, EnergyUnits.FORGE_ENERGY, false), false);
			this.storage.receiveEnergyInternal((int) EnergyUtils.takeEnergyAllFaces(this.world, this.pos, 1000, EnergyUnits.FORGE_ENERGY, false), false);
			this.storage.extractEnergyInternal((int) EnergyUtils.giveEnergy(this.handler.getStackInSlot(0), 1000, EnergyUnits.FORGE_ENERGY, false, null), false);
			this.storage.receiveEnergyInternal((int) EnergyUtils.takeEnergy(this.handler.getStackInSlot(1), 1000, EnergyUnits.FORGE_ENERGY, false, null), false);
		}
	}
}

