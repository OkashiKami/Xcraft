package com.senpai.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.senpai.mod.objects.armour.ArmourBase;
import com.senpai.mod.objects.items.ItemBase;
import com.senpai.mod.objects.items.food.ItemCustomFood;
import com.senpai.mod.objects.items.food.ItemRice;
import com.senpai.mod.objects.tools.ToolAxe;
import com.senpai.mod.objects.tools.ToolHoe;
import com.senpai.mod.objects.tools.ToolPickaxe;
import com.senpai.mod.objects.tools.ToolShovel;
import com.senpai.mod.objects.tools.ToolSword;
import com.senpai.mod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ToolMaterial TOOL_TONICIUM = EnumHelper.addToolMaterial("tool_tonicium", 2, 280, 5.0f, 1, 5);
	public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_TONICIUM = EnumHelper.addArmorMaterial("armour_tonicium", Reference.MODID + ":tonicium", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
//=========================================================================================================================================================================================================================
	
	//Singles
		public static final Item ALUMINIUM = new ItemBase("aluminium");
		public static final Item COPPER = new ItemBase("copper");
		public static final Item TONICIUM = new ItemBase("tonicium");
	//Items
		public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
		public static final Item INGOT_TONICIUM = new ItemBase("ingot_tonicium");
		public static final Item INGOT_ALUMINIUM = new ItemBase("ingot_aluminium");
	
	//Tools
		public static final Item AXE_ALUMINIUM = new ToolAxe("axe_aluminium", TOOL_COPPER);
		public static final Item HOE_ALUMINIUM = new ToolHoe("hoe_aluminium", TOOL_COPPER);
		public static final Item PICKAXE_ALUMINIUM = new ToolPickaxe("pickaxe_aluminium", TOOL_COPPER);
		public static final Item SHOVEL_ALUMINIUM = new ToolShovel("shovel_aluminium", TOOL_COPPER);
		public static final Item SWORD_ALUMINIUM = new ToolSword("sword_aluminium", TOOL_COPPER);
	
		public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
		public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
		public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
		public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
		public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
		
		public static final Item AXE_TONICIUM = new ToolAxe("axe_tonicium", TOOL_TONICIUM);
		public static final Item HOE_TONICIUM = new ToolHoe("hoe_tonicium", TOOL_TONICIUM);
		public static final Item PICKAXE_TONICIUM = new ToolPickaxe("pickaxe_tonicium", TOOL_TONICIUM);
		public static final Item SHOVEL_TONICIUM = new ToolShovel("shovel_tonicium", TOOL_TONICIUM);
		public static final Item SWORD_TONICIUM = new ToolSword("sword_tonicium", TOOL_TONICIUM);
	
	//Armour
		public static final Item HELMET_ALUMINIUM = new ArmourBase("helmet_aluminium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_ALUMINIUM = new ArmourBase("chestplate_aluminium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINGS_ALUMINIUM = new ArmourBase("leggings_aluminium", ARMOUR_TONICIUM, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_ALUMINIUM = new ArmourBase("boots_aluminium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.FEET);
		
		public static final Item HELMET_COPPER = new ArmourBase("helmet_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_COPPER = new ArmourBase("chestplate_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINGS_COPPER = new ArmourBase("leggings_copper", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_COPPER = new ArmourBase("boots_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
	
		public static final Item HELMET_TONICIUM = new ArmourBase("helmet_tonicium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHESTPLATE_TONICIUM = new ArmourBase("chestplate_tonicium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.CHEST);
		public static final Item LEGGINGS_TONICIUM = new ArmourBase("leggings_tonicium", ARMOUR_TONICIUM, 2, EntityEquipmentSlot.LEGS);
		public static final Item BOOTS_TONICIUM = new ArmourBase("boots_tonicium", ARMOUR_TONICIUM, 1, EntityEquipmentSlot.FEET);
	
	//Food
		public static final Item RICE_BOWL = new ItemCustomFood("rice_bowl", 8, false);
		public static final Item RICE = new ItemRice("rice", 1, false);
}
