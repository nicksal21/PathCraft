package com.savagezahar.pathcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GravelPath extends Block {

    public GravelPath() {
        super(Block.Properties.create(Material.EARTH)
            .hardnessAndResistance(0.6f, 0.6f)
            .sound(SoundType.GROUND)
            .harvestTool(ToolType.SHOVEL)

        );
    }
}
