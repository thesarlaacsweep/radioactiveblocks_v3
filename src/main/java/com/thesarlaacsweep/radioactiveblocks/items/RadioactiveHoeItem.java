package com.thesarlaacsweep.radioactiveblocks.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Objects;

public class RadioactiveHoeItem extends HoeItem {
    int enchantmentId;
    int levelOfEnchantment;

    public RadioactiveHoeItem(
            IItemTier tier, float attackSpeedIn, Properties builder, int enchantmentIdIn, int levelOfEnchantmentIn
    ) {
        super(tier, attackSpeedIn, builder);
        this.enchantmentId = enchantmentIdIn;
        this.levelOfEnchantment = levelOfEnchantmentIn;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        stack.addEnchantment(Objects.requireNonNull(Enchantment.getEnchantmentByID(this.enchantmentId)), this.levelOfEnchantment);
    }
}
