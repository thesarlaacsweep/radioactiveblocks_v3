package com.thesarlaacsweep.radioactiveblocks.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.world.World;

import java.util.Objects;

public class RadioactiveShovelItem extends ShovelItem {
    int enchantmentId;
    int levelOfEnchantment;

    public RadioactiveShovelItem(
            IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder, int enchantmentIdIn, int levelOfEnchantmentIn
    ) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        this.enchantmentId = enchantmentIdIn;
        this.levelOfEnchantment = levelOfEnchantmentIn;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        stack.addEnchantment(Objects.requireNonNull(Enchantment.getEnchantmentByID(this.enchantmentId)), this.levelOfEnchantment);
    }
}
