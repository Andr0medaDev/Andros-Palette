package top.andro.a_palette.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import top.andro.a_palette.APalette;
import top.andro.a_palette.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture, net.neoforged.neoforge.common.data.ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, tagLookupCompletableFuture, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WHITE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.GRAY_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.BLACK_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.BROWN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.RED_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.LIME_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.GREEN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.CYAN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.BLUE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.PINK_STAINED_WOODEN_LOG.get().asItem())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RED_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GREEN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_LOG.get().asItem())

                .add(ModBlocks.WHITE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.GRAY_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.BLACK_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.BROWN_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.RED_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.LIME_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.CYAN_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.BLUE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.PINK_STAINED_WOODEN_WOOD.get().asItem())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_RED_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WHITE_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.GRAY_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.BLACK_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.BROWN_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.RED_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.LIME_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.CYAN_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.BLUE_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_WOODEN_PLANKS.get().asItem())
                .add(ModBlocks.PINK_STAINED_WOODEN_PLANKS.get().asItem())

                .add(ModBlocks.WHITE_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.GRAY_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.BLACK_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.BROWN_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.RED_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.LIME_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.CYAN_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.BLUE_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_BORDERED_SIDING.get().asItem())
                .add(ModBlocks.PINK_STAINED_BORDERED_SIDING.get().asItem())

                .add(ModBlocks.WHITE_STAINED_SIDING.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_SIDING.get().asItem())
                .add(ModBlocks.GRAY_STAINED_SIDING.get().asItem())
                .add(ModBlocks.BLACK_STAINED_SIDING.get().asItem())
                .add(ModBlocks.BROWN_STAINED_SIDING.get().asItem())
                .add(ModBlocks.RED_STAINED_SIDING.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_SIDING.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_SIDING.get().asItem())
                .add(ModBlocks.LIME_STAINED_SIDING.get().asItem())
                .add(ModBlocks.CYAN_STAINED_SIDING.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_SIDING.get().asItem())
                .add(ModBlocks.BLUE_STAINED_SIDING.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_SIDING.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_SIDING.get().asItem())
                .add(ModBlocks.PINK_STAINED_SIDING.get().asItem());






    }
}