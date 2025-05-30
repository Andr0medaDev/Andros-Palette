package top.andro.apalette.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.APalette;
import top.andro.apalette.block.ArtPaletteBlock;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, APalette.MOD_ID);

    public static final RegistryObject<Block> ART_PALETTE = registerBlock("art_palette",
            () -> new ArtPaletteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CLEAR_GLASS = registerBlock("clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CLEAR_GLASS_PANE = registerBlock("clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //WHITE
    public static final RegistryObject<Block> WHITE_STAINED_BRICKS = registerBlock("white_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_STAIRS = registerBlock("white_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_SLAB = registerBlock("white_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_WALL = registerBlock("white_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = registerBlock("white_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WHITE_STAINED_PLANK_STAIRS = registerBlock("white_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> WHITE_STAINED_PLANK_SLAB = registerBlock("white_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WHITE_STAINED_CLEAR_GLASS = registerBlock("white_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> WHITE_STAINED_CLEAR_GLASS_PANE = registerBlock("white_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //LIGHT_GRAY
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICKS = registerBlock("light_gray_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_STAIRS = registerBlock("light_gray_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_SLAB = registerBlock("light_gray_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_WALL = registerBlock("light_gray_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = registerBlock("light_gray_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANK_STAIRS = registerBlock("light_gray_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANK_SLAB = registerBlock("light_gray_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_CLEAR_GLASS = registerBlock("light_gray_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = registerBlock("light_gray_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //GRAY
    public static final RegistryObject<Block> GRAY_STAINED_BRICKS = registerBlock("gray_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_STAIRS = registerBlock("gray_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_SLAB = registerBlock("gray_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_WALL = registerBlock("gray_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = registerBlock("gray_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANK_STAIRS = registerBlock("gray_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANK_SLAB = registerBlock("gray_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_CLEAR_GLASS = registerBlock("gray_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GRAY_STAINED_CLEAR_GLASS_PANE = registerBlock("gray_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //BLACK
    public static final RegistryObject<Block> BLACK_STAINED_BRICKS = registerBlock("black_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_STAIRS = registerBlock("black_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_SLAB = registerBlock("black_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_WALL = registerBlock("black_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = registerBlock("black_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_PLANK_STAIRS = registerBlock("black_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_PLANK_SLAB = registerBlock("black_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_CLEAR_GLASS = registerBlock("black_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLACK_STAINED_CLEAR_GLASS_PANE = registerBlock("black_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //BROWN
    public static final RegistryObject<Block> BROWN_STAINED_BRICKS = registerBlock("brown_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_STAIRS = registerBlock("brown_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_SLAB = registerBlock("brown_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_WALL = registerBlock("brown_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = registerBlock("brown_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANK_STAIRS = registerBlock("brown_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANK_SLAB = registerBlock("brown_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_CLEAR_GLASS = registerBlock("brown_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BROWN_STAINED_CLEAR_GLASS_PANE = registerBlock("brown_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //RED
    public static final RegistryObject<Block> RED_STAINED_BRICKS = registerBlock("red_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_STAIRS = registerBlock("red_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_SLAB = registerBlock("red_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_WALL = registerBlock("red_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_PLANKS = registerBlock("red_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_PLANK_STAIRS = registerBlock("red_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_PLANK_SLAB = registerBlock("red_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_CLEAR_GLASS = registerBlock("red_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> RED_STAINED_CLEAR_GLASS_PANE = registerBlock("red_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //ORANGE
    public static final RegistryObject<Block> ORANGE_STAINED_BRICKS = registerBlock("orange_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_STAIRS = registerBlock("orange_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_SLAB = registerBlock("orange_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_WALL = registerBlock("orange_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = registerBlock("orange_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANK_STAIRS = registerBlock("orange_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANK_SLAB = registerBlock("orange_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_CLEAR_GLASS = registerBlock("orange_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> ORANGE_STAINED_CLEAR_GLASS_PANE = registerBlock("orange_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //YELLOW
    public static final RegistryObject<Block> YELLOW_STAINED_BRICKS = registerBlock("yellow_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_STAIRS = registerBlock("yellow_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_SLAB = registerBlock("yellow_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_WALL = registerBlock("yellow_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = registerBlock("yellow_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANK_STAIRS = registerBlock("yellow_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANK_SLAB = registerBlock("yellow_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_CLEAR_GLASS = registerBlock("yellow_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> YELLOW_STAINED_CLEAR_GLASS_PANE = registerBlock("yellow_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //LIME
    public static final RegistryObject<Block> LIME_STAINED_BRICKS = registerBlock("lime_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_STAIRS = registerBlock("lime_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_SLAB = registerBlock("lime_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_WALL = registerBlock("lime_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_PLANKS = registerBlock("lime_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_PLANK_STAIRS = registerBlock("lime_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_PLANK_SLAB = registerBlock("lime_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_CLEAR_GLASS = registerBlock("lime_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIME_STAINED_CLEAR_GLASS_PANE = registerBlock("lime_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //GREEN
    public static final RegistryObject<Block> GREEN_STAINED_BRICKS = registerBlock("green_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_STAIRS = registerBlock("green_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_SLAB = registerBlock("green_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_WALL = registerBlock("green_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = registerBlock("green_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANK_STAIRS = registerBlock("green_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANK_SLAB = registerBlock("green_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_CLEAR_GLASS = registerBlock("green_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GREEN_STAINED_CLEAR_GLASS_PANE = registerBlock("green_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //CYAN
    public static final RegistryObject<Block> CYAN_STAINED_BRICKS = registerBlock("cyan_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_STAIRS = registerBlock("cyan_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_SLAB = registerBlock("cyan_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_WALL = registerBlock("cyan_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = registerBlock("cyan_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANK_STAIRS = registerBlock("cyan_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANK_SLAB = registerBlock("cyan_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_CLEAR_GLASS = registerBlock("cyan_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CYAN_STAINED_CLEAR_GLASS_PANE = registerBlock("cyan_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //LIGHT_BLUE
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICKS = registerBlock("light_blue_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_STAIRS = registerBlock("light_blue_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_SLAB = registerBlock("light_blue_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_WALL = registerBlock("light_blue_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = registerBlock("light_blue_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANK_STAIRS = registerBlock("light_blue_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANK_SLAB = registerBlock("light_blue_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_CLEAR_GLASS = registerBlock("light_blue_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = registerBlock("light_blue_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //BLUE
    public static final RegistryObject<Block> BLUE_STAINED_BRICKS = registerBlock("blue_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_STAIRS = registerBlock("blue_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_SLAB = registerBlock("blue_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_WALL = registerBlock("blue_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = registerBlock("blue_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANK_STAIRS = registerBlock("blue_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANK_SLAB = registerBlock("blue_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_CLEAR_GLASS = registerBlock("blue_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLUE_STAINED_CLEAR_GLASS_PANE = registerBlock("blue_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //PURPLE
    public static final RegistryObject<Block> PURPLE_STAINED_BRICKS = registerBlock("purple_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_STAIRS = registerBlock("purple_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_SLAB = registerBlock("purple_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_WALL = registerBlock("purple_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = registerBlock("purple_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANK_STAIRS = registerBlock("purple_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANK_SLAB = registerBlock("purple_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_CLEAR_GLASS = registerBlock("purple_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PURPLE_STAINED_CLEAR_GLASS_PANE = registerBlock("purple_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //MAGENTA
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICKS = registerBlock("magenta_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_STAIRS = registerBlock("magenta_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_SLAB = registerBlock("magenta_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_WALL = registerBlock("magenta_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = registerBlock("magenta_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANK_STAIRS = registerBlock("magenta_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANK_SLAB = registerBlock("magenta_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_CLEAR_GLASS = registerBlock("magenta_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> MAGENTA_STAINED_CLEAR_GLASS_PANE = registerBlock("magenta_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //PINK
    public static final RegistryObject<Block> PINK_STAINED_BRICKS = registerBlock("pink_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_STAIRS = registerBlock("pink_stained_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_STAINED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_SLAB = registerBlock("pink_stained_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_WALL = registerBlock("pink_stained_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_PLANKS = registerBlock("pink_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_PLANK_STAIRS = registerBlock("pink_stained_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_STAINED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_PLANK_SLAB = registerBlock("pink_stained_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_CLEAR_GLASS = registerBlock("pink_stained_clear_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PINK_STAINED_CLEAR_GLASS_PANE = registerBlock("pink_stained_clear_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    //CHISELED


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
