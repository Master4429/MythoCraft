package com.hassam.mythocraft;

import com.hassam.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythoCraftMaterialsTab extends CreativeTabs
{
	public MythoCraftMaterialsTab(String label) {super("MythoCraft Materials");}
	public ItemStack getTabIconItem() 
	{return ItemInit.IMPERIAL_GOLD_INGOT;}
}