package top.andro.apalette.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.andro.apalette.APalette;
import top.andro.apalette.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
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
    }
}
