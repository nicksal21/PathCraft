package com.savagezahar.pathcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedSandPath extends Block {

    public RedSandPath() {
        super(Block.Properties.create(Material.SAND)
            .hardnessAndResistance(0.6f, 0.6f)
            .sound(SoundType.SAND)
            .harvestTool(ToolType.SHOVEL)

        );
    }
}
