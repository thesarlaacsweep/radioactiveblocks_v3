package com.thesarlaacsweep.radioactiveblocks.init;

import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RadioactiveBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RadioactiveBlocks.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ################ Metal Blocks ################
    public static final RegistryObject<Block> AMERICIUM_BLOCK = BLOCKS.register("americium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> BERKELIUM_BLOCK = BLOCKS.register("berkelium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = BLOCKS.register("neptunium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = BLOCKS.register("plutonium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> PROTACTINIUM_BLOCK = BLOCKS.register("protactinium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> RADIUM_BLOCK = BLOCKS.register("radium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> TECHNETIUM_BLOCK = BLOCKS.register("technetium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> THORIUM_BLOCK = BLOCKS.register("thorium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new BlockBase(Material.IRON, ToolType.PICKAXE, SoundType.METAL, 2));
    // ################ End Metal Blocks ################

    // ################ Stone Blocks ################
    // Decorative Stone
    public static final RegistryObject<Block> RADIOACTIVE_ANDESITE_BLOCK = BLOCKS.register("radioactive_andesite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_ANDESITE_SLAB = BLOCKS.register("radioactive_andesite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_ANDESITE_STAIRS  = BLOCKS.register("radioactive_andesite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.ANDESITE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_ANDESITE_BLOCK = BLOCKS.register("radioactive_polished_andesite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_ANDESITE_SLAB = BLOCKS.register("radioactive_polished_andesite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_ANDESITE_STAIRS  = BLOCKS.register("radioactive_polished_andesite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.POLISHED_ANDESITE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_DIORITE_BLOCK = BLOCKS.register("radioactive_diorite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DIORITE_SLAB = BLOCKS.register("radioactive_diorite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_DIORITE_STAIRS  = BLOCKS.register("radioactive_diorite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.DIORITE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_DIORITE_BLOCK = BLOCKS.register("radioactive_polished_diorite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_DIORITE_SLAB = BLOCKS.register("radioactive_polished_diorite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_DIORITE_STAIRS  = BLOCKS.register("radioactive_polished_diorite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.POLISHED_DIORITE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_GRANITE_BLOCK = BLOCKS.register("radioactive_granite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_GRANITE_SLAB = BLOCKS.register("radioactive_granite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_GRANITE_STAIRS  = BLOCKS.register("radioactive_granite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.GRANITE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_GRANITE_BLOCK = BLOCKS.register("radioactive_polished_granite_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_GRANITE_SLAB = BLOCKS.register("radioactive_polished_granite_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_POLISHED_GRANITE_STAIRS  = BLOCKS.register("radioactive_polished_granite_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.POLISHED_GRANITE_STAIRS::getDefaultState);
    });

    // Cobblestone
    public static final RegistryObject<Block> RADIOACTIVE_COBBLESTONE_BLOCK = BLOCKS.register("radioactive_cobblestone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_COBBLESTONE_BLOCK = BLOCKS.register("radioactive_mossy_cobblestone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_COBBLESTONE_SLAB = BLOCKS.register("radioactive_cobblestone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_COBBLESTONE_SLAB = BLOCKS.register("radioactive_mossy_cobblestone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_COBBLESTONE_STAIRS  = BLOCKS.register("radioactive_cobblestone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.COBBLESTONE_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_COBBLESTONE_STAIRS  = BLOCKS.register("radioactive_mossy_cobblestone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.MOSSY_COBBLESTONE_STAIRS::getDefaultState);
    });

    // Stone
    public static final RegistryObject<Block> RADIOACTIVE_STONE_BLOCK = BLOCKS.register("radioactive_stone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_STONE_BRICK_BLOCK = BLOCKS.register("radioactive_stone_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CRACKED_STONE_BRICK_BLOCK = BLOCKS.register("radioactive_cracked_stone_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_STONE_BRICK_BLOCK = BLOCKS.register("radioactive_mossy_stone_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CHISELED_STONE_BRICK_BLOCK = BLOCKS.register("radioactive_chiseled_stone_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_STONE_BLOCK = BLOCKS.register("radioactive_smooth_stone", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_STONE_SLAB = BLOCKS.register("radioactive_stone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STONE_STAIRS  = BLOCKS.register("radioactive_stone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.STONE_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_STONE_BRICK_SLAB = BLOCKS.register("radioactive_stone_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STONE_BRICK_STAIRS  = BLOCKS.register("radioactive_stone_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.STONE_BRICK_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_STONE_BRICK_SLAB = BLOCKS.register("radioactive_mossy_stone_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_MOSSY_STONE_BRICK_STAIRS  = BLOCKS.register("radioactive_mossy_stone_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.MOSSY_STONE_BRICK_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_STONE_SLAB = BLOCKS.register("radioactive_smooth_stone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));

    // Sandstone
    public static final RegistryObject<Block> RADIOACTIVE_SANDSTONE_BLOCK = BLOCKS.register("radioactive_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CHISELED_SANDSTONE_BLOCK = BLOCKS.register("radioactive_chiseled_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CUT_SANDSTONE_BLOCK = BLOCKS.register("radioactive_cut_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_SANDSTONE_BLOCK = BLOCKS.register("radioactive_smooth_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_SANDSTONE_SLAB = BLOCKS.register("radioactive_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_SANDSTONE_STAIRS  = BLOCKS.register("radioactive_sandstone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, Blocks.SANDSTONE_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_CUT_SANDSTONE_SLAB = BLOCKS.register("radioactive_cut_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("radioactive_smooth_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_SANDSTONE_STAIRS  = BLOCKS.register("radioactive_smooth_sandstone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, Blocks.SMOOTH_SANDSTONE_STAIRS::getDefaultState);
    });

    // Red Sandstone
    public static final RegistryObject<Block> RADIOACTIVE_RED_SANDSTONE_BLOCK = BLOCKS.register("radioactive_red_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_CHISELED_SANDSTONE_BLOCK = BLOCKS.register("radioactive_red_chiseled_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_CUT_SANDSTONE_BLOCK = BLOCKS.register("radioactive_red_cut_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_SMOOTH_SANDSTONE_BLOCK = BLOCKS.register("radioactive_red_smooth_sandstone_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_SANDSTONE_SLAB = BLOCKS.register("radioactive_red_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_RED_SANDSTONE_STAIRS  = BLOCKS.register("radioactive_red_sandstone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, Blocks.RED_SANDSTONE_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_RED_CUT_SANDSTONE_SLAB = BLOCKS.register("radioactive_red_cut_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_RED_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("radioactive_red_smooth_sandstone_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_RED_SMOOTH_SANDSTONE_STAIRS  = BLOCKS.register("radioactive_red_smooth_sandstone_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, Blocks.SMOOTH_RED_SANDSTONE_STAIRS::getDefaultState);
    });

    // Brick
    public static final RegistryObject<Block> RADIOACTIVE_BRICK_BLOCK = BLOCKS.register("radioactive_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BRICK_SLAB = BLOCKS.register("radioactive_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_BLOCK_BRICK_STAIRS  = BLOCKS.register("radioactive_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.BRICK_STAIRS::getDefaultState);
    });

    // Endstone
    public static final RegistryObject<Block> RADIOACTIVE_ENDSTONE_BLOCK = BLOCKS.register("radioactive_end_stone", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_ENDSTONE_BRICK_BLOCK = BLOCKS.register("radioactive_end_bricks", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_ENDSTONE_BRICK_SLAB = BLOCKS.register("radioactive_end_bricks_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_ENDSTONE_BRICK_STAIRS  = BLOCKS.register("radioactive_end_bricks_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.END_STONE_BRICK_STAIRS::getDefaultState);
    });

    // Nether Brick
    public static final RegistryObject<Block> RADIOACTIVE_NETHER_BRICK_BLOCK = BLOCKS.register("radioactive_nether_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_NETHER_BRICK_SLAB = BLOCKS.register("radioactive_nether_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_NETHER_BRICK_STAIRS  = BLOCKS.register("radioactive_nether_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.NETHER_BRICK_STAIRS::getDefaultState);
    });

    // Red Nether Brick
    public static final RegistryObject<Block> RADIOACTIVE_RED_NETHER_BRICK_BLOCK = BLOCKS.register("radioactive_red_nether_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_NETHER_BRICK_SLAB = BLOCKS.register("radioactive_red_nether_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_RED_NETHER_BRICK_STAIRS = BLOCKS.register("radioactive_red_nether_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.RED_NETHER_BRICK_STAIRS::getDefaultState);
    });

    // Prismarine
    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_BLOCK = BLOCKS.register("radioactive_prismarine_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_SLAB = BLOCKS.register("radioactive_prismarine_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_STAIRS  = BLOCKS.register("radioactive_prismarine_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.PRISMARINE_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_BRICK_BLOCK = BLOCKS.register("radioactive_prismarine_brick_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_BRICK_SLAB = BLOCKS.register("radioactive_prismarine_brick_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_PRISMARINE_BRICK_STAIRS  = BLOCKS.register("radioactive_prismarine_brick_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.PRISMARINE_BRICK_STAIRS::getDefaultState);
    });

    public static final RegistryObject<Block> RADIOACTIVE_DARK_PRISMARINE_BLOCK = BLOCKS.register("radioactive_dark_prismarine_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_PRISMARINE_SLAB = BLOCKS.register("radioactive_dark_prismarine_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_PRISMARINE_STAIRS  = BLOCKS.register("radioactive_dark_prismarine_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.DARK_PRISMARINE_STAIRS::getDefaultState);
    });

    // Purpur
    public static final RegistryObject<Block> RADIOACTIVE_PURPUR_BLOCK = BLOCKS.register("radioactive_purpur_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PURPUR_PILLAR = BLOCKS.register("radioactive_purpur_pillar", () -> new PillarBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_PURPUR_SLAB = BLOCKS.register("radioactive_purpur_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_PURPUR_STAIRS = BLOCKS.register("radioactive_purpur_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.PURPUR_STAIRS::getDefaultState);
    });

    // Quartz
    public static final RegistryObject<Block> RADIOACTIVE_QUARTZ_BLOCK = BLOCKS.register("radioactive_quartz_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CHISELED_QUARTZ_BLOCK = BLOCKS.register("radioactive_chiseled_quartz_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_QUARTZ_BLOCK = BLOCKS.register("radioactive_smooth_quartz_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, 15));
    public static final RegistryObject<Block> RADIOACTIVE_QUARTZ_PILLAR = BLOCKS.register("radioactive_quartz_pillar", () -> new PillarBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_QUARTZ_SLAB = BLOCKS.register("radioactive_quartz_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_QUARTZ_STAIRS  = BLOCKS.register("radioactive_quartz_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.QUARTZ_STAIRS::getDefaultState);
    });
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_QUARTZ_SLAB = BLOCKS.register("radioactive_smooth_quartz_slab", () -> new SlabBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_SMOOTH_QUARTZ_STAIRS  = BLOCKS.register("radioactive_smooth_quartz_stairs", () -> {
        return new StairBase(Material.ROCK, ToolType.PICKAXE, SoundType.STONE, Blocks.SMOOTH_QUARTZ_STAIRS::getDefaultState);
    });
    // ################ End Stone Blocks ################

    // Grass
    public static final RegistryObject<Block> RADIOACTIVE_LANDSCAPE_GRASS = BLOCKS.register("radioactive_landscape_grass", GrassBlockBase::new);

    // ################ Wood Blocks ################
    // Logs
    public static final RegistryObject<Block> RADIOACTIVE_ACACIA_LOG = BLOCKS.register("radioactive_acacia_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.ADOBE));
    public static final RegistryObject<Block> RADIOACTIVE_BIRCH_LOG = BLOCKS.register("radioactive_birch_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.SAND));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_OAK_LOG = BLOCKS.register("radioactive_dark_oak_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.BROWN));
    public static final RegistryObject<Block> RADIOACTIVE_JUNGLE_LOG = BLOCKS.register("radioactive_jungle_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.DIRT));
    public static final RegistryObject<Block> RADIOACTIVE_OAK_LOG = BLOCKS.register("radioactive_oak_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_SPRUCE_LOG = BLOCKS.register("radioactive_spruce_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.OBSIDIAN));

    // Stripped Logs
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_ACACIA_LOG = BLOCKS.register("radioactive_stripped_acacia_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.ADOBE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_BIRCH_LOG = BLOCKS.register("radioactive_stripped_birch_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.SAND));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_DARK_OAK_LOG = BLOCKS.register("radioactive_stripped_dark_oak_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.BROWN));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_JUNGLE_LOG = BLOCKS.register("radioactive_stripped_jungle_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.DIRT));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_OAK_LOG = BLOCKS.register("radioactive_stripped_oak_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_SPRUCE_LOG = BLOCKS.register("radioactive_stripped_spruce_log", () -> new LogBase(Material.ROCK, ToolType.AXE, SoundType.STONE, MaterialColor.OBSIDIAN));

    // Wood
    public static final RegistryObject<Block> RADIOACTIVE_ACACIA_WOOD = BLOCKS.register("radioactive_acacia_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_BIRCH_WOOD = BLOCKS.register("radioactive_birch_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_OAK_WOOD = BLOCKS.register("radioactive_dark_oak_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_JUNGLE_WOOD = BLOCKS.register("radioactive_jungle_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_OAK_WOOD = BLOCKS.register("radioactive_oak_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_SPRUCE_WOOD = BLOCKS.register("radioactive_spruce_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    // Stripped Wood
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_ACACIA_WOOD = BLOCKS.register("radioactive_stripped_acacia_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_BIRCH_WOOD = BLOCKS.register("radioactive_stripped_birch_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_DARK_OAK_WOOD = BLOCKS.register("radioactive_stripped_dark_oak_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_JUNGLE_WOOD = BLOCKS.register("radioactive_stripped_jungle_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_OAK_WOOD = BLOCKS.register("radioactive_stripped_oak_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));
    public static final RegistryObject<Block> RADIOACTIVE_STRIPPED_SPRUCE_WOOD = BLOCKS.register("radioactive_stripped_spruce_wood", () -> new PillarBase(Material.ROCK, ToolType.AXE, SoundType.STONE));

    // Planks
    public static final RegistryObject<Block> RADIOACTIVE_ACACIA_PLANKS = BLOCKS.register("radioactive_acacia_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BIRCH_PLANKS = BLOCKS.register("radioactive_birch_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_OAK_PLANKS = BLOCKS.register("radioactive_dark_oak_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));
    public static final RegistryObject<Block> RADIOACTIVE_JUNGLE_PLANKS = BLOCKS.register("radioactive_jungle_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));
    public static final RegistryObject<Block> RADIOACTIVE_OAK_PLANKS = BLOCKS.register("radioactive_oak_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));
    public static final RegistryObject<Block> RADIOACTIVE_SPRUCE_PLANKS = BLOCKS.register("radioactive_spruce_planks", () -> new BlockBase(Material.ROCK, ToolType.AXE, SoundType.WOOD, 15));

    // Slabs
    public static final RegistryObject<Block> RADIOACTIVE_ACACIA_SLAB = BLOCKS.register("radioactive_acacia_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_BIRCH_SLAB = BLOCKS.register("radioactive_birch_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_OAK_SLAB = BLOCKS.register("radioactive_dark_oak_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_JUNGLE_SLAB = BLOCKS.register("radioactive_jungle_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_OAK_SLAB = BLOCKS.register("radioactive_oak_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));
    public static final RegistryObject<Block> RADIOACTIVE_SPRUCE_SLAB = BLOCKS.register("radioactive_spruce_slab", () -> new SlabBase(Material.ROCK, ToolType.AXE, SoundType.WOOD));

    // Stairs
    // ################ End Wood Blocks ################
    public static final RegistryObject<Block> RADIOACTIVE_ACACIA_STAIRS = BLOCKS.register("radioactive_acacia_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.ACACIA_STAIRS::getDefaultState
    ));
    public static final RegistryObject<Block> RADIOACTIVE_BIRCH_STAIRS = BLOCKS.register("radioactive_birch_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.SPRUCE_STAIRS::getDefaultState
    ));
    public static final RegistryObject<Block> RADIOACTIVE_DARK_OAK_STAIRS = BLOCKS.register("radioactive_dark_oak_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.DARK_OAK_STAIRS::getDefaultState
    ));
    public static final RegistryObject<Block> RADIOACTIVE_JUNGLE_STAIRS = BLOCKS.register("radioactive_jungle_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.JUNGLE_STAIRS::getDefaultState
    ));
    public static final RegistryObject<Block> RADIOACTIVE_OAK_STAIRS = BLOCKS.register("radioactive_oak_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.OAK_STAIRS::getDefaultState
    ));
    public static final RegistryObject<Block> RADIOACTIVE_SPRUCE_STAIRS = BLOCKS.register("radioactive_spruce_stairs", () -> new StairBase(
            Material.ROCK, ToolType.AXE, SoundType.WOOD, Blocks.SPRUCE_STAIRS::getDefaultState
    ));

    // ################ Terracotta Blocks ################
    // Regular
    public static final RegistryObject<Block> RADIOACTIVE_TERRACOTTA = BLOCKS.register("radioactive_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BLACK_TERRACOTTA = BLOCKS.register("radioactive_black_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BLUE_TERRACOTTA = BLOCKS.register("radioactive_blue_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BROWN_TERRACOTTA = BLOCKS.register("radioactive_brown_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CYAN_TERRACOTTA = BLOCKS.register("radioactive_cyan_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_GRAY_TERRACOTTA = BLOCKS.register("radioactive_gray_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_GREEN_TERRACOTTA = BLOCKS.register("radioactive_green_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("radioactive_light_blue_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("radioactive_light_gray_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIME_TERRACOTTA = BLOCKS.register("radioactive_lime_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_MAGENTA_TERRACOTTA = BLOCKS.register("radioactive_magenta_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_ORANGE_TERRACOTTA = BLOCKS.register("radioactive_orange_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PINK_TERRACOTTA = BLOCKS.register("radioactive_pink_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PURPLE_TERRACOTTA = BLOCKS.register("radioactive_purple_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_TERRACOTTA = BLOCKS.register("radioactive_red_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_WHITE_TERRACOTTA = BLOCKS.register("radioactive_white_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_YELLOW_TERRACOTTA = BLOCKS.register("radioactive_yellow_terracotta", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));

    // Glazed
    public static final RegistryObject<Block> RADIOACTIVE_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_black_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_blue_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_brown_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_CYAN_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_cyan_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_gray_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_GREEN_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_green_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_light_blue_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_light_gray_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_LIME_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_lime_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_MAGENTA_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_magenta_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_ORANGE_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_orange_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_PINK_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_pink_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_PURPLE_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_purple_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_RED_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_red_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_WHITE_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_white_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    public static final RegistryObject<Block> RADIOACTIVE_YELLOW_GLAZED_TERRACOTTA = BLOCKS.register("radioactive_yellow_glazed_terracotta", () -> new GlazedTerracottaBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND));
    // ################ End Terracotta Blocks ################

    // ################ Concrete Blocks ################
    public static final RegistryObject<Block> RADIOACTIVE_BLACK_CONCRETE = BLOCKS.register("radioactive_black_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BLUE_CONCRETE = BLOCKS.register("radioactive_blue_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BROWN_CONCRETE = BLOCKS.register("radioactive_brown_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_CYAN_CONCRETE = BLOCKS.register("radioactive_cyan_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_GRAY_CONCRETE = BLOCKS.register("radioactive_gray_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_GREEN_CONCRETE = BLOCKS.register("radioactive_green_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_BLUE_CONCRETE = BLOCKS.register("radioactive_light_blue_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIGHT_GRAY_CONCRETE = BLOCKS.register("radioactive_light_gray_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_LIME_CONCRETE = BLOCKS.register("radioactive_lime_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_MAGENTA_CONCRETE = BLOCKS.register("radioactive_magenta_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_ORANGE_CONCRETE = BLOCKS.register("radioactive_orange_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PINK_CONCRETE = BLOCKS.register("radioactive_pink_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_PURPLE_CONCRETE = BLOCKS.register("radioactive_purple_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_RED_CONCRETE = BLOCKS.register("radioactive_red_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_WHITE_CONCRETE = BLOCKS.register("radioactive_white_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_YELLOW_CONCRETE = BLOCKS.register("radioactive_yellow_concrete", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    // ################ End Concrete Blocks ################

    // ################ Coral Blocks ################
    // Color
    public static final RegistryObject<Block> RADIOACTIVE_BRAIN_CORAL_BLOCK = BLOCKS.register("radioactive_brain_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_BUBBLE_CORAL_BLOCK = BLOCKS.register("radioactive_bubble_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_FIRE_CORAL_BLOCK = BLOCKS.register("radioactive_fire_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_HORN_CORAL_BLOCK = BLOCKS.register("radioactive_horn_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_TUBE_CORAL_BLOCK = BLOCKS.register("radioactive_tube_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));

    // Dead
    public static final RegistryObject<Block> RADIOACTIVE_DEAD_BRAIN_CORAL_BLOCK = BLOCKS.register("radioactive_dead_brain_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DEAD_BUBBLE_CORAL_BLOCK = BLOCKS.register("radioactive_dead_bubble_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DEAD_FIRE_CORAL_BLOCK = BLOCKS.register("radioactive_dead_fire_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DEAD_HORN_CORAL_BLOCK = BLOCKS.register("radioactive_dead_horn_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    public static final RegistryObject<Block> RADIOACTIVE_DEAD_TUBE_CORAL_BLOCK = BLOCKS.register("radioactive_dead_tube_coral_block", () -> new BlockBase(Material.ROCK, ToolType.PICKAXE, SoundType.GROUND, 15));
    // ################ End Coral Blocks ################

    /*
    ++++++++++++++++ BLOCK ITEMS ++++++++++++++++
    * */

    //--------- Metal Block Items ---------
    public static final RegistryObject<Item> AMERICIUM_BLOCK_ITEM = ITEMS.register("americium_block", () -> new BlockItemBase(AMERICIUM_BLOCK.get()));
    public static final RegistryObject<Item> BERKELIUM_BLOCK_ITEM = ITEMS.register("berkelium_block", () -> new BlockItemBase(BERKELIUM_BLOCK.get()));
    public static final RegistryObject<Item> NEPTUNIUM_BLOCK_ITEM = ITEMS.register("neptunium_block", () -> new BlockItemBase(NEPTUNIUM_BLOCK.get()));
    public static final RegistryObject<Item> PLUTONIUM_BLOCK_ITEM = ITEMS.register("plutonium_block", () -> new BlockItemBase(PLUTONIUM_BLOCK.get()));
    public static final RegistryObject<Item> PROTACTINIUM_BLOCK_ITEM = ITEMS.register("protactinium_block", () -> new BlockItemBase(PROTACTINIUM_BLOCK.get()));
    public static final RegistryObject<Item> RADIUM_BLOCK_ITEM = ITEMS.register("radium_block", () -> new BlockItemBase(RADIUM_BLOCK.get()));
    public static final RegistryObject<Item> TECHNETIUM_BLOCK_ITEM = ITEMS.register("technetium_block", () -> new BlockItemBase(TECHNETIUM_BLOCK.get()));
    public static final RegistryObject<Item> THORIUM_BLOCK_ITEM = ITEMS.register("thorium_block", () -> new BlockItemBase(THORIUM_BLOCK.get()));
    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ITEMS.register("uranium_block", () -> new BlockItemBase(URANIUM_BLOCK.get()));

    //--------- Stone Block Items ---------
    // Decorative Stone
    public static final RegistryObject<Item> RADIOACTIVE_ANDESITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_andesite_block",
            () -> new BlockItemBase(RADIOACTIVE_ANDESITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_ANDESITE_SLAB_ITEM = ITEMS.register(
            "radioactive_andesite_slab",
            () -> new BlockItemBase(RADIOACTIVE_ANDESITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_ANDESITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_andesite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_ANDESITE_STAIRS.get())
    );

    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_ANDESITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_polished_andesite_block",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_ANDESITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_ANDESITE_SLAB_ITEM = ITEMS.register(
            "radioactive_polished_andesite_slab",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_ANDESITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_ANDESITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_polished_andesite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_ANDESITE_STAIRS.get())
    );

    public static final RegistryObject<Item> RADIOACTIVE_DIORITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_diorite_block",
            () -> new BlockItemBase(RADIOACTIVE_DIORITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DIORITE_SLAB_ITEM = ITEMS.register(
            "radioactive_diorite_slab",
            () -> new BlockItemBase(RADIOACTIVE_DIORITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DIORITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_diorite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_DIORITE_STAIRS.get())
    );

    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_DIORITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_polished_diorite_block",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_DIORITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_DIORITE_SLAB_ITEM = ITEMS.register(
            "radioactive_polished_diorite_slab",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_DIORITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_DIORITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_polished_diorite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_DIORITE_STAIRS.get())
    );

    public static final RegistryObject<Item> RADIOACTIVE_GRANITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_granite_block",
            () -> new BlockItemBase(RADIOACTIVE_GRANITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_GRANITE_SLAB_ITEM = ITEMS.register(
            "radioactive_granite_slab",
            () -> new BlockItemBase(RADIOACTIVE_GRANITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_GRANITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_granite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_GRANITE_STAIRS.get())
    );

    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_GRANITE_BLOCK_ITEM = ITEMS.register(
            "radioactive_polished_granite_block",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_GRANITE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_GRANITE_SLAB_ITEM = ITEMS.register(
            "radioactive_polished_granite_slab",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_GRANITE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_POLISHED_GRANITE_STAIRS_ITEM = ITEMS.register(
            "radioactive_polished_granite_stairs",
            () -> new BlockItemBase(RADIOACTIVE_POLISHED_GRANITE_STAIRS.get())
    );

    // Cobblestone
    public static final RegistryObject<Item> RADIOACTIVE_COBBLESTONE_ITEM = ITEMS.register(
            "radioactive_cobblestone_block",
            () -> new BlockItemBase(RADIOACTIVE_COBBLESTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_COBBLESTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_mossy_cobblestone_block",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_COBBLESTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_COBBLESTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_cobblestone_slab",
            () -> new BlockItemBase(RADIOACTIVE_COBBLESTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_COBBLESTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_mossy_cobblestone_slab",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_COBBLESTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_COBBLESTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_cobblestone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_COBBLESTONE_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_COBBLESTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_mossy_cobblestone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_COBBLESTONE_STAIRS.get())
    );

    // Stone
    public static final RegistryObject<Item> RADIOACTIVE_STONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_stone_block",
            () -> new BlockItemBase(RADIOACTIVE_STONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STONE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_stone_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_STONE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CRACKED_STONE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_cracked_stone_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_CRACKED_STONE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_STONE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_mossy_stone_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_STONE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CHISELED_STONE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_chiseled_stone_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_CHISELED_STONE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_STONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_smooth_stone",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_STONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STONE_SLAB_ITEM = ITEMS.register(
            "radioactive_stone_slab",
            () -> new BlockItemBase(RADIOACTIVE_STONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_stone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_STONE_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STONE_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_stone_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_STONE_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STONE_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_stone_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_STONE_BRICK_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_STONE_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_mossy_stone_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_STONE_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_MOSSY_STONE_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_mossy_stone_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_MOSSY_STONE_BRICK_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_STONE_SLAB_ITEM = ITEMS.register(
            "radioactive_smooth_stone_slab",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_STONE_SLAB.get())
    );

    // Sandstone
    public static final RegistryObject<Item> RADIOACTIVE_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CHISELED_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_chiseled_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_CHISELED_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CUT_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_cut_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_CUT_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_smooth_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SANDSTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_sandstone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_SANDSTONE_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CUT_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_cut_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_CUT_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_smooth_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_smooth_sandstone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_SANDSTONE_STAIRS.get())
    );

    // Red Sandstone
    public static final RegistryObject<Item> RADIOACTIVE_RED_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_red_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_RED_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_CHISELED_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_red_chiseled_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_RED_CHISELED_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_CUT_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_red_cut_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_RED_CUT_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_SMOOTH_SANDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_red_smooth_sandstone_block",
            () -> new BlockItemBase(RADIOACTIVE_RED_SMOOTH_SANDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_red_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_RED_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_SANDSTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_red_sandstone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_RED_SANDSTONE_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_CUT_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_red_cut_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_RED_CUT_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register(
            "radioactive_red_smooth_sandstone_slab",
            () -> new BlockItemBase(RADIOACTIVE_RED_SMOOTH_SANDSTONE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register(
            "radioactive_red_smooth_sandstone_stairs",
            () -> new BlockItemBase(RADIOACTIVE_RED_SMOOTH_SANDSTONE_STAIRS.get())
    );

    // Brick
    public static final RegistryObject<Item> RADIOACTIVE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_BLOCK_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_BLOCK_BRICK_STAIRS.get())
    );

    // Endstone
    public static final RegistryObject<Item> RADIOACTIVE_ENDSTONE_BLOCK_ITEM = ITEMS.register(
            "radioactive_end_stone",
            () -> new BlockItemBase(RADIOACTIVE_ENDSTONE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_ENDSTONE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_end_bricks",
            () -> new BlockItemBase(RADIOACTIVE_ENDSTONE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_ENDSTONE_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_end_bricks_slab",
            () -> new BlockItemBase(RADIOACTIVE_ENDSTONE_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_ENDSTONE_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_end_bricks_stairs",
            () -> new BlockItemBase(RADIOACTIVE_ENDSTONE_BRICK_STAIRS.get())
    );

    // Nether Brick
    public static final RegistryObject<Item> RADIOACTIVE_NETHER_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_nether_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_NETHER_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_NETHER_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_nether_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_NETHER_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_NETHER_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_nether_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_NETHER_BRICK_STAIRS.get())
    );

    // Red Nether Brick
    public static final RegistryObject<Item> RADIOACTIVE_RED_NETHER_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_red_nether_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_RED_NETHER_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_NETHER_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_red_nether_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_RED_NETHER_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_RED_NETHER_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_red_nether_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_RED_NETHER_BRICK_STAIRS.get())
    );

    // Prismarine
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_BLOCK_ITEM = ITEMS.register(
            "radioactive_prismarine_block",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_SLAB_ITEM = ITEMS.register(
            "radioactive_prismarine_slab",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_STAIRS_ITEM = ITEMS.register(
            "radioactive_prismarine_stairs",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_BRICK_BLOCK_ITEM = ITEMS.register(
            "radioactive_prismarine_brick_block",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_BRICK_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_BRICK_SLAB_ITEM = ITEMS.register(
            "radioactive_prismarine_brick_slab",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_BRICK_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PRISMARINE_BRICK_STAIRS_ITEM = ITEMS.register(
            "radioactive_prismarine_brick_stairs",
            () -> new BlockItemBase(RADIOACTIVE_PRISMARINE_BRICK_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DARK_PRISMARINE_BLOCK_ITEM = ITEMS.register(
            "radioactive_dark_prismarine_block",
            () -> new BlockItemBase(RADIOACTIVE_DARK_PRISMARINE_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DARK_PRISMARINE_SLAB_ITEM = ITEMS.register(
            "radioactive_dark_prismarine_slab",
            () -> new BlockItemBase(RADIOACTIVE_DARK_PRISMARINE_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DARK_PRISMARINE_STAIRS_ITEM = ITEMS.register(
            "radioactive_dark_prismarine_stairs",
            () -> new BlockItemBase(RADIOACTIVE_DARK_PRISMARINE_STAIRS.get())
    );

    // Purpur
    public static final RegistryObject<Item> RADIOACTIVE_PURPUR_BLOCK_ITEM = ITEMS.register(
            "radioactive_purpur_block",
            () -> new BlockItemBase(RADIOACTIVE_PURPUR_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PURPUR_PILLAR_ITEM = ITEMS.register(
            "radioactive_purpur_pillar",
            () -> new BlockItemBase(RADIOACTIVE_PURPUR_PILLAR.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PURPUR_SLAB_ITEM = ITEMS.register(
            "radioactive_purpur_slab",
            () -> new BlockItemBase(RADIOACTIVE_PURPUR_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_PURPUR_STAIRS_ITEM = ITEMS.register(
            "radioactive_purpur_stairs",
            () -> new BlockItemBase(RADIOACTIVE_PURPUR_STAIRS.get())
    );

    // Quartz
    public static final RegistryObject<Item> RADIOACTIVE_QUARTZ_BLOCK_ITEM = ITEMS.register(
            "radioactive_quartz_block",
            () -> new BlockItemBase(RADIOACTIVE_QUARTZ_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_CHISELED_QUARTZ_BLOCK_ITEM = ITEMS.register(
            "radioactive_chiseled_quartz_block",
            () -> new BlockItemBase(RADIOACTIVE_CHISELED_QUARTZ_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_QUARTZ_PILLAR_ITEM = ITEMS.register(
            "radioactive_quartz_pillar",
            () -> new BlockItemBase(RADIOACTIVE_QUARTZ_PILLAR.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_QUARTZ_BLOCK_ITEM = ITEMS.register(
            "radioactive_smooth_quartz_block",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_QUARTZ_BLOCK.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_QUARTZ_SLAB_ITEM = ITEMS.register(
            "radioactive_quartz_slab",
            () -> new BlockItemBase(RADIOACTIVE_QUARTZ_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_QUARTZ_STAIRS_ITEM = ITEMS.register(
            "radioactive_quartz_stairs",
            () -> new BlockItemBase(RADIOACTIVE_QUARTZ_STAIRS.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_QUARTZ_SLAB_ITEM = ITEMS.register(
            "radioactive_smooth_quartz_slab",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_QUARTZ_SLAB.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SMOOTH_QUARTZ_STAIRS_ITEM = ITEMS.register(
            "radioactive_smooth_quartz_stairs",
            () -> new BlockItemBase(RADIOACTIVE_SMOOTH_QUARTZ_STAIRS.get())
    );

    // Grass
    public static final RegistryObject<Item> RADIOACTIVE_LANDSCAPE_GRASS_ITEM = ITEMS.register(
            "radioactive_landscape_grass",
            () -> new BlockItemBase(RADIOACTIVE_LANDSCAPE_GRASS.get())
    );

    //--------- Wooden Block Items ---------
    // Logs
    public static final RegistryObject<Item> RADIOACTIVE_ACACIA_LOG_ITEM = ITEMS.register(
            "radioactive_acacia_log",
            () -> new BlockItemBase(RADIOACTIVE_ACACIA_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_BIRCH_LOG_ITEM = ITEMS.register(
            "radioactive_birch_log",
            () -> new BlockItemBase(RADIOACTIVE_BIRCH_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DARK_OAK_LOG_ITEM = ITEMS.register(
            "radioactive_dark_oak_log",
            () -> new BlockItemBase(RADIOACTIVE_DARK_OAK_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_JUNGLE_LOG_ITEM = ITEMS.register(
            "radioactive_jungle_log",
            () -> new BlockItemBase(RADIOACTIVE_JUNGLE_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_OAK_LOG_ITEM = ITEMS.register(
            "radioactive_oak_log",
            () -> new BlockItemBase(RADIOACTIVE_OAK_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SPRUCE_LOG_ITEM = ITEMS.register(
            "radioactive_spruce_log",
            () -> new BlockItemBase(RADIOACTIVE_SPRUCE_LOG.get())
    );

    // Stripped Logs
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_ACACIA_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_acacia_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_ACACIA_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_BIRCH_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_birch_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_BIRCH_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_DARK_OAK_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_dark_oak_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_DARK_OAK_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_JUNGLE_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_jungle_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_JUNGLE_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_OAK_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_oak_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_OAK_LOG.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_SPRUCE_LOG_ITEM = ITEMS.register(
            "radioactive_stripped_spruce_log",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_SPRUCE_LOG.get())
    );

    // Wood
    public static final RegistryObject<Item> RADIOACTIVE_ACACIA_WOOD_ITEM = ITEMS.register(
            "radioactive_acacia_wood",
            () -> new BlockItemBase(RADIOACTIVE_ACACIA_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_BIRCH_WOOD_ITEM = ITEMS.register(
            "radioactive_birch_wood",
            () -> new BlockItemBase(RADIOACTIVE_BIRCH_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_DARK_OAK_WOOD_ITEM = ITEMS.register(
            "radioactive_dark_oak_wood",
            () -> new BlockItemBase(RADIOACTIVE_DARK_OAK_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_JUNGLE_WOOD_ITEM = ITEMS.register(
            "radioactive_jungle_wood",
            () -> new BlockItemBase(RADIOACTIVE_JUNGLE_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_OAK_WOOD_ITEM = ITEMS.register(
            "radioactive_oak_wood",
            () -> new BlockItemBase(RADIOACTIVE_OAK_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_SPRUCE_WOOD_ITEM = ITEMS.register(
            "radioactive_spruce_wood",
            () -> new BlockItemBase(RADIOACTIVE_SPRUCE_WOOD.get())
    );

    // Stripped Wood
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_ACACIA_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_acacia_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_ACACIA_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_BIRCH_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_birch_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_BIRCH_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_DARK_OAK_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_dark_oak_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_DARK_OAK_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_JUNGLE_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_jungle_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_JUNGLE_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_OAK_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_oak_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_OAK_WOOD.get())
    );
    public static final RegistryObject<Item> RADIOACTIVE_STRIPPED_SPRUCE_WOOD_ITEM = ITEMS.register(
            "radioactive_stripped_spruce_wood",
            () -> new BlockItemBase(RADIOACTIVE_STRIPPED_SPRUCE_WOOD.get())
    );

    // Grass

    // Wood Planks
    public static final RegistryObject<Item> RADIOACTIVE_ACACIA_PLANKS_ITEM = ITEMS.register("radioactive_acacia_planks", () -> new BlockItemBase(RADIOACTIVE_ACACIA_PLANKS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BIRCH_PLANKS_ITEM = ITEMS.register("radioactive_birch_planks", () -> new BlockItemBase(RADIOACTIVE_BIRCH_PLANKS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DARK_OAK_PLANKS_ITEM = ITEMS.register("radioactive_dark_oak_planks", () -> new BlockItemBase(RADIOACTIVE_DARK_OAK_PLANKS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_JUNGLE_PLANKS_ITEM = ITEMS.register("radioactive_jungle_planks", () -> new BlockItemBase(RADIOACTIVE_JUNGLE_PLANKS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_OAK_PLANKS_ITEM = ITEMS.register("radioactive_oak_planks", () -> new BlockItemBase(RADIOACTIVE_OAK_PLANKS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_SPRUCE_PLANKS_ITEM = ITEMS.register("radioactive_spruce_planks", () -> new BlockItemBase(RADIOACTIVE_SPRUCE_PLANKS.get()));

    // Wood Slabs
    public static final RegistryObject<Item> RADIOACTIVE_ACACIA_SLAB_ITEM = ITEMS.register(("radioactive_acacia_slab"), () -> new BlockItemBase(RADIOACTIVE_ACACIA_SLAB.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BIRCH_SLAB_ITEM = ITEMS.register("radioactive_birch_slab", () -> new BlockItemBase(RADIOACTIVE_BIRCH_SLAB.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DARK_OAK_SLAB_ITEM = ITEMS.register("radioactive_dark_oak_slab", () -> new BlockItemBase(RADIOACTIVE_DARK_OAK_SLAB.get()));
    public static final RegistryObject<Item> RADIOACTIVE_JUNGLE_SLAB_ITEM = ITEMS.register("radioactive_jungle_slab", () -> new BlockItemBase(RADIOACTIVE_JUNGLE_SLAB.get()));
    public static final RegistryObject<Item> RADIOACTIVE_OAK_SLAB_ITEM = ITEMS.register("radioactive_oak_slab", () -> new BlockItemBase(RADIOACTIVE_OAK_SLAB.get()));
    public static final RegistryObject<Item> RADIOACTIVE_SPRUCE_SLAB_ITEM = ITEMS.register("radioactive_spruce_slab", () -> new BlockItemBase(RADIOACTIVE_SPRUCE_SLAB.get()));

    // Wood Stairs
    public static final RegistryObject<Item> RADIOACTIVE_ACACIA_STAIRS_ITEM = ITEMS.register(("radioactive_acacia_stairs"), () -> new BlockItemBase(RADIOACTIVE_ACACIA_STAIRS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BIRCH_STAIRS_ITEM = ITEMS.register("radioactive_birch_stairs", () -> new BlockItemBase(RADIOACTIVE_BIRCH_STAIRS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DARK_OAK_STAIRS_ITEM = ITEMS.register("radioactive_dark_oak_stairs", () -> new BlockItemBase(RADIOACTIVE_DARK_OAK_STAIRS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_JUNGLE_STAIRS_ITEM = ITEMS.register("radioactive_jungle_stairs", () -> new BlockItemBase(RADIOACTIVE_JUNGLE_STAIRS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_OAK_STAIRS_ITEM = ITEMS.register("radioactive_oak_stairs", () -> new BlockItemBase(RADIOACTIVE_OAK_STAIRS.get()));
    public static final RegistryObject<Item> RADIOACTIVE_SPRUCE_STAIRS_ITEM = ITEMS.register("radioactive_spruce_stairs", () -> new BlockItemBase(RADIOACTIVE_SPRUCE_STAIRS.get()));

    // Terracotta
    public static final RegistryObject<Item> RADIOACTIVE_TERRACOTTA_ITEM = ITEMS.register("radioactive_terracotta", () -> new BlockItemBase(RADIOACTIVE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BLACK_TERRACOTTA_ITEM = ITEMS.register("radioactive_black_terracotta", () -> new BlockItemBase(RADIOACTIVE_BLACK_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BLUE_TERRACOTTA_ITEM = ITEMS.register("radioactive_blue_terracotta", () -> new BlockItemBase(RADIOACTIVE_BLUE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BROWN_TERRACOTTA_ITEM = ITEMS.register("radioactive_brown_terracotta", () -> new BlockItemBase(RADIOACTIVE_BROWN_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_CYAN_TERRACOTTA_ITEM = ITEMS.register("radioactive_cyan_terracotta", () -> new BlockItemBase(RADIOACTIVE_CYAN_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GRAY_TERRACOTTA_ITEM = ITEMS.register("radioactive_gray_terracotta", () -> new BlockItemBase(RADIOACTIVE_GRAY_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GREEN_TERRACOTTA_ITEM = ITEMS.register("radioactive_green_terracotta", () -> new BlockItemBase(RADIOACTIVE_GREEN_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_BLUE_TERRACOTTA_ITEM = ITEMS.register("radioactive_light_blue_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIGHT_BLUE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_GRAY_TERRACOTTA_ITEM = ITEMS.register("radioactive_light_gray_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIGHT_GRAY_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIME_TERRACOTTA_ITEM = ITEMS.register("radioactive_lime_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIME_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_MAGENTA_TERRACOTTA_ITEM = ITEMS.register("radioactive_magenta_terracotta", () -> new BlockItemBase(RADIOACTIVE_MAGENTA_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_ORANGE_TERRACOTTA_ITEM = ITEMS.register("radioactive_orange_terracotta", () -> new BlockItemBase(RADIOACTIVE_ORANGE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PINK_TERRACOTTA_ITEM = ITEMS.register("radioactive_pink_terracotta", () -> new BlockItemBase(RADIOACTIVE_PINK_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PURPLE_TERRACOTTA_ITEM = ITEMS.register("radioactive_purple_terracotta", () -> new BlockItemBase(RADIOACTIVE_PURPLE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_RED_TERRACOTTA_ITEM = ITEMS.register("radioactive_red_terracotta", () -> new BlockItemBase(RADIOACTIVE_RED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_WHITE_TERRACOTTA_ITEM = ITEMS.register("radioactive_white_terracotta", () -> new BlockItemBase(RADIOACTIVE_WHITE_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_YELLOW_TERRACOTTA_ITEM = ITEMS.register("radioactive_yellow_terracotta", () -> new BlockItemBase(RADIOACTIVE_YELLOW_TERRACOTTA.get()));

    // Glazed Terracotta
    public static final RegistryObject<Item> RADIOACTIVE_BLACK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_black_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_BLACK_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_blue_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_BLUE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BROWN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_brown_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_BROWN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_CYAN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_cyan_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_CYAN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_gray_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_GRAY_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GREEN_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_green_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_GREEN_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_BLUE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_light_blue_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIGHT_BLUE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_GRAY_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_light_gray_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIGHT_GRAY_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIME_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_lime_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_LIME_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_MAGENTA_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_magenta_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_MAGENTA_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_ORANGE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_orange_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_ORANGE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PINK_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_pink_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_PINK_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PURPLE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_purple_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_PURPLE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_RED_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_red_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_RED_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_WHITE_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_white_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_WHITE_GLAZED_TERRACOTTA.get()));
    public static final RegistryObject<Item> RADIOACTIVE_YELLOW_GLAZED_TERRACOTTA_ITEM = ITEMS.register("radioactive_yellow_glazed_terracotta", () -> new BlockItemBase(RADIOACTIVE_YELLOW_GLAZED_TERRACOTTA.get()));

    // Concrete
    public static final RegistryObject<Item> RADIOACTIVE_BLACK_CONCRETE_ITEM = ITEMS.register("radioactive_black_concrete", () -> new BlockItemBase(RADIOACTIVE_BLACK_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BLUE_CONCRETE_ITEM = ITEMS.register("radioactive_blue_concrete", () -> new BlockItemBase(RADIOACTIVE_BLUE_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BROWN_CONCRETE_ITEM = ITEMS.register("radioactive_brown_concrete", () -> new BlockItemBase(RADIOACTIVE_BROWN_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_CYAN_CONCRETE_ITEM = ITEMS.register("radioactive_cyan_concrete", () -> new BlockItemBase(RADIOACTIVE_CYAN_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GRAY_CONCRETE_ITEM = ITEMS.register("radioactive_gray_concrete", () -> new BlockItemBase(RADIOACTIVE_GRAY_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_GREEN_CONCRETE_ITEM = ITEMS.register("radioactive_green_concrete", () -> new BlockItemBase(RADIOACTIVE_GREEN_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_BLUE_CONCRETE_ITEM = ITEMS.register("radioactive_light_blue_concrete", () -> new BlockItemBase(RADIOACTIVE_LIGHT_BLUE_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIGHT_GRAY_CONCRETE_ITEM = ITEMS.register("radioactive_light_gray_concrete", () -> new BlockItemBase(RADIOACTIVE_LIGHT_GRAY_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_LIME_CONCRETE_ITEM = ITEMS.register("radioactive_lime_concrete", () -> new BlockItemBase(RADIOACTIVE_LIME_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_MAGENTA_CONCRETE_ITEM = ITEMS.register("radioactive_magenta_concrete", () -> new BlockItemBase(RADIOACTIVE_MAGENTA_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_ORANGE_CONCRETE_ITEM = ITEMS.register("radioactive_orange_concrete", () -> new BlockItemBase(RADIOACTIVE_ORANGE_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PINK_CONCRETE_ITEM = ITEMS.register("radioactive_pink_concrete", () -> new BlockItemBase(RADIOACTIVE_PINK_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_PURPLE_CONCRETE_ITEM = ITEMS.register("radioactive_purple_concrete", () -> new BlockItemBase(RADIOACTIVE_PURPLE_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_RED_CONCRETE_ITEM = ITEMS.register("radioactive_red_concrete", () -> new BlockItemBase(RADIOACTIVE_RED_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_WHITE_CONCRETE_ITEM = ITEMS.register("radioactive_white_concrete", () -> new BlockItemBase(RADIOACTIVE_WHITE_CONCRETE.get()));
    public static final RegistryObject<Item> RADIOACTIVE_YELLOW_CONCRETE_ITEM = ITEMS.register("radioactive_yellow_concrete", () -> new BlockItemBase(RADIOACTIVE_YELLOW_CONCRETE.get()));

    // Coral
    public static final RegistryObject<Item> RADIOACTIVE_BRAIN_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_brain_coral_block", () -> new BlockItemBase(RADIOACTIVE_BRAIN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_BUBBLE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_bubble_coral_block", () -> new BlockItemBase(RADIOACTIVE_BUBBLE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_FIRE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_fire_coral_block", () -> new BlockItemBase(RADIOACTIVE_FIRE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_HORN_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_horn_coral_block", () -> new BlockItemBase(RADIOACTIVE_HORN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_TUBE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_tube_coral_block", () -> new BlockItemBase(RADIOACTIVE_TUBE_CORAL_BLOCK.get()));

    // Dead Coral
    public static final RegistryObject<Item> RADIOACTIVE_DEAD_BRAIN_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_dead_brain_coral_block", () -> new BlockItemBase(RADIOACTIVE_DEAD_BRAIN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DEAD_BUBBLE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_dead_bubble_coral_block", () -> new BlockItemBase(RADIOACTIVE_DEAD_BUBBLE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DEAD_FIRE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_dead_fire_coral_block", () -> new BlockItemBase(RADIOACTIVE_DEAD_FIRE_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DEAD_HORN_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_dead_horn_coral_block", () -> new BlockItemBase(RADIOACTIVE_DEAD_HORN_CORAL_BLOCK.get()));
    public static final RegistryObject<Item> RADIOACTIVE_DEAD_TUBE_CORAL_BLOCK_ITEM = ITEMS.register("radioactive_dead_tube_coral_block", () -> new BlockItemBase(RADIOACTIVE_DEAD_TUBE_CORAL_BLOCK.get()));
}
