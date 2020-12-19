package com.savagezahar.pathcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class BigSteppingStone extends Block {


    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(3, 0, 4, 13, 0.6, 12),
            Block.makeCuboidShape(4, 0, 12, 12, 0.6, 13),
            Block.makeCuboidShape(13, 0, 5, 14, 0.6, 11),
            Block.makeCuboidShape(2, 0, 5, 3, 0.6, 11),
            Block.makeCuboidShape(4, 0, 3, 12, 0.6, 4)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(3, 0, 4, 13, 0.6, 12),
            Block.makeCuboidShape(4, 0, 3, 12, 0.6, 4),
            Block.makeCuboidShape(2, 0, 5, 3, 0.6, 11),
            Block.makeCuboidShape(13, 0, 5, 14, 0.6, 11),
            Block.makeCuboidShape(4, 0, 12, 12, 0.6, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(4, 0, 3, 12, 0.6, 13),
            Block.makeCuboidShape(3, 0, 4, 4, 0.6, 12),
            Block.makeCuboidShape(5, 0, 13, 11, 0.6, 14),
            Block.makeCuboidShape(5, 0, 2, 11, 0.6, 3),
            Block.makeCuboidShape(12, 0, 4, 13, 0.6, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(4, 0, 3, 12, 0.6, 13),
            Block.makeCuboidShape(12, 0, 4, 13, 0.6, 12),
            Block.makeCuboidShape(5, 0, 2, 11, 0.6, 3),
            Block.makeCuboidShape(5, 0, 13, 11, 0.6, 14),
            Block.makeCuboidShape(3, 0, 4, 4, 0.6, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public BigSteppingStone() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.6f, 0.6f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }
}
