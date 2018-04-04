package com.senpai.handlers;

import java.util.Map;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Mathf 
{
	
	public static AxisAlignedBB createBoundBox(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		x1 = x1 / 16D;
		y1 = y1 / 16D;
		z1 = z1 / 16D;
		
		x2 = x2 / 16D;
		y2 = y2 / 16D;
		z2 = z2 / 16D;
		return new AxisAlignedBB (x1, y1, z1, x2, y2, z2);
		
	}

	public static class Maps
	{
		public static void put(Map<String, AxisAlignedBB> map, int key, AxisAlignedBB value)
		{
			map.put(Integer.toString(key), value);
		}
		public static AxisAlignedBB get(Map<String, AxisAlignedBB> map, int key)
		{
			if(map.containsKey(Integer.toString(key))) return map.get(Integer.toString(key));
			else 
			{
				System.out.println("LOOKING FOR: " + key);
				return new AxisAlignedBB(1D, 1D, 1D, 1D, 1D, 1D);
			}
		}
	}
}
