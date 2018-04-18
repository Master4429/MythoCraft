package com.hassam.mythocraft.items;

import com.hassam.mythocraft.Main;
import com.hassam.mythocraft.ModItems;
import com.hassam.mythocraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements
IHasModel {
	public ItemBase(String Name)
		{
			setUnlocalizedName(name);
			setRegistryName(name);

			setCreativeTab(CreativeTabs.MATERIALS);
			ModItems.ITEMS.add(this);
		}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}