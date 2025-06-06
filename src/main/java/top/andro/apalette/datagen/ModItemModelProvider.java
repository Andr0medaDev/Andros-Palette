package top.andro.apalette.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import top.andro.apalette.APalette;
import top.andro.apalette.init.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(ModBlocks.WHITE_STAINED_BRICK_WALL, ModBlocks.WHITE_STAINED_BRICKS);
        wallItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL, ModBlocks.LIGHT_GRAY_STAINED_BRICKS);
        wallItem(ModBlocks.GRAY_STAINED_BRICK_WALL, ModBlocks.GRAY_STAINED_BRICKS);
        wallItem(ModBlocks.BLACK_STAINED_BRICK_WALL, ModBlocks.BLACK_STAINED_BRICKS);
        wallItem(ModBlocks.BROWN_STAINED_BRICK_WALL, ModBlocks.BROWN_STAINED_BRICKS);
        wallItem(ModBlocks.RED_STAINED_BRICK_WALL, ModBlocks.RED_STAINED_BRICKS);
        wallItem(ModBlocks.ORANGE_STAINED_BRICK_WALL, ModBlocks.ORANGE_STAINED_BRICKS);
        wallItem(ModBlocks.YELLOW_STAINED_BRICK_WALL, ModBlocks.YELLOW_STAINED_BRICKS);
        wallItem(ModBlocks.LIME_STAINED_BRICK_WALL, ModBlocks.LIME_STAINED_BRICKS);
        wallItem(ModBlocks.GREEN_STAINED_BRICK_WALL, ModBlocks.GREEN_STAINED_BRICKS);
        wallItem(ModBlocks.CYAN_STAINED_BRICK_WALL, ModBlocks.CYAN_STAINED_BRICKS);
        wallItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL, ModBlocks.LIGHT_BLUE_STAINED_BRICKS);
        wallItem(ModBlocks.BLUE_STAINED_BRICK_WALL, ModBlocks.BLUE_STAINED_BRICKS);
        wallItem(ModBlocks.PURPLE_STAINED_BRICK_WALL, ModBlocks.PURPLE_STAINED_BRICKS);
        wallItem(ModBlocks.MAGENTA_STAINED_BRICK_WALL, ModBlocks.MAGENTA_STAINED_BRICKS);
        wallItem(ModBlocks.PINK_STAINED_BRICK_WALL, ModBlocks.PINK_STAINED_BRICKS);
    }

    public void wallItem(DeferredBlock<?> wallBlock, DeferredBlock<?> baseBlock) {
        this.withExistingParent(wallBlock.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", modLoc("block/" + baseBlock.getId().getPath()));
    }
}
