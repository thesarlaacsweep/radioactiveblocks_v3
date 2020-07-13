package com.thesarlaacsweep.radioactiveblocks.items;

import com.thesarlaacsweep.radioactiveblocks.config.ModConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

import java.util.Objects;

public class RadioactiveSwordItem extends SwordItem {
    int enchantmentId;
    int levelOfEnchantment;

    public RadioactiveSwordItem(
            IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder, int enchantmentIdIn, int levelOfEnchantmentIn
    ) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        this.enchantmentId = enchantmentIdIn;
        this.levelOfEnchantment = levelOfEnchantmentIn;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        if (ModConfig.COMMON_CONFIG.has_radiation_effect.get()) {
            stack.addEnchantment(Objects.requireNonNull(Enchantment.getEnchantmentByID(this.enchantmentId)), this.levelOfEnchantment);
        }
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (ModConfig.COMMON_CONFIG.has_radiation_effect.get()) {
            attacker.addPotionEffect(new EffectInstance(Effects.STRENGTH));
            if (target.getClassification(false) == EntityClassification.MONSTER) {
                target.setFire(4000);
            }
        }
        return super.hitEntity(stack, target, attacker);
    }
}
