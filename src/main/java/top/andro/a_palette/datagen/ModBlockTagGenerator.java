package top.andro.a_palette.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.andro.a_palette.APalette;
import top.andro.a_palette.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WHITE_STAINED_BRICKS.get(),
                        ModBlocks.WHITE_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.WHITE_STAINED_BRICK_SLAB.get(),
                        ModBlocks.WHITE_STAINED_BRICK_WALL.get(),

                        ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get(),
                        ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get(),
                        ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get(),

                        ModBlocks.GRAY_STAINED_BRICKS.get(),
                        ModBlocks.GRAY_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.GRAY_STAINED_BRICK_SLAB.get(),
                        ModBlocks.GRAY_STAINED_BRICK_WALL.get(),

                        ModBlocks.BLACK_STAINED_BRICKS.get(),
                        ModBlocks.BLACK_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.BLACK_STAINED_BRICK_SLAB.get(),
                        ModBlocks.BLACK_STAINED_BRICK_WALL.get(),

                        ModBlocks.BROWN_STAINED_BRICKS.get(),
                        ModBlocks.BROWN_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.BROWN_STAINED_BRICK_SLAB.get(),
                        ModBlocks.BROWN_STAINED_BRICK_WALL.get(),

                        ModBlocks.RED_STAINED_BRICKS.get(),
                        ModBlocks.RED_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.RED_STAINED_BRICK_SLAB.get(),
                        ModBlocks.RED_STAINED_BRICK_WALL.get(),

                        ModBlocks.ORANGE_STAINED_BRICKS.get(),
                        ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.ORANGE_STAINED_BRICK_SLAB.get(),
                        ModBlocks.ORANGE_STAINED_BRICK_WALL.get(),

                        ModBlocks.YELLOW_STAINED_BRICKS.get(),
                        ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.YELLOW_STAINED_BRICK_SLAB.get(),
                        ModBlocks.YELLOW_STAINED_BRICK_WALL.get(),

                        ModBlocks.LIME_STAINED_BRICKS.get(),
                        ModBlocks.LIME_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.LIME_STAINED_BRICK_SLAB.get(),
                        ModBlocks.LIME_STAINED_BRICK_WALL.get(),

                        ModBlocks.GREEN_STAINED_BRICKS.get(),
                        ModBlocks.GREEN_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.GREEN_STAINED_BRICK_SLAB.get(),
                        ModBlocks.GREEN_STAINED_BRICK_WALL.get(),

                        ModBlocks.CYAN_STAINED_BRICKS.get(),
                        ModBlocks.CYAN_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.CYAN_STAINED_BRICK_SLAB.get(),
                        ModBlocks.CYAN_STAINED_BRICK_WALL.get(),

                        ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get(),
                        ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get(),
                        ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get(),

                        ModBlocks.BLUE_STAINED_BRICKS.get(),
                        ModBlocks.BLUE_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.BLUE_STAINED_BRICK_SLAB.get(),
                        ModBlocks.BLUE_STAINED_BRICK_WALL.get(),

                        ModBlocks.PURPLE_STAINED_BRICKS.get(),
                        ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.PURPLE_STAINED_BRICK_SLAB.get(),
                        ModBlocks.PURPLE_STAINED_BRICK_WALL.get(),

                        ModBlocks.MAGENTA_STAINED_BRICKS.get(),
                        ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get(),
                        ModBlocks.MAGENTA_STAINED_BRICK_WALL.get(),

                        ModBlocks.PINK_STAINED_BRICKS.get(),
                        ModBlocks.PINK_STAINED_BRICK_STAIRS.get(),
                        ModBlocks.PINK_STAINED_BRICK_SLAB.get(),
                        ModBlocks.PINK_STAINED_BRICK_WALL.get());



        this.tag(BlockTags.WALLS)
                .add(ModBlocks.WHITE_STAINED_BRICK_WALL.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get())
                .add(ModBlocks.GRAY_STAINED_BRICK_WALL.get())
                .add(ModBlocks.BLACK_STAINED_BRICK_WALL.get())
                .add(ModBlocks.BROWN_STAINED_BRICK_WALL.get())
                .add(ModBlocks.RED_STAINED_BRICK_WALL.get())
                .add(ModBlocks.ORANGE_STAINED_BRICK_WALL.get())
                .add(ModBlocks.YELLOW_STAINED_BRICK_WALL.get())
                .add(ModBlocks.LIME_STAINED_BRICK_WALL.get())
                .add(ModBlocks.GREEN_STAINED_BRICK_WALL.get())
                .add(ModBlocks.CYAN_STAINED_BRICK_WALL.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get())
                .add(ModBlocks.BLUE_STAINED_BRICK_WALL.get())
                .add(ModBlocks.PURPLE_STAINED_BRICK_WALL.get())
                .add(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get())
                .add(ModBlocks.PINK_STAINED_BRICK_WALL.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WHITE_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.GRAY_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.BLACK_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.BROWN_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.RED_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.LIME_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.GREEN_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.CYAN_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.BLUE_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE.get())
                .add(ModBlocks.PINK_STAINED_WOODEN_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WHITE_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.GRAY_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.BLACK_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.BROWN_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.RED_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.LIME_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.GREEN_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.CYAN_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.BLUE_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get())
                .add(ModBlocks.PINK_STAINED_WOODEN_FENCE_GATE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WHITE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.GRAY_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.BLACK_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.BROWN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.RED_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.LIME_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.GREEN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.CYAN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.BLUE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.PINK_STAINED_WOODEN_LOG.get())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_RED_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_GREEN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_LOG.get())
                .add(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_LOG.get())

                .add(ModBlocks.WHITE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.GRAY_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.BLACK_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.BROWN_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.RED_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.LIME_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.CYAN_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.BLUE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.PINK_STAINED_WOODEN_WOOD.get())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_RED_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_WOOD.get())
                .add(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WHITE_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.GRAY_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.BLACK_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.BROWN_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.RED_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.LIME_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.CYAN_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.BLUE_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_PLANKS.get())
                .add(ModBlocks.PINK_STAINED_WOODEN_PLANKS.get());

    }
}
