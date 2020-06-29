package com.thesarlaacsweep.radioactiveblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.function.Supplier;

public class StairBase extends StairsBlock {
    public StairBase(Material materialIn, ToolType toolIn, SoundType soundTypeIn, java.util.function.Supplier<BlockState> state) {
        super(
                state,
                Block.Properties.create(materialIn)
                        .harvestLevel(2)
                        .hardnessAndResistance(3f, 6000f)
                        .harvestTool(toolIn)
                        .sound(soundTypeIn)
                        .lightValue(15)
        );
        this.stateSupplier = state;
    }
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn.getClassification(false) == EntityClassification.MONSTER) {
            entityIn.setFire(5000);
            entityIn.attackEntityFrom(DamageSource.ON_FIRE, 3f);
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    private final java.util.function.Supplier<BlockState> stateSupplier;
}
