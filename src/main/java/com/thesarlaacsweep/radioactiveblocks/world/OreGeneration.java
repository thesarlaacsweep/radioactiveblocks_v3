package com.thesarlaacsweep.radioactiveblocks.world;

import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.config.ModConfig;
import com.thesarlaacsweep.radioactiveblocks.init.ModOres;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = RadioactiveBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGeneration {
    @SubscribeEvent
    public static void onFeatureRegistryEvent(RegistryEvent.Register<Feature<?>> event) {
        ForgeRegistries.BIOMES.forEach(biome -> {
            if (biome.getCategory() == Biome.Category.OCEAN || biome.getCategory() == Biome.Category.ICY) {
                getFeature(
                        biome,
                        Objects.requireNonNull(ModOres.NEPTUNIUM_ORE.get()).getDefaultState(),
                        ModConfig.COMMON_CONFIG.neptunium_ore_size.get(),
                        ModConfig.COMMON_CONFIG.neptunium_ore_size.get(),
                        ModConfig.COMMON_CONFIG.neptunium_ore_height.get()
                );
            }

            if (biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.MUSHROOM || biome.getCategory() == Biome.Category.MESA) {
                getFeature(
                        biome,
                        Objects.requireNonNull(ModOres.THORIUM_ORE.get()).getDefaultState(),
                        ModConfig.COMMON_CONFIG.thorium_ore_size.get(),
                        ModConfig.COMMON_CONFIG.thorium_ore_count.get(),
                        ModConfig.COMMON_CONFIG.thorium_ore_height.get()
                );
            }

            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.AMERICIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.americium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.americium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.americium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.BERKELIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.berkelium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.berkelium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.berkelium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.PLUTONIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.plutonium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.plutonium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.plutonium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.PROTACTINIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.protactinium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.protactinium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.protactinium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.RADIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.radium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.radium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.radium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.TECHNETIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.technetium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.technetium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.technetium_ore_height.get()
            );
            getFeature(
                    biome,
                    Objects.requireNonNull(ModOres.URANIUM_ORE.get()).getDefaultState(),
                    ModConfig.COMMON_CONFIG.uranium_ore_size.get(),
                    ModConfig.COMMON_CONFIG.uranium_ore_count.get(),
                    ModConfig.COMMON_CONFIG.uranium_ore_height.get()
            );
        });
    }
    
    private static void getFeature(Biome biome, BlockState state, int size, int count, int maxHeight) {
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, state, size)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(count, 0, 0, maxHeight))));
    }
}
