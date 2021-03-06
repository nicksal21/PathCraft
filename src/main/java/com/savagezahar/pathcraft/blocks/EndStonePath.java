package com.savagezahar.pathcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EndStonePath extends Block {

    public EndStonePath() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.6f, 0.6f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.SHOVEL)
        );
    }
}
