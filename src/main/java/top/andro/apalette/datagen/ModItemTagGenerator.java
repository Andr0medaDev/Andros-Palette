package top.andro.apalette.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.andro.apalette.APalette;
import top.andro.apalette.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, tagLookupCompletableFuture, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WHITE_STAINED_LOG.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_LOG.get().asItem())
                .add(ModBlocks.GRAY_STAINED_LOG.get().asItem())
                .add(ModBlocks.BLACK_STAINED_LOG.get().asItem())
                .add(ModBlocks.BROWN_STAINED_LOG.get().asItem())
                .add(ModBlocks.RED_STAINED_LOG.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_LOG.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_LOG.get().asItem())
                .add(ModBlocks.LIME_STAINED_LOG.get().asItem())
                .add(ModBlocks.GREEN_STAINED_LOG.get().asItem())
                .add(ModBlocks.CYAN_STAINED_LOG.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_LOG.get().asItem())
                .add(ModBlocks.BLUE_STAINED_LOG.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_LOG.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_LOG.get().asItem())
                .add(ModBlocks.PINK_STAINED_LOG.get().asItem())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RED_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIME_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PINK_STAINED_LOG.get().asItem())

                .add(ModBlocks.WHITE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_WOOD.get().asItem())
                .add(ModBlocks.GRAY_STAINED_WOOD.get().asItem())
                .add(ModBlocks.BLACK_STAINED_WOOD.get().asItem())
                .add(ModBlocks.BROWN_STAINED_WOOD.get().asItem())
                .add(ModBlocks.RED_STAINED_WOOD.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_WOOD.get().asItem())
                .add(ModBlocks.LIME_STAINED_WOOD.get().asItem())
                .add(ModBlocks.CYAN_STAINED_WOOD.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.BLUE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_WOOD.get().asItem())
                .add(ModBlocks.PINK_STAINED_WOOD.get().asItem())

                .add(ModBlocks.STRIPPED_WHITE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_RED_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIME_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PINK_STAINED_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WHITE_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.GRAY_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.BLACK_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.BROWN_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.RED_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.ORANGE_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.YELLOW_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.LIME_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.CYAN_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.BLUE_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.PURPLE_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.MAGENTA_STAINED_PLANKS.get().asItem())
                .add(ModBlocks.PINK_STAINED_PLANKS.get().asItem());




    }
}