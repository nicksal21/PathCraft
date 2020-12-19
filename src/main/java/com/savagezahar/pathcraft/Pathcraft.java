package com.savagezahar.pathcraft;

import com.savagezahar.pathcraft.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pathcraft")
public class Pathcraft
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    // Mod ID
    public static final String MOD_ID = "pathcraft";

    public Pathcraft() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Initialize Handler
        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    public static final ItemGroup PATHS = new ItemGroup("Paths") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.GRAVEL_PATH.get());
        }
    };

    public static final ItemGroup PATHCRAFT_ITEMS = new ItemGroup("Pathcraft_Items") {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.RAKE.get());
    }
};
}
