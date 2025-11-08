package top.andro.a_palette.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.andro.a_palette.APalette;
import top.andro.a_palette.block.*;
import top.andro.a_palette.util.ModWoodTypes;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, APalette.MOD_ID);

    public static final RegistryObject<Block> ART_PALETTE = registerBlock("art_palette",
            () -> new ArtPaletteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    //BRICKS
    public static final RegistryObject<Block> WHITE_STAINED_BRICKS = registerBlock("white_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICKS = registerBlock("light_gray_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICKS = registerBlock("gray_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICKS = registerBlock("black_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICKS = registerBlock("brown_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICKS = registerBlock("red_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICKS = registerBlock("orange_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICKS = registerBlock("yellow_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICKS = registerBlock("lime_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICKS = registerBlock("green_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICKS = registerBlock("cyan_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICKS = registerBlock("light_blue_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICKS = registerBlock("blue_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICKS = registerBlock("purple_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICKS = registerBlock("magenta_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICKS = registerBlock("pink_stained_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));


    //BRICK STAIRS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_STAIRS = registerBlock("white_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.WHITE_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_STAIRS = registerBlock("light_gray_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_STAIRS = registerBlock("gray_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_STAIRS = registerBlock("black_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.BLACK_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_STAIRS = registerBlock("brown_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.BROWN_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_STAIRS = registerBlock("red_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.RED_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_STAIRS = registerBlock("orange_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.RED_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_STAIRS = registerBlock("yellow_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.YELLOW_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_STAIRS = registerBlock("lime_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.LIME_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_STAIRS = registerBlock("green_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.LIME_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_STAIRS = registerBlock("cyan_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.CYAN_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_STAIRS = registerBlock("light_blue_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_STAIRS = registerBlock("blue_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.BLUE_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_STAIRS = registerBlock("purple_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.PURPLE_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_STAIRS = registerBlock("magenta_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.MAGENTA_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_STAIRS = registerBlock("pink_stained_brick_stairs", () -> new StairBlock(() -> ModBlocks.PINK_STAINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BRICKS)));


    //BRICK SLABS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_SLAB = registerBlock("white_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_SLAB = registerBlock("light_gray_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_SLAB = registerBlock("gray_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_SLAB = registerBlock("black_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_SLAB = registerBlock("brown_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_SLAB = registerBlock("red_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_SLAB = registerBlock("orange_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_SLAB = registerBlock("yellow_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_SLAB = registerBlock("lime_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_SLAB = registerBlock("green_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_SLAB = registerBlock("cyan_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_SLAB = registerBlock("light_blue_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_SLAB = registerBlock("blue_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_SLAB = registerBlock("purple_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_SLAB = registerBlock("magenta_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_SLAB = registerBlock("pink_stained_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));


    //BRICK WALLS
    public static final RegistryObject<Block> WHITE_STAINED_BRICK_WALL = registerBlock("white_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICK_WALL = registerBlock("light_gray_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICK_WALL = registerBlock("gray_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICK_WALL = registerBlock("black_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICK_WALL = registerBlock("brown_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICK_WALL = registerBlock("red_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICK_WALL = registerBlock("orange_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICK_WALL = registerBlock("yellow_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICK_WALL = registerBlock("lime_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICK_WALL = registerBlock("green_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICK_WALL = registerBlock("cyan_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICK_WALL = registerBlock("light_blue_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICK_WALL = registerBlock("blue_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICK_WALL = registerBlock("purple_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICK_WALL = registerBlock("magenta_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICK_WALL = registerBlock("pink_stained_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));


    //LOGS
    public static final RegistryObject<Block> WHITE_STAINED_LOG = registerBlock("white_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_LOG = registerBlock("light_gray_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GRAY_STAINED_LOG = registerBlock("gray_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLACK_STAINED_LOG = registerBlock("black_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BROWN_STAINED_LOG = registerBlock("brown_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> RED_STAINED_LOG = registerBlock("red_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ORANGE_STAINED_LOG = registerBlock("orange_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> YELLOW_STAINED_LOG = registerBlock("yellow_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LIME_STAINED_LOG = registerBlock("lime_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GREEN_STAINED_LOG = registerBlock("green_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CYAN_STAINED_LOG = registerBlock("cyan_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_LOG = registerBlock("light_blue_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLUE_STAINED_LOG = registerBlock("blue_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PURPLE_STAINED_LOG = registerBlock("purple_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAGENTA_STAINED_LOG = registerBlock("magenta_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PINK_STAINED_LOG = registerBlock("pink_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));


    //STRIPPED LOGS
    public static final RegistryObject<Block> STRIPPED_WHITE_STAINED_LOG = registerBlock("stripped_white_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LIGHT_GRAY_STAINED_LOG = registerBlock("stripped_light_gray_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GRAY_STAINED_LOG = registerBlock("stripped_gray_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLACK_STAINED_LOG = registerBlock("stripped_black_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BROWN_STAINED_LOG = registerBlock("stripped_brown_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_RED_STAINED_LOG = registerBlock("stripped_red_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ORANGE_STAINED_LOG = registerBlock("stripped_orange_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_STAINED_LOG = registerBlock("stripped_yellow_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LIME_STAINED_LOG = registerBlock("stripped_lime_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GREEN_STAINED_LOG = registerBlock("stripped_green_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CYAN_STAINED_LOG = registerBlock("stripped_cyan_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LIGHT_BLUE_STAINED_LOG = registerBlock("stripped_light_blue_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLUE_STAINED_LOG = registerBlock("stripped_blue_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PURPLE_STAINED_LOG = registerBlock("stripped_purple_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAGENTA_STAINED_LOG = registerBlock("stripped_magenta_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PINK_STAINED_LOG = registerBlock("stripped_pink_stained_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));


    //WOOD
    public static final RegistryObject<Block> WHITE_STAINED_WOOD = registerBlock("white_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOOD = registerBlock("light_gray_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> GRAY_STAINED_WOOD = registerBlock("gray_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> BLACK_STAINED_WOOD = registerBlock("black_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> BROWN_STAINED_WOOD = registerBlock("brown_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> RED_STAINED_WOOD = registerBlock("red_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOOD = registerBlock("orange_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOOD = registerBlock("yellow_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> LIME_STAINED_WOOD = registerBlock("lime_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> GREEN_STAINED_WOOD = registerBlock("green_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CYAN_STAINED_WOOD = registerBlock("cyan_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOOD = registerBlock("light_blue_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> BLUE_STAINED_WOOD = registerBlock("blue_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOOD = registerBlock("purple_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOOD = registerBlock("magenta_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> PINK_STAINED_WOOD = registerBlock("pink_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));


    //STRIPPED WOOD
    public static final RegistryObject<Block> STRIPPED_WHITE_STAINED_WOOD = registerBlock("stripped_white_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LIGHT_GRAY_STAINED_WOOD = registerBlock("stripped_light_gray_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GRAY_STAINED_WOOD = registerBlock("stripped_gray_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLACK_STAINED_WOOD = registerBlock("stripped_black_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BROWN_STAINED_WOOD = registerBlock("stripped_brown_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_RED_STAINED_WOOD = registerBlock("stripped_red_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ORANGE_STAINED_WOOD = registerBlock("stripped_orange_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_STAINED_WOOD = registerBlock("stripped_yellow_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LIME_STAINED_WOOD = registerBlock("stripped_lime_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GREEN_STAINED_WOOD = registerBlock("stripped_green_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CYAN_STAINED_WOOD = registerBlock("stripped_cyan_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LIGHT_BLUE_STAINED_WOOD = registerBlock("stripped_light_blue_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLUE_STAINED_WOOD = registerBlock("stripped_blue_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_PURPLE_STAINED_WOOD = registerBlock("stripped_purple_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAGENTA_STAINED_WOOD = registerBlock("stripped_magenta_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_PINK_STAINED_WOOD = registerBlock("stripped_pink_stained_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));


    //PLANKS
    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = registerBlock("white_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = registerBlock("light_gray_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = registerBlock("gray_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = registerBlock("black_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = registerBlock("brown_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_PLANKS = registerBlock("red_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = registerBlock("orange_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = registerBlock("yellow_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_PLANKS = registerBlock("lime_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = registerBlock("green_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = registerBlock("cyan_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = registerBlock("light_blue_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = registerBlock("blue_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = registerBlock("purple_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = registerBlock("magenta_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_PLANKS = registerBlock("pink_stained_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    //PLANK STAIRS
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_STAIRS = registerBlock("white_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.WHITE_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_STAIRS = registerBlock("light_gray_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_STAIRS = registerBlock("gray_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_STAIRS = registerBlock("black_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.GRAY_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_STAIRS = registerBlock("brown_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.BROWN_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_STAIRS = registerBlock("red_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.RED_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_STAIRS = registerBlock("orange_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.ORANGE_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_STAIRS = registerBlock("yellow_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.YELLOW_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_STAIRS = registerBlock("lime_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.LIME_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_STAIRS = registerBlock("green_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.GREEN_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_STAIRS = registerBlock("cyan_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.CYAN_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_STAIRS = registerBlock("light_blue_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_STAIRS = registerBlock("blue_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.BLUE_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_STAIRS = registerBlock("purple_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.PURPLE_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_STAIRS = registerBlock("magenta_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.MAGENTA_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_STAIRS = registerBlock("pink_stained_wooden_stairs", () -> new StairBlock(() -> ModBlocks.PINK_STAINED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(OAK_PLANKS)));


    //PLANK SLABS
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SLAB = registerBlock("white_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_SLAB = registerBlock("light_gray_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_SLAB = registerBlock("gray_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_SLAB = registerBlock("black_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_SLAB = registerBlock("brown_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_SLAB = registerBlock("red_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_SLAB = registerBlock("orange_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_SLAB = registerBlock("yellow_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_SLAB = registerBlock("lime_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_SLAB = registerBlock("green_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_SLAB = registerBlock("cyan_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_SLAB = registerBlock("light_blue_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_SLAB = registerBlock("blue_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_SLAB = registerBlock("purple_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_SLAB = registerBlock("magenta_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_SLAB = registerBlock("pink_stained_wooden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get())));


    //PLANK FENCES
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE = registerBlock("white_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_FENCE = registerBlock("light_gray_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_FENCE = registerBlock("gray_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_FENCE = registerBlock("black_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_FENCE = registerBlock("brown_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_FENCE = registerBlock("red_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_FENCE = registerBlock("orange_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_FENCE = registerBlock("yellow_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_FENCE = registerBlock("lime_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_FENCE = registerBlock("green_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_FENCE = registerBlock("cyan_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_FENCE = registerBlock("light_blue_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_FENCE = registerBlock("blue_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_FENCE = registerBlock("purple_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_FENCE = registerBlock("magenta_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_FENCE = registerBlock("pink_stained_wooden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get())));


    //PLANK FENCE GATES
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_FENCE_GATE = registerBlock("white_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE = registerBlock("light_gray_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_FENCE_GATE = registerBlock("gray_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_FENCE_GATE = registerBlock("black_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_FENCE_GATE = registerBlock("brown_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_FENCE_GATE = registerBlock("red_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_FENCE_GATE = registerBlock("orange_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_FENCE_GATE = registerBlock("yellow_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_FENCE_GATE = registerBlock("lime_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_FENCE_GATE = registerBlock("green_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_FENCE_GATE = registerBlock("cyan_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE = registerBlock("light_blue_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_FENCE_GATE = registerBlock("blue_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_FENCE_GATE = registerBlock("purple_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_FENCE_GATE = registerBlock("magenta_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_FENCE_GATE = registerBlock("pink_stained_wooden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));


    //DOORS
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_DOOR = registerBlock("white_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_DOOR = registerBlock("light_gray_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_DOOR = registerBlock("gray_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_DOOR = registerBlock("black_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_DOOR = registerBlock("brown_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_DOOR = registerBlock("red_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_DOOR = registerBlock("orange_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_DOOR = registerBlock("yellow_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_DOOR = registerBlock("lime_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_DOOR = registerBlock("green_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_DOOR = registerBlock("cyan_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_DOOR = registerBlock("light_blue_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_DOOR = registerBlock("blue_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_DOOR = registerBlock("purple_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_DOOR = registerBlock("magenta_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_DOOR = registerBlock("pink_stained_wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));


    //TRAPDOORS
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_TRAPDOOR = registerBlock("white_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_TRAPDOOR = registerBlock("light_gray_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_TRAPDOOR = registerBlock("gray_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_TRAPDOOR = registerBlock("black_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_TRAPDOOR = registerBlock("brown_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_TRAPDOOR = registerBlock("red_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_TRAPDOOR = registerBlock("orange_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_TRAPDOOR = registerBlock("yellow_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_TRAPDOOR = registerBlock("lime_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_TRAPDOOR = registerBlock("green_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_TRAPDOOR = registerBlock("cyan_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_TRAPDOOR = registerBlock("light_blue_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_TRAPDOOR = registerBlock("blue_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_TRAPDOOR = registerBlock("purple_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_TRAPDOOR = registerBlock("magenta_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_TRAPDOOR = registerBlock("pink_stained_wooden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));


    //PRESSURE PLATES
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("white_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("light_gray_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("gray_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("black_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("brown_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("red_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("orange_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("yellow_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("lime_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("green_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("cyan_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("light_blue_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("blue_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("purple_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("magenta_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_PRESSURE_PLATE = registerBlock("pink_stained_wooden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK));

    //BUTTONS
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_BUTTON = registerBlock("white_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_BUTTON = registerBlock("light_gray_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_BUTTON = registerBlock("gray_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_BUTTON = registerBlock("black_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_BUTTON = registerBlock("brown_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_BUTTON = registerBlock("red_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_BUTTON = registerBlock("orange_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_BUTTON = registerBlock("yellow_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_BUTTON = registerBlock("lime_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_BUTTON = registerBlock("green_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_BUTTON = registerBlock("cyan_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_BUTTON = registerBlock("light_blue_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_BUTTON = registerBlock("blue_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_BUTTON = registerBlock("purple_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_BUTTON = registerBlock("magenta_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_BUTTON = registerBlock("pink_stained_wooden_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get()).sound(SoundType.WOOD), BlockSetType.OAK, 30, true));

    // STANDING SIGN
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_SIGN = BLOCKS.register("white_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WHITE));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_SIGN = BLOCKS.register("light_gray_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_SIGN = BLOCKS.register("gray_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.GRAY));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_SIGN = BLOCKS.register("black_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLACK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_SIGN = BLOCKS.register("brown_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BROWN));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_SIGN = BLOCKS.register("red_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.RED));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_SIGN = BLOCKS.register("orange_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ORANGE));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_SIGN = BLOCKS.register("yellow_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.YELLOW));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_SIGN = BLOCKS.register("lime_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LIME));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_SIGN = BLOCKS.register("green_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.GREEN));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_SIGN = BLOCKS.register("cyan_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_SIGN = BLOCKS.register("light_blue_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_SIGN = BLOCKS.register("blue_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLUE));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_SIGN = BLOCKS.register("purple_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PURPLE));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_SIGN = BLOCKS.register("magenta_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MAGENTA));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_SIGN = BLOCKS.register("pink_stained_wooden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PINK));

    // WALL SIGN
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("white_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WHITE));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("light_gray_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("gray_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GRAY));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("black_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLACK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("brown_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BROWN));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("red_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.RED));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("orange_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ORANGE));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("yellow_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.YELLOW));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("lime_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIME));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("green_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GREEN));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("cyan_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("light_blue_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("blue_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLUE));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("purple_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PURPLE));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("magenta_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAGENTA));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_WALL_SIGN = BLOCKS.register("pink_stained_wooden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PINK));

    // HANGING SIGN
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("white_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WHITE));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("light_gray_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("gray_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GRAY));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("black_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLACK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("brown_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BROWN));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("red_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.RED));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("orange_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ORANGE));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("yellow_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.YELLOW));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("lime_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIME));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("green_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GREEN));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("cyan_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("light_blue_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("blue_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLUE));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("purple_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PURPLE));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("magenta_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAGENTA));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_HANGING_SIGN = BLOCKS.register("pink_stained_wooden_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PINK));

    // HANGING WALL SIGN
    public static final RegistryObject<Block> WHITE_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("white_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(OAK_WALL_HANGING_SIGN), ModWoodTypes.WHITE));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("light_gray_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final RegistryObject<Block> GRAY_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("gray_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.GRAY));
    public static final RegistryObject<Block> BLACK_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("black_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLACK));
    public static final RegistryObject<Block> BROWN_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("brown_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BROWN));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("red_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.RED));
    public static final RegistryObject<Block> ORANGE_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("orange_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ORANGE));
    public static final RegistryObject<Block> YELLOW_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("yellow_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.YELLOW));
    public static final RegistryObject<Block> LIME_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("lime_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIME));
    public static final RegistryObject<Block> GREEN_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("green_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.GREEN));
    public static final RegistryObject<Block> CYAN_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("cyan_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CYAN));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("light_blue_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final RegistryObject<Block> BLUE_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("blue_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLUE));
    public static final RegistryObject<Block> PURPLE_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("purple_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PURPLE));
    public static final RegistryObject<Block> MAGENTA_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("magenta_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAGENTA));
    public static final RegistryObject<Block> PINK_STAINED_WOODEN_WALL_HANGING_SIGN = BLOCKS.register("pink_stained_wooden_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PINK));


    //CLEAR GLASS
    public static final RegistryObject<Block> CLEAR_GLASS = registerBlock("clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> WHITE_STAINED_CLEAR_GLASS = registerBlock("white_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_CLEAR_GLASS = registerBlock("light_gray_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GRAY_STAINED_CLEAR_GLASS = registerBlock("gray_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLACK_STAINED_CLEAR_GLASS = registerBlock("black_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(BLACK_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BROWN_STAINED_CLEAR_GLASS = registerBlock("brown_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(BROWN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> RED_STAINED_CLEAR_GLASS = registerBlock("red_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> ORANGE_STAINED_CLEAR_GLASS = registerBlock("orange_stained_clear_glass",() -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> YELLOW_STAINED_CLEAR_GLASS = registerBlock("yellow_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIME_STAINED_CLEAR_GLASS = registerBlock("lime_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GREEN_STAINED_CLEAR_GLASS = registerBlock("green_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CYAN_STAINED_CLEAR_GLASS = registerBlock("cyan_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_CLEAR_GLASS = registerBlock("light_blue_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLUE_STAINED_CLEAR_GLASS = registerBlock("blue_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PURPLE_STAINED_CLEAR_GLASS = registerBlock("purple_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> MAGENTA_STAINED_CLEAR_GLASS = registerBlock("magenta_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PINK_STAINED_CLEAR_GLASS = registerBlock("pink_stained_clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).noOcclusion().noLootTable()));


    //CLEAR GLASS PANE
    public static final RegistryObject<Block> CLEAR_GLASS_PANE = registerBlock("clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> WHITE_STAINED_CLEAR_GLASS_PANE = registerBlock("white_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = registerBlock("light_gray_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GRAY_STAINED_CLEAR_GLASS_PANE = registerBlock("gray_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLACK_STAINED_CLEAR_GLASS_PANE = registerBlock("black_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BLACK_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BROWN_STAINED_CLEAR_GLASS_PANE = registerBlock("brown_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BROWN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> RED_STAINED_CLEAR_GLASS_PANE = registerBlock("red_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(RED_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> ORANGE_STAINED_CLEAR_GLASS_PANE = registerBlock("orange_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(ORANGE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> YELLOW_STAINED_CLEAR_GLASS_PANE = registerBlock("yellow_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(YELLOW_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIME_STAINED_CLEAR_GLASS_PANE = registerBlock("lime_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIME_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GREEN_STAINED_CLEAR_GLASS_PANE = registerBlock("green_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(GREEN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CYAN_STAINED_CLEAR_GLASS_PANE = registerBlock("cyan_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(CYAN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = registerBlock("light_blue_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLUE_STAINED_CLEAR_GLASS_PANE = registerBlock("blue_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PURPLE_STAINED_CLEAR_GLASS_PANE = registerBlock("purple_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(PURPLE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> MAGENTA_STAINED_CLEAR_GLASS_PANE = registerBlock("magenta_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(MAGENTA_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PINK_STAINED_CLEAR_GLASS_PANE = registerBlock("pink_stained_clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(PINK_STAINED_GLASS).noOcclusion().noLootTable()));


    //MODERN GLASS
    public static final RegistryObject<Block> MODERN_GLASS = registerBlock("modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> WHITE_STAINED_MODERN_GLASS = registerBlock("white_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_MODERN_GLASS = registerBlock("light_gray_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GRAY_STAINED_MODERN_GLASS = registerBlock("gray_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLACK_STAINED_MODERN_GLASS = registerBlock("black_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(BLACK_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BROWN_STAINED_MODERN_GLASS = registerBlock("brown_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(BROWN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> RED_STAINED_MODERN_GLASS = registerBlock("red_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> ORANGE_STAINED_MODERN_GLASS = registerBlock("orange_stained_modern_glass",() -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> YELLOW_STAINED_MODERN_GLASS = registerBlock("yellow_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIME_STAINED_MODERN_GLASS = registerBlock("lime_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GREEN_STAINED_MODERN_GLASS = registerBlock("green_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CYAN_STAINED_MODERN_GLASS = registerBlock("cyan_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_MODERN_GLASS = registerBlock("light_blue_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLUE_STAINED_MODERN_GLASS = registerBlock("blue_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PURPLE_STAINED_MODERN_GLASS = registerBlock("purple_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> MAGENTA_STAINED_MODERN_GLASS = registerBlock("magenta_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PINK_STAINED_MODERN_GLASS = registerBlock("pink_stained_modern_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).noOcclusion().noLootTable()));


    //MODERN GLASS PANE
    public static final RegistryObject<Block> MODERN_GLASS_PANE = registerBlock("modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> WHITE_STAINED_MODERN_GLASS_PANE = registerBlock("white_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_MODERN_GLASS_PANE = registerBlock("light_gray_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GRAY_STAINED_MODERN_GLASS_PANE = registerBlock("gray_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(GRAY_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLACK_STAINED_MODERN_GLASS_PANE = registerBlock("black_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BLACK_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BROWN_STAINED_MODERN_GLASS_PANE = registerBlock("brown_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BROWN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> RED_STAINED_MODERN_GLASS_PANE = registerBlock("red_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(RED_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> ORANGE_STAINED_MODERN_GLASS_PANE = registerBlock("orange_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(ORANGE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> YELLOW_STAINED_MODERN_GLASS_PANE = registerBlock("yellow_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(YELLOW_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIME_STAINED_MODERN_GLASS_PANE = registerBlock("lime_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIME_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> GREEN_STAINED_MODERN_GLASS_PANE = registerBlock("green_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(GREEN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> CYAN_STAINED_MODERN_GLASS_PANE = registerBlock("cyan_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(CYAN_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_MODERN_GLASS_PANE = registerBlock("light_blue_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> BLUE_STAINED_MODERN_GLASS_PANE = registerBlock("blue_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(BLUE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PURPLE_STAINED_MODERN_GLASS_PANE = registerBlock("purple_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(PURPLE_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> MAGENTA_STAINED_MODERN_GLASS_PANE = registerBlock("magenta_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(MAGENTA_STAINED_GLASS).noOcclusion().noLootTable()));
    public static final RegistryObject<Block> PINK_STAINED_MODERN_GLASS_PANE = registerBlock("pink_stained_modern_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(PINK_STAINED_GLASS).noOcclusion().noLootTable()));


    //SIDING (BORDERED)
    public static final RegistryObject<Block> WHITE_STAINED_BORDERED_SIDING = registerBlock("white_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BORDERED_SIDING = registerBlock("light_gray_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BORDERED_SIDING = registerBlock("gray_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BORDERED_SIDING = registerBlock("black_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BORDERED_SIDING = registerBlock("brown_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_BORDERED_SIDING = registerBlock("red_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BORDERED_SIDING = registerBlock("orange_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BORDERED_SIDING = registerBlock("yellow_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_BORDERED_SIDING = registerBlock("lime_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BORDERED_SIDING = registerBlock("green_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BORDERED_SIDING = registerBlock("cyan_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BORDERED_SIDING = registerBlock("light_blue_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BORDERED_SIDING = registerBlock("blue_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BORDERED_SIDING = registerBlock("purple_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BORDERED_SIDING = registerBlock("magenta_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_BORDERED_SIDING = registerBlock("pink_stained_bordered_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    //SIDING
    public static final RegistryObject<Block> WHITE_STAINED_SIDING = registerBlock("white_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SIDING = registerBlock("light_gray_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_SIDING = registerBlock("gray_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_STAINED_SIDING = registerBlock("black_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_SIDING = registerBlock("brown_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_SIDING = registerBlock("red_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_SIDING = registerBlock("orange_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_SIDING = registerBlock("yellow_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_SIDING = registerBlock("lime_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_SIDING = registerBlock("green_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_SIDING = registerBlock("cyan_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SIDING = registerBlock("light_blue_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_SIDING = registerBlock("blue_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_SIDING = registerBlock("purple_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_SIDING = registerBlock("magenta_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_SIDING = registerBlock("pink_stained_siding", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
