package com.thesarlaacsweep.radioactiveblocks.lists;

import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public enum ArmorMaterialList implements IArmorMaterial {
    AMERICIUM_ARMOR_MATERIAL("americium", 28, new int[] {4, 6, 8, 4}, 17, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.AMERICIUM_INGOT.get());
    }),
    BERKELIUM_ARMOR_MATERIAL("berkelium", 28, new int[] {4, 6, 8, 4}, 19, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.BERKELIUM_INGOT.get());
    }),
    NEPTUNIUM_ARMOR_MATERIAL("neptunium", 30, new int[] {4, 6, 8, 4}, 21, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.NEPTUNIUM_INGOT.get());
    }),
    PLUTONIUM_ARMOR_MATERIAL("plutonium", 30, new int[] {4, 6, 8, 4}, 16, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.PLUTONIUM_INGOT.get());
    }),
    PROTACTINIUM_ARMOR_MATERIAL("protactinium", 24, new int[] {4, 6, 8, 4}, 19, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.PROTACTINIUM_INGOT.get());
    }),
    RADIUM_ARMOR_MATERIAL("radium", 24, new int[] {4, 6, 8, 4}, 20, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.RADIUM_INGOT.get());
    }),
    TECHNETIUM_ARMOR_MATERIAL("technetium", 32, new int[] {4, 6, 8, 4}, 20, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.TECHNETIUM_INGOT.get());
    }),
    THORIUM_ARMOR_MATERIAL("thorium", 40, new int[] {4, 6, 8, 4}, 22, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.THORIUM_INGOT.get());
    }),
    URANIUM_ARMOR_MATERIAL("uranium", 36, new int[] {4, 6, 8, 4}, 16, "item.armor.equip_gold", 3.0f, () -> {
        return Ingredient.fromItems(ModItems.URANIUM_INGOT.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private String name, equipSound;
    private int maxDamageFactor, enchantability;
    private Supplier<Ingredient> repairMaterial;
    private int[] damageReductionAmountArray;
    private float toughness;

    private ArmorMaterialList(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, String equipSound, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialSupplier;
        this.equipSound = equipSound;
        this.toughness = toughnessIn;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return RadioactiveBlocks.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
