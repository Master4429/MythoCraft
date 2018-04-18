package com.hassam.mythocraft.mod.util.handlers;



import com.hassam.mythocraft.util.Reference;

import net.minecraft.util.ResourceLocation;

import net.minecraft.util.SoundEvent;

import net.minecraft.client.Minecraft;

import net.minecraft.client.audio.ISound;

import net.minecraft.client.audio.ITickableSound;

import net.minecraft.client.audio.PositionedSoundRecord;

import net.minecraft.client.audio.SoundManager;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.util.SoundEvent;

import net.minecraftforge.fml.relauncher.Side;

import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraftforge.fml.common.registry.ForgeRegistries;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class SoundsHandler {package com.hassam.mythocraft.mod.util.handlers;







import com.hassam.mythocraft.util.Reference;



import net.minecraft.util.ResourceLocation;



import net.minecraft.util.SoundEvent;



import net.minecraftforge.fml.common.registry.ForgeRegistries;







public class SoundsHandler 



{



	public static SoundEvent ENTITY_CENTAUR_AMBIENT, ENTITY_CENTAUR_HURT, ENTITY_CENTAUR_DEATH;



	



	public static void registerSounds()



	{



		ENTITY_CENTAUR_AMBIENT = registerSound("entity.centaur.ambient");



		ENTITY_CENTAUR_HURT = registerSound("entity.centaur.hurt");



		ENTITY_CENTAUR_DEATH = registerSound("entity.centaur.death");



	}



	



	private static SoundEvent registerSound(String name)



	{



		ResourceLocation location = new ResourceLocation(Reference.MODID, name);



		SoundEvent event = new SoundEvent(location);



		event.setRegistryName(name);



		ForgeRegistries.SOUND_EVENTS.register(event);



		return event;



	}



}
}