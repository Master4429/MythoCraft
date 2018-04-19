package com.hassam.mythocraft.init;

import java.util.ArrayList;
import java.util.List;
import com.hassam.mythocraft.objects.blocks.BlockBase;
import com.hassam.mythocraft.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block SILVER_ORE = (new BlockSilverOre("silver_ore", Material.ROCK));
	public static final Block CELESTIAL_BRONZE_ORE = (new BlockCelestialBronzeOre("celestial_bronze_ore", Material.ROCK));
	public static final Block STYNGIAN_IRON_ORE = (new BlockStygianIronOre("stygian_iron_ore", Material.ROCK));
	public static final Block IMPERIAL_GOLD_ORE = (new BlockImperialGoldOre("imperial_gold_ore", Material.ROCK));
	public static final Block ADAMANT_ORE = (new BlockAdamantOre("adamant_ore"));
	public static final Block METEORIC_IRON_ORE = (new BlockMeteoricIronOre("meteoric_iron_ore", Material.ROCK));
	public static final Block RUBY_ORE = (new BlockRubyOre("ruby_ore", Material.ROCK));
}