package com.thesarlaacsweep.radioactiveblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class LogBase extends LogBlock {
    public static final int HARVEST_LEVEL = 3;
    ToolType tool;

    public LogBase(Material materialIn, ToolType toolIn, SoundType soundTypeIn, MaterialColor colorIn) {
        super(
                colorIn,
                Block.Properties.create(materialIn)
                        .harvestLevel(HARVEST_LEVEL)
                        .hardnessAndResistance(3f, 6000f)
                        .harvestTool(toolIn)
                        .sound(soundTypeIn)
                        .lightValue(15)
        );
        this.tool = toolIn;
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return this.tool;
    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (stack.getHarvestLevel(this.tool, player, state) >= HARVEST_LEVEL) {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }
}
