package io.github.milk_smoke_mods.medieval_fortifications.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EmbrasureBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<EmbrasureBlock> CODEC =
            simpleCodec(EmbrasureBlock::new);

    private static final VoxelShape NORTH_SHAPE = Shapes.or(
            // Outer side walls
            Block.box(0, 0, 0, 2, 16, 8),
            Block.box(14, 0, 0, 16, 16, 8),

            // Top and bottom
            Block.box(2, 14, 0, 14, 16, 8),
            Block.box(2, 0, 0, 14, 2, 8),

            // Walls surrounding the central slit
            Block.box(2, 2, 0, 6, 14, 2),
            Block.box(10, 2, 0, 14, 14, 2)
    ).optimize();

    private static final VoxelShape EAST_SHAPE =
            rotateClockwise(NORTH_SHAPE);

    private static final VoxelShape SOUTH_SHAPE =
            rotateClockwise(EAST_SHAPE);

    private static final VoxelShape WEST_SHAPE =
            rotateClockwise(SOUTH_SHAPE);

    public EmbrasureBlock(Properties properties) {
        super(properties);

        registerDefaultState(
                stateDefinition.any().setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    public MapCodec<EmbrasureBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<Block, BlockState> builder
    ) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(
                FACING,
                context.getHorizontalDirection()
        );
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(
                FACING,
                rotation.rotate(state.getValue(FACING))
        );
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(
                mirror.getRotation(state.getValue(FACING))
        );
    }

    /**
     * Rotates a shape 90 degrees clockwise around the center of the block.
     */
    private static VoxelShape rotateClockwise(VoxelShape shape) {
        VoxelShape[] result = {Shapes.empty()};

        shape.forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) ->
                result[0] = Shapes.or(
                        result[0],
                        Shapes.box(
                                1.0 - maxZ,
                                minY,
                                minX,
                                1.0 - minZ,
                                maxY,
                                maxX
                        )
                )
        );

        return result[0].optimize();
    }

    @Override
    protected VoxelShape getShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        return switch (state.getValue(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }
}
