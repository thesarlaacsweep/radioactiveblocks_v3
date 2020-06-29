package com.thesarlaacsweep.radioactiveblocks.blocks;

import com.thesarlaacsweep.radioactiveblocks.init.ModOres;
import com.thesarlaacsweep.radioactiveblocks.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class OreBlock extends Block {
    private boolean isRockHammerUsed = false;
    public OreBlock() {
        super(
                Block.Properties.create(Material.ROCK)
                        .lightValue(6)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(3f, 2000f)
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(2)
        );
    }

    @Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        super.dropXpOnBlockBreak(worldIn, pos, 4);
    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (stack.getDisplayName().equals("Radioactive Ore Maul")) {
            this.isRockHammerUsed = true;
            java.util.List<ItemStack> items = new java.util.ArrayList<ItemStack>();

            if (state.getBlock() == ModOres.AMERICIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.AMERICIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.BERKELIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.BERKELIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.NEPTUNIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.NEPTUNIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.PLUTONIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.PLUTONIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.PROTACTINIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.PROTACTINIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.RADIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.RADIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.TECHNETIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.TECHNETIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.THORIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.THORIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else if (state.getBlock() == ModOres.URANIUM_ORE.get()) {
                ItemStack itemstack = new ItemStack(ModItems.URANIUM_DUST.get(), 3);

                if (!itemstack.isEmpty()) {
                    // Get three powders as drops
                    items.add(itemstack);
                }

                for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
            } else {
                items.clear();
            }
        } else {
            this.isRockHammerUsed = false;
        }
        super.harvestBlock(worldIn, player, pos, state, te, stack);
    }
}
