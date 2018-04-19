package com.hassam.mythocraft;

import com.hassam.mythocraft.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythoCraftTab extends CreativeTabs
{
	public MythoCraftTab(String label) {super("MythoCraft");}
	public ItemStack getTabIconItem() 
	{return ItemInit.IMPERIAL_GOLD_INGOT;}
}