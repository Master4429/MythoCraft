package com.hassam.mythocraft.objects.items;

import com.hassam.mythocraft.Main;
import com.hassam.mythocraft.init.ItemInit;
import com.hassam.mythocraft.util.interfaces.IHasModel;
import net.minecraft.creativetav.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MythoCraftItems);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}