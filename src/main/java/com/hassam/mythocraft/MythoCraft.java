package com.hassam.mythocraft;

import com.hassam.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythoCraftItemsTab extends CreativeTabs
{
	public MythoCraftItemsTab(String label) {super("MythoCraft");}
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.IMPERIAL_GOLD_INGOT);}
}