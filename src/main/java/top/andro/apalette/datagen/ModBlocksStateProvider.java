package top.andro.apalette.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.APalette;
import top.andro.apalette.init.ModBlocks;

import static net.minecraft.data.models.model.TextureMapping.cubeTop;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, APalette.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.WHITE_STAINED_BRICKS);
        blockWithItem(ModBlocks.WHITE_STAINED_PLANKS);

        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_BRICKS);
        blockWithItem(ModBlocks.GRAY_STAINED_BRICKS);
        blockWithItem(ModBlocks.BLACK_STAINED_BRICKS);
        blockWithItem(ModBlocks.BROWN_STAINED_BRICKS);
        blockWithItem(ModBlocks.RED_STAINED_BRICKS);
        blockWithItem(ModBlocks.ORANGE_STAINED_BRICKS);
        blockWithItem(ModBlocks.YELLOW_STAINED_BRICKS);
        blockWithItem(ModBlocks.LIME_STAINED_BRICKS);
        blockWithItem(ModBlocks.GREEN_STAINED_BRICKS);
        blockWithItem(ModBlocks.CYAN_STAINED_BRICKS);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_BRICKS);
        blockWithItem(ModBlocks.BLUE_STAINED_BRICKS);
        blockWithItem(ModBlocks.PURPLE_STAINED_BRICKS);
        blockWithItem(ModBlocks.MAGENTA_STAINED_BRICKS);
        blockWithItem(ModBlocks.PINK_STAINED_BRICKS);
        //PLANKS

        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_PLANKS);
        blockWithItem(ModBlocks.GRAY_STAINED_PLANKS);
        blockWithItem(ModBlocks.BLACK_STAINED_PLANKS);
        blockWithItem(ModBlocks.BROWN_STAINED_PLANKS);
        blockWithItem(ModBlocks.RED_STAINED_PLANKS);
        blockWithItem(ModBlocks.ORANGE_STAINED_PLANKS);
        blockWithItem(ModBlocks.YELLOW_STAINED_PLANKS);
        blockWithItem(ModBlocks.LIME_STAINED_PLANKS);
        blockWithItem(ModBlocks.GREEN_STAINED_PLANKS);
        blockWithItem(ModBlocks.CYAN_STAINED_PLANKS);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_PLANKS);
        blockWithItem(ModBlocks.BLUE_STAINED_PLANKS);
        blockWithItem(ModBlocks.PURPLE_STAINED_PLANKS);
        blockWithItem(ModBlocks.MAGENTA_STAINED_PLANKS);
        blockWithItem(ModBlocks.PINK_STAINED_PLANKS);
        //GLASS
        blockWithItem(ModBlocks.CLEAR_GLASS);
        blockWithItem(ModBlocks.WHITE_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.GRAY_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.BLACK_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.BROWN_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.RED_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.ORANGE_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.YELLOW_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.LIME_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.GREEN_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.CYAN_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.BLUE_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.PURPLE_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS);
        blockWithItem(ModBlocks.PINK_STAINED_CLEAR_GLASS);


        paneBlock((IronBarsBlock) ModBlocks.CLEAR_GLASS_PANE.get(),
                modLoc("block/clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/white_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/light_gray_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/gray_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/black_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/brown_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/red_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/orange_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/yellow_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/lime_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/green_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/cyan_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/light_blue_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/blue_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/purple_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/magenta_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(),
                modLoc("block/pink_stained_clear_glass"),        // texture for pane
                modLoc("block/clear_glass_pane_top"));

        stairsBlock((StairBlock) ModBlocks.WHITE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.GRAY_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.BLACK_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.BROWN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.RED_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.RED_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.RED_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.RED_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.LIME_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.GREEN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.CYAN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.BLUE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.PINK_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_STAINED_PLANK_STAIRS.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_STAINED_PLANK_SLAB.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
