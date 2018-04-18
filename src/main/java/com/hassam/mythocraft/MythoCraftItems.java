package com.hassam.mythocraft;

import com.hassam.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythoCraftTab extends CreativeTabs
{
	public MythoCraftTab(String label) {super("MythoCraft Materials");}
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.IMPERIAL_GOLD_INGOT);}
}