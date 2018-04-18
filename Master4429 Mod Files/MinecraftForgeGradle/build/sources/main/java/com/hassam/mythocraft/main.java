package com.hassam.mythocraft;

import com.hassam.mythocraft.proxy.CommonProxy;
import com.hassam.mythocraft.util.Reference;
import com.hassam.mythocraft.util.handlers.RegistryHandler;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;



@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	public static final MythoCraftMaterialsTab creativeTab = new MythoCraftMaterials();

    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;
        
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
    @EventHandler
    public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
    
}