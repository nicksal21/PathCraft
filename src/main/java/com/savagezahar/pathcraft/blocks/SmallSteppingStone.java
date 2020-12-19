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

public class SmallSteppingStone extends Block {


    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(11, 0, 11, 14, 0.6, 14),
            Block.makeCuboidShape(2, 0, 9, 4, 0.6, 11),
            Block.makeCuboidShape(11, 0, 6, 13, 0.6, 8),
            Block.makeCuboidShape(7, 0, 13, 8, 0.6, 14),
            Block.makeCuboidShape(5, 0, 2, 8, 0.6, 5),
            Block.makeCuboidShape(12, 0, 3, 13, 0.6, 4),
            Block.makeCuboidShape(8, 0, 9, 9, 0.6, 10),
            Block.makeCuboidShape(5, 0, 11, 6, 0.6, 12),
            Block.makeCuboidShape(2, 0, 5, 3, 0.6, 6),
            Block.makeCuboidShape(5, 0, 7, 7, 0.6, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(2, 0, 2, 5, 0.6, 5),
            Block.makeCuboidShape(12, 0, 5, 14, 0.6, 7),
            Block.makeCuboidShape(3, 0, 8, 5, 0.6, 10),
            Block.makeCuboidShape(8, 0, 2, 9, 0.6, 3),
            Block.makeCuboidShape(8, 0, 11, 11, 0.6, 14),
            Block.makeCuboidShape(3, 0, 12, 4, 0.6, 13),
            Block.makeCuboidShape(7, 0, 6, 8, 0.6, 7),
            Block.makeCuboidShape(10, 0, 4, 11, 0.6, 5),
            Block.makeCuboidShape(13, 0, 10, 14, 0.6, 11),
            Block.makeCuboidShape(9, 0, 7, 11, 0.6, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(2, 0, 11, 5, 0.6, 14),
            Block.makeCuboidShape(5, 0, 2, 7, 0.6, 4),
            Block.makeCuboidShape(8, 0, 11, 10, 0.6, 13),
            Block.makeCuboidShape(2, 0, 7, 3, 0.6, 8),
            Block.makeCuboidShape(11, 0, 5, 14, 0.6, 8),
            Block.makeCuboidShape(12, 0, 12, 13, 0.6, 13),
            Block.makeCuboidShape(6, 0, 8, 7, 0.6, 9),
            Block.makeCuboidShape(4, 0, 5, 5, 0.6, 6),
            Block.makeCuboidShape(10, 0, 2, 11, 0.6, 3),
            Block.makeCuboidShape(7, 0, 5, 9, 0.6, 7)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(11, 0, 2, 14, 0.6, 5),
            Block.makeCuboidShape(9, 0, 12, 11, 0.6, 14),
            Block.makeCuboidShape(6, 0, 3, 8, 0.6, 5),
            Block.makeCuboidShape(13, 0, 8, 14, 0.6, 9),
            Block.makeCuboidShape(2, 0, 8, 5, 0.6, 11),
            Block.makeCuboidShape(3, 0, 3, 4, 0.6, 4),
            Block.makeCuboidShape(9, 0, 7, 10, 0.6, 8),
            Block.makeCuboidShape(11, 0, 10, 12, 0.6, 11),
            Block.makeCuboidShape(5, 0, 13, 6, 0.6, 14),
            Block.makeCuboidShape(7, 0, 9, 9, 0.6, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public SmallSteppingStone() {
        super(Properties.create(Material.ROCK)
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
