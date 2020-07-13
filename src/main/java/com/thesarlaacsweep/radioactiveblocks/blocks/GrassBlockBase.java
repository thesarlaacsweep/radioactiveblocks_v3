package com.thesarlaacsweep.radioactiveblocks.blocks;

import com.thesarlaacsweep.radioactiveblocks.config.ModConfig;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class GrassBlockBase extends GrassBlock {
    public static final int HARVEST_LEVEL = 3;
    public static final ToolType SHOVEL = ToolType.SHOVEL;

    public GrassBlockBase() {
        super(
                Block.Properties.create(Material.ORGANIC)
                        .harvestLevel(HARVEST_LEVEL)
                        .hardnessAndResistance(3f, 6000f)
                        .harvestTool(SHOVEL)
                        .sound(SoundType.PLANT)
                        .lightValue(15)
                        .tickRandomly()
        );
    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return SHOVEL;
    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (stack.getHarvestLevel(SHOVEL, player, state) >= HARVEST_LEVEL) {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    @Override
    public boolean canCreatureSpawn(BlockState state, IBlockReader world, BlockPos pos, EntitySpawnPlacementRegistry.PlacementType type, @Nullable EntityType<?> entityType) {
        return false;
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (ModConfig.COMMON_CONFIG.has_radiation_effect.get() && entityIn.getClassification(false) == EntityClassification.MONSTER) {
            entityIn.setFire(5000);
            entityIn.attackEntityFrom(DamageSource.ON_FIRE, 3f);
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
