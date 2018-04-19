package com.hassam.mythocraft;

import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythoCraftBlocks extends CreativeTabs
{
	public MythoCraftBlocks(String label) {super("MythoCraft Blocks");}
	public ItemStack getTabIconItem() 
	{return BlockInit.IMPERIAL_GOLD_ORE;}
}