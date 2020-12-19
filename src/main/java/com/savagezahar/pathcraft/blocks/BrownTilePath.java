package com.savagezahar.pathcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BrownTilePath extends Block {
    public BrownTilePath() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f, 6.0f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
