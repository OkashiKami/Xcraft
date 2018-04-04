package com.senpai.mod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler
{
	public static enum BlockType implements IStringSerializable
	{
		BlockNormal(0, "normal"),
		BlockOre(1, "ores"),
		BlockPlanks(2, "plants"),
		BlockLog(3, "logs"),
		BlockLeaves(4, "leaves");

		private static final BlockType[] META_LOOKUP = new BlockType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private BlockType(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private BlockType(int meta, String name, String unlocializedName) 
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
		
		public static BlockType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(BlockType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
		
	}
	public static enum ElementType implements IStringSerializable
	{
		COPPER(0, "copper"),
		ALUMINIUM(1, "aluminium"),
		TONICIUM(2, "tonicium");
		
		private static final ElementType[] META_LOOKUP = new ElementType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private ElementType(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private ElementType(int meta, String name, String unlocializedName) 
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
		
		public static ElementType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(ElementType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
