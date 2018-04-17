package com.hassam.mythocraft;

import com.hassam.mythocraft.proxy.CommonProxy;
import com.hassam.mythocraft.util.Reference;
import net.minecraft.init.Blocks;

import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;



@Mod(modid = Referance.MOD_ID, name = Referance.NAME, version = Referance.VERSION)

public class Main
{
    private static Logger logger;

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler

    public void preInit(FMLPreInitializationEvent event)

    {

        logger = event.getModLog();

    }


    @EventHandler

    public void init(FMLInitializationEvent event)

    {


    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
