package com.thesarlaacsweep.radioactiveblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class LogBase extends LogBlock {
    public LogBase(Material materialIn, ToolType toolIn, SoundType soundTypeIn, MaterialColor colorIn) {
        super(
                colorIn,
                Block.Properties.create(materialIn)
                        .harvestLevel(2)
                        .hardnessAndResistance(3f, 6000f)
                        .harvestTool(toolIn)
                        .sound(soundTypeIn)
                        .lightValue(15)
        );
    }
}
