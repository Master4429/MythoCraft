package com.hassam.mythocraft.init;

import com.hassam.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockInit {

	public static Block silver_ore;
	public static Block celestial_bronze_ore;
	public static Block stygian_iron_ore;
	public static Block imperial_gold_ore;
	public static Block adamant_ore;
	public static Block meteoric_iron_ore;
	public static Block ruby_ore;

	public static void init() {
		silver_ore = new BlockSilverOre("silver_ore");
		celestial_bronze_ore = new BlockCelestialBronzeOre("celestial_bronze_ore");
		stygian_iron_ore = new BlockStygianIronOre("stygian_iron_ore");
		imperial_gold_ore = new BlockImperialGoldOre("imperial_gold_ore");
		adamant_ore = new BlockAdamantOre("adamant_ore");
		meteoric_iron_ore = new BlockMeteoricIronOre("meteoric_iron_ore");
		ruby_ore = new BlockRubyOre("ruby_ore");

	`}

	public static void register() {
		registerBlock(silver_ore);
		registerBlock(celestial_bronze_ore);
		registerBlock(stygian_iron_ore);
		registerBlock(imperial_gold_ore);
		registerBlock(adamant_ore);
		registerBlock(meteoric_iron_ore);
		registerBlock(ruby_ore);
	}

	public static void registerRenders() {
		registerRender(silver_ore);
		registerRender(celestial_bronze_ore);
		registerRender(stygian_iron_ore);
		registerRender(imperial_gold_ore);
		registerRender(adamant_ore);
		registerRender(meteoric_iron_ore);
		registerRender(ruby_ore);
	}

	public static void registerBlock(Block block) {
		GameRegistry.registerBLock(block, block.getUnlocalizedName().substring(5));
		System.out.println("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getREnderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName()substrin(5), "inventory"));
	}

	public static void registerRender(Block block, int meta, String filename) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().regist(item, meta,
			new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
	}
}
