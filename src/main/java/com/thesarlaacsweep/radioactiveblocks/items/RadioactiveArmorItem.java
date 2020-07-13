package com.thesarlaacsweep.radioactiveblocks.items;

import com.thesarlaacsweep.radioactiveblocks.config.ModConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class RadioactiveArmorItem extends ArmorItem {

    public RadioactiveArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(materialIn, slot, builder);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (ModConfig.COMMON_CONFIG.has_radiation_effect.get()) {
            if (
                    !player.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty() &&
                            !player.getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty() &&
                            !player.getItemStackFromSlot(EquipmentSlotType.LEGS).isEmpty() &&
                            !player.getItemStackFromSlot(EquipmentSlotType.FEET).isEmpty()
            ) {
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION));
            }
        }
    }
}
