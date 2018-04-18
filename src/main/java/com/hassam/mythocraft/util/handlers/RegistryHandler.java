package com.hassam.mythocraft.util.handlers;

import com.hassam.mythocraft.init.ModItems;
import com.hassam.mythocraft.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public void onItemRegister(RegistryEvent.Register<Item>event) {
			event.getRegistry().registerAll(Item.ITEMS.toArray(new Item[0]));
		}
	@SubscribeEvent
	public void onModelRegister(ModelRegistryEvent event);
}