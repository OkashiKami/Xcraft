package com.senpai.init;

import java.util.ArrayList;
import java.util.List;

import com.senpai.items.XcraftHandbook;
import com.senpai.items.armour.ArmourBase;
import com.senpai.items.basic.ItemBase;
import com.senpai.items.basic.ItemChip;
import com.senpai.items.basic.ItemPaintBrush;
import com.senpai.items.tool.ToolAxe;
import com.senpai.items.tool.ToolHoe;
import com.senpai.items.tool.ToolPickaxe;
import com.senpai.items.tool.ToolShovel;
import com.senpai.items.tool.ToolSoulStealer;
import com.senpai.items.tool.ToolSword;
import com.senpai.items.tool.ToolWrench;
import com.senpai.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Material
	public static final ToolMaterial TOOLCOPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ToolMaterial TOOLTIN = EnumHelper.addToolMaterial("tool_tin", 2, 180, 5.0F, 1.5F, 5);
	public static final ToolMaterial TOOLWRENCH = EnumHelper.addToolMaterial("tool_wrench", 2, 180, 80.0F, 1.0F, 60);

	
	public static final ArmorMaterial ARMOURCOPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MODID + ":copper", 13, new int[] { 2, 5, 5, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOURTIN = EnumHelper.addArmorMaterial("armour_tin", Reference.MODID + ":tin", 13, new int[] { 2, 5, 5, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	// Misc.
	public static final Item XCRAFT_HANDBOOK = new XcraftHandbook();

	// Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item RICE = new ItemBase("rice");

	// Tools
		//COPPER
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOLCOPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOLCOPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOLCOPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOLCOPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOLCOPPER);
		//TIN
	public static final Item TINPICKAXE = new ToolPickaxe("tin_pickaxe", TOOLTIN);
	public static final Item TINAXE = new ToolAxe("axe_tin", TOOLTIN);
	public static final Item TINHOE = new ToolHoe("hoe_tin", TOOLTIN);
	public static final Item TINSHOVEL = new ToolShovel("shovel_tin", TOOLTIN);
	public static final Item TINSWORD = new ToolSword("sword_tin", TOOLTIN);
	//Other
	public static final Item WRENCH = new ToolWrench("wrench", TOOLWRENCH);
	public static Item PAINTBRUSH = new ItemPaintBrush("paint_brush");

	// Armour
		//COPPER
	public static final Item COPPERHELMET = new ArmourBase("helmet_copper", ARMOURCOPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPERCHESTPLATE = new ArmourBase("chestplate_copper", ARMOURCOPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPERLEGGINGS = new ArmourBase("leggings_copper", ARMOURCOPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPERBOOTS = new ArmourBase("boots_copper", ARMOURCOPPER, 1, EntityEquipmentSlot.FEET);
		//TIN
	public static final Item TINHELMET = new ArmourBase("helmet_tin", ARMOURTIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TINCHESTPLATE = new ArmourBase("chestplate_tin", ARMOURTIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TINLEGGINGS = new ArmourBase("leggings_tin", ARMOURTIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TINBOOTS = new ArmourBase("boots_tin", ARMOURTIN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item soulStealer = new ToolSoulStealer("soul_stealer");
	
	
	
	// Engendering
	public static final Item CHIP = new ItemChip("chip");
}
