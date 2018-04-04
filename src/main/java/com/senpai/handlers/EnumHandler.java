package com.senpai.handlers;

import net.minecraft.block.properties.PropertyHelper;
import net.minecraft.util.IStringSerializable;

public class EnumHandler
{
	public static enum MinaralType implements IStringSerializable
	{
		COPPER(0, "copper"),
		ALUMINIUM(1, "aluminium"),
		TIN(2, "tin");
		
		private static final MinaralType[] META_LOOKUP = new MinaralType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private MinaralType(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private MinaralType(int meta, String name, String unlocializedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocializedName() 
		{
			return this.unlocializedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static MinaralType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(MinaralType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}

	public static enum AttachPosition implements IStringSerializable
    {
        SET("set"),
        UNSET("unset");

        private final String name;

        private AttachPosition(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this.name;
        }
    }
	
	public static enum ConnectorType implements IStringSerializable
    {
		NONE("0"),
        REQUESTER("1"),
        PROVIDER("2");

		
        private final String name;

        private ConnectorType(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this.name;
        }
    }
	
	public static enum ChipTypes implements IStringSerializable
	{
		BASIC(0, "basic"),
		ADVANCED(1, "advanced");

		private static final ChipTypes[] META_LOOKUP = new ChipTypes[values().length];
		
		private int meta;
		private String name;
		private String unlocializedName;
		
		private ChipTypes(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private ChipTypes(int meta, String name, String unlocializedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public String getUnlocializedName() {
			return unlocializedName;
		}
		
		public int getMeta() {
			return meta;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
		public static ChipTypes byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(ChipTypes enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
		
	}
	
	/**
	 * This is used by {@link BlockTinOre}
	 * @author CJMinecraft
	 *
	 */
	public static enum OreType implements IStringSerializable {
		OVERWORLD("overworld", 0),
		NETHER("nether", 1),
		END("end", 2);
		
		private int ID;
		private String name;
		
		private OreType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum EnergyConnectionType implements IStringSerializable {
		NONE("none", 0),
		NORMAL("normal", 1),
		IN("in", 2),
		OUT("out", 3);
		
		private int ID;
		private String name;
		
		private EnergyConnectionType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
}
