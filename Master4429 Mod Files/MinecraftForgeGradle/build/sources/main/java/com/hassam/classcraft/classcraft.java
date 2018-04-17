package com.hassam.classcraft;


import net.minecraft.init.Blocks;

import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.EventHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = classcraft.MODID, name = ClassCraft.NAME, version = 0.0.1Alpha.VERSION)
public class ExampleMod
{
    public static final String MODID = "classcraft";
    public static final String NAME = "ClassCraft";
    public static final String VERSION = "0.0.1Alpha";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
