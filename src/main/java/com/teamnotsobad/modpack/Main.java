package com.teamnotsobad.modpack;

import com.teamnotsobad.modpack.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, dependencies = "", useMetadata = true)
public class Main
{
    public static final String MODID = "meatballsub";
    public static final String NAME = "The Modpack";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.teamnotsobad.modpack.proxy.ClientProxy", serverSide = "com.teamnotsobad.modpack.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.Instance
    public static Main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
