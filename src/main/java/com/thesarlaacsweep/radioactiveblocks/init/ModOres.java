package com.thesarlaacsweep.radioactiveblocks.init;

import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.blocks.BlockItemBase;
import com.thesarlaacsweep.radioactiveblocks.blocks.OreBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOres {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RadioactiveBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RadioactiveBlocks.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> AMERICIUM_ORE = BLOCKS.register("americium_ore", OreBlock::new);
    public static final RegistryObject<Block> BERKELIUM_ORE = BLOCKS.register("berkelium_ore", OreBlock::new);
    public static final RegistryObject<Block> NEPTUNIUM_ORE = BLOCKS.register("neptunium_ore", OreBlock::new);
    public static final RegistryObject<Block> PLUTONIUM_ORE = BLOCKS.register("plutonium_ore", OreBlock::new);
    public static final RegistryObject<Block> PROTACTINIUM_ORE = BLOCKS.register("protactinium_ore", OreBlock::new);
    public static final RegistryObject<Block> RADIUM_ORE = BLOCKS.register("radium_ore", OreBlock::new);
    public static final RegistryObject<Block> TECHNETIUM_ORE = BLOCKS.register("technetium_ore", OreBlock::new);
    public static final RegistryObject<Block> THORIUM_ORE = BLOCKS.register("thorium_ore", OreBlock::new);
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", OreBlock::new);

    // Ore Block Items
    public static final  RegistryObject<Item> AMERICIUM_ORE_ITEM = ITEMS.register("americium_ore", () -> new BlockItemBase(AMERICIUM_ORE.get()));
    public static final  RegistryObject<Item> BERKELIUM_ORE_ITEM = ITEMS.register("berkelium_ore", () -> new BlockItemBase(BERKELIUM_ORE.get()));
    public static final  RegistryObject<Item> NEPTUNIUM_ORE_ITEM = ITEMS.register("neptunium_ore", () -> new BlockItemBase(NEPTUNIUM_ORE.get()));
    public static final  RegistryObject<Item> PLUTONIUM_ORE_ITEM = ITEMS.register("plutonium_ore", () -> new BlockItemBase(PLUTONIUM_ORE.get()));
    public static final  RegistryObject<Item> PROTACTINIUM_ORE_ITEM = ITEMS.register("protactinium_ore", () -> new BlockItemBase(PROTACTINIUM_ORE.get()));
    public static final  RegistryObject<Item> RADIUM_ORE_ITEM = ITEMS.register("radium_ore", () -> new BlockItemBase(RADIUM_ORE.get()));
    public static final  RegistryObject<Item> TECHNETIUM_ORE_ITEM = ITEMS.register("technetium_ore", () -> new BlockItemBase(TECHNETIUM_ORE.get()));
    public static final  RegistryObject<Item> THORIUM_ORE_ITEM = ITEMS.register("thorium_ore", () -> new BlockItemBase(THORIUM_ORE.get()));
    public static final  RegistryObject<Item> URANIUM_ORE_ITEM = ITEMS.register("uranium_ore", () -> new BlockItemBase(URANIUM_ORE.get()));
}
