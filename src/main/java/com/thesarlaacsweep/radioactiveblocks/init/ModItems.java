package com.thesarlaacsweep.radioactiveblocks.init;

import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.items.*;
import com.thesarlaacsweep.radioactiveblocks.lists.ArmorMaterialList;
import com.thesarlaacsweep.radioactiveblocks.lists.ToolMaterialList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RadioactiveBlocks.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ################ Ingots ################
    public static final RegistryObject<Item> AMERICIUM_INGOT = ITEMS.register("americium_ingot", ItemBase::new);
    public static final RegistryObject<Item> BERKELIUM_INGOT = ITEMS.register("berkelium_ingot", ItemBase::new);
    public static final RegistryObject<Item> NEPTUNIUM_INGOT = ITEMS.register("neptunium_ingot", ItemBase::new);
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot", ItemBase::new);
    public static final RegistryObject<Item> PROTACTINIUM_INGOT = ITEMS.register("protactinium_ingot", ItemBase::new);
    public static final RegistryObject<Item> RADIUM_INGOT = ITEMS.register("radium_ingot", ItemBase::new);
    public static final RegistryObject<Item> TECHNETIUM_INGOT = ITEMS.register("technetium_ingot", ItemBase::new);
    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot", ItemBase::new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ItemBase::new);
    // ################ End Ingots ################

    // ################ Nuggets ################
    public static final RegistryObject<Item> AMERICIUM_NUGGET = ITEMS.register("americium_nugget", ItemBase::new);
    public static final RegistryObject<Item> BERKELIUM_NUGGET = ITEMS.register("berkelium_nugget", ItemBase::new);
    public static final RegistryObject<Item> NEPTUNIUM_NUGGET = ITEMS.register("neptunium_nugget", ItemBase::new);
    public static final RegistryObject<Item> PLUTONIUM_NUGGET = ITEMS.register("plutonium_nugget", ItemBase::new);
    public static final RegistryObject<Item> PROTACTINIUM_NUGGET = ITEMS.register("protactinium_nugget", ItemBase::new);
    public static final RegistryObject<Item> RADIUM_NUGGET = ITEMS.register("radium_nugget", ItemBase::new);
    public static final RegistryObject<Item> TECHNETIUM_NUGGET = ITEMS.register("technetium_nugget", ItemBase::new);
    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget", ItemBase::new);
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", ItemBase::new);
    // ################ End Nuggets ################

    // ################ Dusts ################
    public static final RegistryObject<Item> AMERICIUM_DUST = ITEMS.register("americium_dust", ItemBase::new);
    public static final RegistryObject<Item> BERKELIUM_DUST = ITEMS.register("berkelium_dust", ItemBase::new);
    public static final RegistryObject<Item> NEPTUNIUM_DUST = ITEMS.register("neptunium_dust", ItemBase::new);
    public static final RegistryObject<Item> PLUTONIUM_DUST = ITEMS.register("plutonium_dust", ItemBase::new);
    public static final RegistryObject<Item> PROTACTINIUM_DUST = ITEMS.register("protactinium_dust", ItemBase::new);
    public static final RegistryObject<Item> RADIUM_DUST = ITEMS.register("radium_dust", ItemBase::new);
    public static final RegistryObject<Item> TECHNETIUM_DUST = ITEMS.register("technetium_dust", ItemBase::new);
    public static final RegistryObject<Item> THORIUM_DUST = ITEMS.register("thorium_dust", ItemBase::new);
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust", ItemBase::new);
    // ################ End Dusts ################

    // Armor - Americium
    public static final RegistryObject<Item> AMERICIUM_HELMET = ITEMS.register("americium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.AMERICIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> AMERICIUM_CHESTPLATE = ITEMS.register("americium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.AMERICIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> AMERICIUM_LEGGINGS = ITEMS.register("americium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.AMERICIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> AMERICIUM_BOOTS = ITEMS.register("americium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.AMERICIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));

    // Armor - Berkelium
    public static final RegistryObject<Item> BERKELIUM_HELMET = ITEMS.register("berkelium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.BERKELIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> BERKELIUM_CHESTPLATE = ITEMS.register("berkelium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.BERKELIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> BERKELIUM_LEGGINGS = ITEMS.register("berkelium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.BERKELIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> BERKELIUM_BOOTS = ITEMS.register("berkelium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.BERKELIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Neptunium
    public static final RegistryObject<Item> NEPTUNIUM_HELMET = ITEMS.register("neptunium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.NEPTUNIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> NEPTUNIUM_CHESTPLATE = ITEMS.register("neptunium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.NEPTUNIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> NEPTUNIUM_LEGGINGS = ITEMS.register("neptunium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.NEPTUNIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> NEPTUNIUM_BOOTS = ITEMS.register("neptunium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.NEPTUNIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Plutonium
    public static final RegistryObject<Item> PLUTONIUM_HELMET = ITEMS.register("plutonium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PLUTONIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PLUTONIUM_CHESTPLATE = ITEMS.register("plutonium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PLUTONIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PLUTONIUM_LEGGINGS = ITEMS.register("plutonium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PLUTONIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PLUTONIUM_BOOTS = ITEMS.register("plutonium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PLUTONIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Protactinium
    public static final RegistryObject<Item> PROTACTINIUM_HELMET = ITEMS.register("protactinium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PROTACTINIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PROTACTINIUM_CHESTPLATE = ITEMS.register("protactinium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PROTACTINIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PROTACTINIUM_LEGGINGS = ITEMS.register("protactinium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PROTACTINIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> PROTACTINIUM_BOOTS = ITEMS.register("protactinium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.PROTACTINIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Radium
    public static final RegistryObject<Item> RADIUM_HELMET = ITEMS.register("radium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.RADIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> RADIUM_CHESTPLATE = ITEMS.register("radium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.RADIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> RADIUM_LEGGINGS = ITEMS.register("radium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.RADIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> RADIUM_BOOTS = ITEMS.register("radium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.RADIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Technetium
    public static final RegistryObject<Item> TECHNETIUM_HELMET = ITEMS.register("technetium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.TECHNETIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> TECHNETIUM_CHESTPLATE = ITEMS.register("technetium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.TECHNETIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> TECHNETIUM_LEGGINGS = ITEMS.register("technetium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.TECHNETIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> TECHNETIUM_BOOTS = ITEMS.register("technetium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.TECHNETIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Thorium
    public static final RegistryObject<Item> THORIUM_HELMET = ITEMS.register("thorium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.THORIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> THORIUM_CHESTPLATE = ITEMS.register("thorium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.THORIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> THORIUM_LEGGINGS = ITEMS.register("thorium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.THORIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> THORIUM_BOOTS = ITEMS.register("thorium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.THORIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    // Armor - Uranium
    public static final RegistryObject<Item> URANIUM_HELMET = ITEMS.register("uranium_helmet", () -> new RadioactiveArmorItem(
            ArmorMaterialList.URANIUM_ARMOR_MATERIAL,
            EquipmentSlotType.HEAD,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> URANIUM_CHESTPLATE = ITEMS.register("uranium_chestplate", () -> new RadioactiveArmorItem(
            ArmorMaterialList.URANIUM_ARMOR_MATERIAL,
            EquipmentSlotType.CHEST,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> URANIUM_LEGGINGS = ITEMS.register("uranium_leggings", () -> new RadioactiveArmorItem(
            ArmorMaterialList.URANIUM_ARMOR_MATERIAL,
            EquipmentSlotType.LEGS,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));
    public static final RegistryObject<Item> URANIUM_BOOTS = ITEMS.register("uranium_boots", () -> new RadioactiveArmorItem(
            ArmorMaterialList.URANIUM_ARMOR_MATERIAL,
            EquipmentSlotType.FEET,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB)
    ));

    // ################ Tools & Weapons ################
    public static final float HOE_ATTACK_SPEED = -3.0f;
    public static final float SUPER_FAST_ATTACK_SPEED = -1.2f;
    public static final float FAST_ATTACK_SPEED = -1.6f;
    public static final float MEDIUM_ATTACK_SPEED = -1.8f;
    public static final float AVERAGE_ATTACK_SPEED = -2.0f;
    public static final float SLOW_ATTACK_SPEED = -2.2f;
    public static final float SUPER_SLOW_ATTACK_SPEED = -2.6f;

    // Americium
    public static final RegistryObject<Item> AMERICIUM_SWORD = ITEMS.register("americium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.AMERICIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            16,
            2
    ));
    public static final RegistryObject<Item> AMERICIUM_PICKAXE = ITEMS.register("americium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.AMERICIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> AMERICIUM_AXE = ITEMS.register("americium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.AMERICIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> AMERICIUM_SHOVEL = ITEMS.register("americium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.AMERICIUM,
            1,
            SUPER_SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> AMERICIUM_HOE = ITEMS.register("americium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.AMERICIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    // Berkelium
    public static final RegistryObject<Item> BERKELIUM_SWORD = ITEMS.register("berkelium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.BERKELIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            17,
            2
    ));
    public static final RegistryObject<Item> BERKELIUM_PICKAXE = ITEMS.register("berkelium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.BERKELIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> BERKELIUM_AXE = ITEMS.register("berkelium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.BERKELIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> BERKELIUM_SHOVEL = ITEMS.register("berkelium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.BERKELIUM,
            1,
            SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> BERKELIUM_HOE = ITEMS.register("berkelium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.BERKELIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    // Neptunium
    public static final RegistryObject<Item> NEPTUNIUM_SWORD = ITEMS.register("neptunium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.NEPTUNIUM,
            3,
            SUPER_FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            16,
            3

    ));
    public static final RegistryObject<Item> NEPTUNIUM_PICKAXE = ITEMS.register("neptunium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.NEPTUNIUM,
            1,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> NEPTUNIUM_AXE = ITEMS.register("neptunium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.NEPTUNIUM,
            2,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> NEPTUNIUM_SHOVEL = ITEMS.register("neptunium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.NEPTUNIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> NEPTUNIUM_HOE = ITEMS.register("neptunium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.NEPTUNIUM,
            SUPER_SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    // Plutonium
    public static final RegistryObject<Item> PLUTONIUM_SWORD = ITEMS.register("plutonium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.PLUTONIUM,
            3,
            SUPER_FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            14,
            2

    ));
    public static final RegistryObject<Item> PLUTONIUM_PICKAXE = ITEMS.register("plutonium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.PLUTONIUM,
            1,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> PLUTONIUM_AXE = ITEMS.register("plutonium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.PLUTONIUM,
            2,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> PLUTONIUM_SHOVEL = ITEMS.register("plutonium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.PLUTONIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> PLUTONIUM_HOE = ITEMS.register("plutonium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.PLUTONIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            20,
            2
    ));

    // Protactinium
    public static final RegistryObject<Item> PROTACTINIUM_SWORD = ITEMS.register("protactinium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.PROTACTINIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            35,
            1

    ));
    public static final RegistryObject<Item> PROTACTINIUM_PICKAXE = ITEMS.register("protactinium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.PROTACTINIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> PROTACTINIUM_AXE = ITEMS.register("protactinium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.PROTACTINIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> PROTACTINIUM_SHOVEL = ITEMS.register("protactinium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.PROTACTINIUM,
            1,
            SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            3
    ));
    public static final RegistryObject<Item> PROTACTINIUM_HOE = ITEMS.register("protactinium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.PROTACTINIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    // Radium
    public static final RegistryObject<Item> RADIUM_SWORD = ITEMS.register("radium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.RADIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            13,
            4

    ));
    public static final RegistryObject<Item> RADIUM_PICKAXE = ITEMS.register("radium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.RADIUM,
            1,
            -2.4f,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> RADIUM_AXE = ITEMS.register("radium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.RADIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> RADIUM_SHOVEL = ITEMS.register("radium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.RADIUM,
            1,
            SUPER_SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            2
    ));
    public static final RegistryObject<Item> RADIUM_HOE = ITEMS.register("radium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.RADIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    // Technetium
    public static final RegistryObject<Item> TECHNETIUM_SWORD = ITEMS.register("technetium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.TECHNETIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            11,
            5
    ));
    public static final RegistryObject<Item> TECHNETIUM_PICKAXE = ITEMS.register("technetium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.TECHNETIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> TECHNETIUM_AXE = ITEMS.register("technetium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.TECHNETIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> TECHNETIUM_SHOVEL = ITEMS.register("technetium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.TECHNETIUM,
            1,
            SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            19,
            1
    ));
    public static final RegistryObject<Item> TECHNETIUM_HOE = ITEMS.register("technetium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.TECHNETIUM,
            HOE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            20,
            3
    ));

    // Thorium
    public static final RegistryObject<Item> THORIUM_SWORD = ITEMS.register("thorium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.THORIUM,
            3,
            SUPER_FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            12,
            5
    ));
    public static final RegistryObject<Item> THORIUM_PICKAXE = ITEMS.register("thorium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.THORIUM,
            1,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            5
    ));
    public static final RegistryObject<Item> THORIUM_AXE = ITEMS.register("thorium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.THORIUM,
            2,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            5
    ));
    public static final RegistryObject<Item> THORIUM_SHOVEL = ITEMS.register("thorium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.THORIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            18,
            5
    ));
    public static final RegistryObject<Item> THORIUM_HOE = ITEMS.register("thorium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.THORIUM,
            SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            20,
            3
    ));

    // Uranium
    public static final RegistryObject<Item> URANIUM_SWORD = ITEMS.register("uranium_sword", () -> new RadioactiveSwordItem(
            ToolMaterialList.URANIUM,
            3,
            FAST_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.COMBAT_TAB),
            14,
            3
    ));
    public static final RegistryObject<Item> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe", () -> new RadioactivePickaxeItem(
            ToolMaterialList.URANIUM,
            1,
            AVERAGE_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> URANIUM_AXE = ITEMS.register("uranium_axe", () -> new RadioactiveAxeItem(
            ToolMaterialList.URANIUM,
            2,
            MEDIUM_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> URANIUM_SHOVEL = ITEMS.register("uranium_shovel", () -> new RadioactiveShovelItem(
            ToolMaterialList.URANIUM,
            1,
            SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            21,
            3
    ));
    public static final RegistryObject<Item> URANIUM_HOE = ITEMS.register("uranium_hoe", () -> new RadioactiveHoeItem(
            ToolMaterialList.URANIUM,
            SUPER_SLOW_ATTACK_SPEED,
            new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB),
            35,
            1
    ));

    public static final RegistryObject<Item> ORE_MAUL = ITEMS.register("ore_maul", OreMaul::new);
    // ################ End Tools & Weapons ################
}
