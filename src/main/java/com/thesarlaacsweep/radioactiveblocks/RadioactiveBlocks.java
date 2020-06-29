package com.thesarlaacsweep.radioactiveblocks;

import com.thesarlaacsweep.radioactiveblocks.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocks.init.ModItems;
import com.thesarlaacsweep.radioactiveblocks.init.ModOres;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("radioactiveblocks")
public class RadioactiveBlocks
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "radioactiveblocks";
    public static IEventBus MOD_EVENT_BUS;

    public RadioactiveBlocks() {
        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_EVENT_BUS.addListener(this::setup);
        MOD_EVENT_BUS.addListener(this::doClientStuff);

        ModOres.init();
        ModItems.init();
        ModBlocks.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("radioactive_blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModOres.URANIUM_ORE.get());
        }
    };

    public static final ItemGroup TOOLS_TAB = new ItemGroup("radioactive_blocks_tools_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.URANIUM_PICKAXE.get());
        }
    };

    public static final ItemGroup COMBAT_TAB = new ItemGroup("radioactive_blocks_combat_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.URANIUM_SWORD.get());
        }
    };
}
