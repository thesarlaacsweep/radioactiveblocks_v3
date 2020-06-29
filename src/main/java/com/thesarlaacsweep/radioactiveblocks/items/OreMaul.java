package com.thesarlaacsweep.radioactiveblocks.items;

import com.google.common.collect.ImmutableSet;
import com.thesarlaacsweep.radioactiveblocks.RadioactiveBlocks;
import com.thesarlaacsweep.radioactiveblocks.init.ModOres;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;

import java.util.HashSet;
import java.util.Set;

public class OreMaul extends ToolItem {
    private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of(
            ModOres.AMERICIUM_ORE.get(),
            ModOres.BERKELIUM_ORE.get(),
            ModOres.NEPTUNIUM_ORE.get(),
            ModOres.PLUTONIUM_ORE.get(),
            ModOres.PROTACTINIUM_ORE.get(),
            ModOres.RADIUM_ORE.get(),
            ModOres.TECHNETIUM_ORE.get(),
            ModOres.THORIUM_ORE.get(),
            ModOres.URANIUM_ORE.get()
    );
    private final Set<ToolType> toolTypes;
    public OreMaul() {
        super(6, -2.8f, ItemTier.IRON, EFFECTIVE_ON, new Item.Properties().group(RadioactiveBlocks.TOOLS_TAB).addToolType(ToolType.PICKAXE, ItemTier.IRON.getHarvestLevel()));
        this.toolTypes = new HashSet<>();
        ToolType ORE_MAUL = ToolType.get("ore_maul");
        this.toolTypes.add(ORE_MAUL);
    }

    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        Block block = blockIn.getBlock();
        int i = this.getTier().getHarvestLevel();
        if (blockIn.getHarvestTool() == net.minecraftforge.common.ToolType.PICKAXE) {
            return i >= blockIn.getHarvestLevel();
        }
        Material material = blockIn.getMaterial();
        return material == Material.ROCK || material == Material.IRON || material == Material.ANVIL;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}
