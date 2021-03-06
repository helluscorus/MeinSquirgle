package helluscorus.meinsquirgle;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import helluscorus.meinsquirgle.handler.ConfigurationHandler;
import helluscorus.meinsquirgle.handler.MidiHandler;
import helluscorus.meinsquirgle.handler.PlayerEventHandlerMS;
import helluscorus.meinsquirgle.init.ModBlocks;
import helluscorus.meinsquirgle.init.ModItems;
import helluscorus.meinsquirgle.init.ModTileEntities;
import helluscorus.meinsquirgle.midi.MidiMS;
import helluscorus.meinsquirgle.proxy.IProxy;
import helluscorus.meinsquirgle.reference.Reference;
import helluscorus.meinsquirgle.utility.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MeinSquirgle {

    @Mod.Instance(Reference.MOD_ID)
    public static MeinSquirgle instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // config, items & blocks
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        FMLCommonHandler.instance().bus().register(new PlayerEventHandlerMS());
        MinecraftForge.EVENT_BUS.register(new PlayerEventHandlerMS());

        ModItems.init();
        ModBlocks.init();
        ModTileEntities.init();

        //MidiHandler.init();
        MidiMS.init();

        LogHelper.info("Pre-Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // recipes & gui & tile entities

        FMLCommonHandler.instance().bus().register(new PlayerEventHandlerMS());
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post-Initialization Complete!");
    }
}