package top.andro.a_palette.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;
import top.andro.a_palette.init.ModBlocks;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.WHITE_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_WHITE_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIGHT_GRAY_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GRAY_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_GRAY_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BLACK_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_BLACK_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BROWN_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_BROWN_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.RED_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_RED_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.ORANGE_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.YELLOW_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIME_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_LIME_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GREEN_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_GREEN_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CYAN_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_CYAN_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIGHT_BLUE_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BLUE_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_BLUE_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PURPLE_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.MAGENTA_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PINK_STAINED_LOG.get())) {
                return ModBlocks.STRIPPED_PINK_STAINED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.WHITE_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_WHITE_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIGHT_GRAY_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GRAY_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BLACK_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BROWN_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.RED_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_RED_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.ORANGE_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.YELLOW_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIME_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_LIME_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GREEN_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_GREEN_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CYAN_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.LIGHT_BLUE_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.BLUE_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PURPLE_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.MAGENTA_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PINK_STAINED_WOOD.get())) {
                return ModBlocks.STRIPPED_PINK_STAINED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
