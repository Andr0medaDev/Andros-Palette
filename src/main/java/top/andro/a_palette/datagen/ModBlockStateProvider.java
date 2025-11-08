package top.andro.a_palette.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.andro.a_palette.APalette;
import top.andro.a_palette.init.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, APalette.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.WHITE_STAINED_BRICKS);
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
        blockWithItem(ModBlocks.WHITE_STAINED_PLANKS);
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

        blockWithItem(ModBlocks.MODERN_GLASS);
        blockWithItem(ModBlocks.WHITE_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.GRAY_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.BLACK_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.BROWN_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.RED_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.ORANGE_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.YELLOW_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.LIME_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.GREEN_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.CYAN_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.BLUE_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.PURPLE_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.MAGENTA_STAINED_MODERN_GLASS);
        blockWithItem(ModBlocks.PINK_STAINED_MODERN_GLASS);
        //SIDING (BORDERED)
        blockWithItem(ModBlocks.WHITE_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.GRAY_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.BLACK_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.BROWN_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.RED_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.ORANGE_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.YELLOW_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.LIME_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.GREEN_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.CYAN_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.BLUE_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.PURPLE_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.MAGENTA_STAINED_BORDERED_SIDING);
        blockWithItem(ModBlocks.PINK_STAINED_BORDERED_SIDING);
        //SIDING
        blockWithItem(ModBlocks.WHITE_STAINED_SIDING);
        blockWithItem(ModBlocks.LIGHT_GRAY_STAINED_SIDING);
        blockWithItem(ModBlocks.GRAY_STAINED_SIDING);
        blockWithItem(ModBlocks.BLACK_STAINED_SIDING);
        blockWithItem(ModBlocks.BROWN_STAINED_SIDING);
        blockWithItem(ModBlocks.RED_STAINED_SIDING);
        blockWithItem(ModBlocks.ORANGE_STAINED_SIDING);
        blockWithItem(ModBlocks.YELLOW_STAINED_SIDING);
        blockWithItem(ModBlocks.LIME_STAINED_SIDING);
        blockWithItem(ModBlocks.GREEN_STAINED_SIDING);
        blockWithItem(ModBlocks.CYAN_STAINED_SIDING);
        blockWithItem(ModBlocks.LIGHT_BLUE_STAINED_SIDING);
        blockWithItem(ModBlocks.BLUE_STAINED_SIDING);
        blockWithItem(ModBlocks.PURPLE_STAINED_SIDING);
        blockWithItem(ModBlocks.MAGENTA_STAINED_SIDING);
        blockWithItem(ModBlocks.PINK_STAINED_SIDING);


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

        paneBlock((IronBarsBlock) ModBlocks.MODERN_GLASS_PANE.get(),
                modLoc("block/modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.WHITE_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/white_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/light_gray_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.GRAY_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/gray_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BLACK_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/black_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BROWN_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/brown_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.RED_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/red_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.ORANGE_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/orange_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.YELLOW_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/yellow_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIME_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/lime_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.GREEN_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/green_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.CYAN_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/cyan_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/light_blue_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.BLUE_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/blue_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.PURPLE_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/purple_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.MAGENTA_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/magenta_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));
        paneBlock((IronBarsBlock) ModBlocks.PINK_STAINED_MODERN_GLASS_PANE.get(),
                modLoc("block/pink_stained_modern_glass"),        // texture for pane
                modLoc("block/modern_glass_pane_top"));

        signBlock(((StandingSignBlock) ModBlocks.WHITE_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.WHITE_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.GRAY_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.GRAY_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.BLACK_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.BLACK_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.BROWN_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.BROWN_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.RED_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.RED_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.ORANGE_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.ORANGE_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.YELLOW_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.YELLOW_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.LIME_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.LIME_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.GREEN_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.GREEN_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.CYAN_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.CYAN_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.BLUE_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.BLUE_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.PURPLE_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.PURPLE_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.MAGENTA_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.MAGENTA_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.PINK_STAINED_WOODEN_SIGN.get()), ((WallSignBlock) ModBlocks.PINK_STAINED_WOODEN_WALL_SIGN.get()),
                blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));

        hangingSignBlock(ModBlocks.WHITE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.WHITE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.BLACK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLACK_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.BROWN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BROWN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.RED_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.RED_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_RED_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.ORANGE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.ORANGE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.YELLOW_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.YELLOW_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.LIME_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIME_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.GREEN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GREEN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.CYAN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.CYAN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.PURPLE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PURPLE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.MAGENTA_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get()));
        hangingSignBlock(ModBlocks.PINK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PINK_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.STRIPPED_PINK_STAINED_LOG.get()));

        stairsBlock((StairBlock) ModBlocks.WHITE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.WHITE_STAINED_WOODEN_DOOR.get(), modLoc("block/white_stained_wooden_door_bottom"), modLoc("block/white_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WHITE_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/white_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.LIGHT_GRAY_STAINED_WOODEN_DOOR.get(), modLoc("block/light_gray_stained_wooden_door_bottom"), modLoc("block/light_gray_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/light_gray_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.GRAY_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.GRAY_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.GRAY_STAINED_WOODEN_DOOR.get(), modLoc("block/gray_stained_wooden_door_bottom"), modLoc("block/gray_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GRAY_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/gray_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.BLACK_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.BLACK_STAINED_WOODEN_DOOR.get(), modLoc("block/black_stained_wooden_door_bottom"), modLoc("block/black_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BLACK_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/black_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.BROWN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BROWN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.BROWN_STAINED_WOODEN_DOOR.get(), modLoc("block/brown_stained_wooden_door_bottom"), modLoc("block/brown_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BROWN_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/brown_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.RED_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.RED_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.RED_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.RED_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.RED_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.RED_STAINED_WOODEN_DOOR.get(), modLoc("block/red_stained_wooden_door_bottom"), modLoc("block/red_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.RED_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/red_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.ORANGE_STAINED_WOODEN_DOOR.get(), modLoc("block/orange_stained_wooden_door_bottom"), modLoc("block/orange_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ORANGE_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/orange_stained_wooden_trapdoor"), true, "cutout");


        stairsBlock((StairBlock) ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.YELLOW_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.YELLOW_STAINED_WOODEN_DOOR.get(), modLoc("block/yellow_stained_wooden_door_bottom"), modLoc("block/yellow_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.YELLOW_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/yellow_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.LIME_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.LIME_STAINED_WOODEN_DOOR.get(), modLoc("block/lime_stained_wooden_door_bottom"), modLoc("block/lime_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIME_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/lime_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.GREEN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.GREEN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.GREEN_STAINED_WOODEN_DOOR.get(), modLoc("block/green_stained_wooden_door_bottom"), modLoc("block/green_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GREEN_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/green_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.CYAN_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.CYAN_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.CYAN_STAINED_WOODEN_DOOR.get(), modLoc("block/cyan_stained_wooden_door_bottom"), modLoc("block/cyan_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.CYAN_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/cyan_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.LIGHT_BLUE_STAINED_WOODEN_DOOR.get(), modLoc("block/light_blue_stained_wooden_door_bottom"), modLoc("block/light_blue_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/light_blue_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.BLUE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.BLUE_STAINED_WOODEN_DOOR.get(), modLoc("block/blue_stained_wooden_door_bottom"), modLoc("block/blue_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BLUE_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/blue_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.PURPLE_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.PURPLE_STAINED_WOODEN_DOOR.get(), modLoc("block/purple_stained_wooden_door_bottom"), modLoc("block/purple_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.PURPLE_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/purple_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.MAGENTA_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.MAGENTA_STAINED_WOODEN_DOOR.get(), modLoc("block/magenta_stained_wooden_door_bottom"), modLoc("block/magenta_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.MAGENTA_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/magenta_stained_wooden_trapdoor"), true, "cutout");

        stairsBlock((StairBlock) ModBlocks.PINK_STAINED_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_STAINED_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_STAINED_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_STAINED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_STAINED_WOODEN_STAIRS.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_STAINED_WOODEN_SLAB.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)ModBlocks.PINK_STAINED_WOODEN_DOOR.get(), modLoc("block/pink_stained_wooden_door_bottom"), modLoc("block/pink_stained_wooden_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.PINK_STAINED_WOODEN_TRAPDOOR.get(), modLoc("block/pink_stained_wooden_trapdoor"), true, "cutout");

        buttonBlock((ButtonBlock) ModBlocks.WHITE_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.GRAY_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLACK_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.BROWN_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.RED_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.ORANGE_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.YELLOW_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIME_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.GREEN_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.CYAN_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLUE_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.PURPLE_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.MAGENTA_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.PINK_STAINED_WOODEN_BUTTON.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));

        pressurePlateBlock((PressurePlateBlock) ModBlocks.WHITE_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GRAY_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLACK_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BROWN_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RED_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ORANGE_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.YELLOW_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIME_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GREEN_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CYAN_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLUE_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PURPLE_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.MAGENTA_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PINK_STAINED_WOODEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.WHITE_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WHITE_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.GRAY_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GRAY_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.BLACK_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BLACK_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.BROWN_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.RED_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.RED_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.ORANGE_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ORANGE_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.YELLOW_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.YELLOW_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.LIME_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIME_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.GREEN_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.CYAN_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.CYAN_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.BLUE_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BLUE_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.PURPLE_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.PURPLE_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.MAGENTA_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.PINK_STAINED_WOODEN_FENCE.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.PINK_STAINED_WOODEN_FENCE_GATE.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));

        blockItem(ModBlocks.WHITE_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.GRAY_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.BLACK_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.BROWN_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.RED_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.ORANGE_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.YELLOW_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.LIME_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.GREEN_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.CYAN_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.BLUE_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.PURPLE_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.MAGENTA_STAINED_WOODEN_PRESSURE_PLATE);
        blockItem(ModBlocks.PINK_STAINED_WOODEN_PRESSURE_PLATE);

        logBlock(((RotatedPillarBlock) ModBlocks.WHITE_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_GRAY_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GRAY_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BROWN_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.RED_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.ORANGE_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.YELLOW_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIME_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CYAN_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_BLUE_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BLUE_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PURPLE_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.MAGENTA_STAINED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PINK_STAINED_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.WHITE_STAINED_WOOD.get()), blockTexture(ModBlocks.WHITE_STAINED_LOG.get()), blockTexture(ModBlocks.WHITE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIGHT_GRAY_STAINED_WOOD.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GRAY_STAINED_WOOD.get()), blockTexture(ModBlocks.GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.GRAY_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BLACK_STAINED_WOOD.get()), blockTexture(ModBlocks.BLACK_STAINED_LOG.get()), blockTexture(ModBlocks.BLACK_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BROWN_STAINED_WOOD.get()), blockTexture(ModBlocks.BROWN_STAINED_LOG.get()), blockTexture(ModBlocks.BROWN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RED_STAINED_WOOD.get()), blockTexture(ModBlocks.RED_STAINED_LOG.get()), blockTexture(ModBlocks.RED_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ORANGE_STAINED_WOOD.get()), blockTexture(ModBlocks.ORANGE_STAINED_LOG.get()), blockTexture(ModBlocks.ORANGE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.YELLOW_STAINED_WOOD.get()), blockTexture(ModBlocks.YELLOW_STAINED_LOG.get()), blockTexture(ModBlocks.YELLOW_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIME_STAINED_WOOD.get()), blockTexture(ModBlocks.LIME_STAINED_LOG.get()), blockTexture(ModBlocks.LIME_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_STAINED_WOOD.get()), blockTexture(ModBlocks.GREEN_STAINED_LOG.get()), blockTexture(ModBlocks.GREEN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CYAN_STAINED_WOOD.get()), blockTexture(ModBlocks.CYAN_STAINED_LOG.get()), blockTexture(ModBlocks.CYAN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIGHT_BLUE_STAINED_WOOD.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BLUE_STAINED_WOOD.get()), blockTexture(ModBlocks.BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.BLUE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PURPLE_STAINED_WOOD.get()), blockTexture(ModBlocks.PURPLE_STAINED_LOG.get()), blockTexture(ModBlocks.PURPLE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAGENTA_STAINED_WOOD.get()), blockTexture(ModBlocks.MAGENTA_STAINED_LOG.get()), blockTexture(ModBlocks.MAGENTA_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PINK_STAINED_WOOD.get()), blockTexture(ModBlocks.PINK_STAINED_LOG.get()), blockTexture(ModBlocks.PINK_STAINED_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_white_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_light_gray_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_gray_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_black_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BROWN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_brown_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_RED_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_red_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_orange_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_yellow_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIME_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIME_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_lime_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_green_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CYAN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_cyan_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_light_blue_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_blue_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_purple_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_magenta_stained_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINK_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_PINK_STAINED_LOG.get()), new ResourceLocation(APalette.MOD_ID, "block/stripped_pink_stained_log_top"));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_RED_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_RED_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIME_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIME_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIME_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINK_STAINED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PINK_STAINED_LOG.get()), blockTexture(ModBlocks.STRIPPED_PINK_STAINED_LOG.get()));



        blockItem(ModBlocks.WHITE_STAINED_LOG);
        blockItem(ModBlocks.LIGHT_GRAY_STAINED_LOG);
        blockItem(ModBlocks.GRAY_STAINED_LOG);
        blockItem(ModBlocks.BLACK_STAINED_LOG);
        blockItem(ModBlocks.BROWN_STAINED_LOG);
        blockItem(ModBlocks.RED_STAINED_LOG);
        blockItem(ModBlocks.ORANGE_STAINED_LOG);
        blockItem(ModBlocks.YELLOW_STAINED_LOG);
        blockItem(ModBlocks.LIME_STAINED_LOG);
        blockItem(ModBlocks.GREEN_STAINED_LOG);
        blockItem(ModBlocks.CYAN_STAINED_LOG);
        blockItem(ModBlocks.LIGHT_BLUE_STAINED_LOG);
        blockItem(ModBlocks.BLUE_STAINED_LOG);
        blockItem(ModBlocks.PURPLE_STAINED_LOG);
        blockItem(ModBlocks.MAGENTA_STAINED_LOG);
        blockItem(ModBlocks.PINK_STAINED_LOG);

        blockItem(ModBlocks.WHITE_STAINED_WOOD);
        blockItem(ModBlocks.LIGHT_GRAY_STAINED_WOOD);
        blockItem(ModBlocks.GRAY_STAINED_WOOD);
        blockItem(ModBlocks.BLACK_STAINED_WOOD);
        blockItem(ModBlocks.BROWN_STAINED_WOOD);
        blockItem(ModBlocks.RED_STAINED_WOOD);
        blockItem(ModBlocks.ORANGE_STAINED_WOOD);
        blockItem(ModBlocks.YELLOW_STAINED_WOOD);
        blockItem(ModBlocks.LIME_STAINED_WOOD);
        blockItem(ModBlocks.GREEN_STAINED_WOOD);
        blockItem(ModBlocks.CYAN_STAINED_WOOD);
        blockItem(ModBlocks.LIGHT_BLUE_STAINED_WOOD);
        blockItem(ModBlocks.BLUE_STAINED_WOOD);
        blockItem(ModBlocks.PURPLE_STAINED_WOOD);
        blockItem(ModBlocks.MAGENTA_STAINED_WOOD);
        blockItem(ModBlocks.PINK_STAINED_WOOD);

        blockItem(ModBlocks.STRIPPED_WHITE_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_GRAY_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_BLACK_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_BROWN_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_RED_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_ORANGE_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_YELLOW_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_LIME_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_GREEN_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_CYAN_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_BLUE_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_PURPLE_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG);
        blockItem(ModBlocks.STRIPPED_PINK_STAINED_LOG);

        blockItem(ModBlocks.STRIPPED_WHITE_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_GRAY_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_BLACK_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_BROWN_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_RED_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_ORANGE_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_YELLOW_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIME_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_GREEN_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_CYAN_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_BLUE_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_PURPLE_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD);
        blockItem(ModBlocks.STRIPPED_PINK_STAINED_WOOD);





    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("a_palette:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("a_palette:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
