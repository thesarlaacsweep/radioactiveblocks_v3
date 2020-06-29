package com.thesarlaacsweep.radioactiveblocks.lists;

import com.thesarlaacsweep.radioactiveblocks.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ToolMaterialList implements IItemTier {
    AMERICIUM(3, 2000, 7.0f, 5.0f, 17, () -> {
        return Ingredient.fromItems(ModItems.AMERICIUM_INGOT.get());
    }),
    BERKELIUM(3, 2000, 7.0f, 6.0f, 19, () -> {
        return Ingredient.fromItems(ModItems.BERKELIUM_INGOT.get());
    }),
    NEPTUNIUM(3, 2000, 9.0f, 5.0f, 21, () -> {
        return Ingredient.fromItems(ModItems.NEPTUNIUM_INGOT.get());
    }),
    PLUTONIUM(3, 2000, 9.0f, 6.0f, 16, () -> {
        return Ingredient.fromItems(ModItems.PLUTONIUM_INGOT.get());
    }),
    PROTACTINIUM(3, 2000, 8.0f, 5.0f, 20, () -> {
        return Ingredient.fromItems(ModItems.PROTACTINIUM_INGOT.get());
    }),
    RADIUM(3, 2000, 8.0f, 5.0f, 20, () -> {
        return Ingredient.fromItems(ModItems.RADIUM_INGOT.get());
    }),
    TECHNETIUM(3, 2000, 10.0f, 6.0f, 20, () -> {
        return Ingredient.fromItems(ModItems.TECHNETIUM_INGOT.get());
    }),
    THORIUM(3, 2000, 12.0f, 7.0f, 22, () -> {
        return Ingredient.fromItems(ModItems.THORIUM_INGOT.get());
    }),
    URANIUM(3, 2000, 10.0f, 8.0f, 15, () -> {
        return Ingredient.fromItems(ModItems.URANIUM_INGOT.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ToolMaterialList(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
