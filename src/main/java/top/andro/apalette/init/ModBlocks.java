package top.andro.apalette.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.APalette;
import top.andro.apalette.block.ArtPaletteBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, APalette.MOD_ID);

    public static final RegistryObject<Block> ART_PALETTE = registerBlock("art_palette",
            () -> new ArtPaletteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    ///PAINTED

    //PLANKS
    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = registerBlock("white_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = registerBlock("light_gray_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = registerBlock("gray_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block>  BLACK_STAINED_PLANKS = registerBlock("black_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = registerBlock("brown_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_STAINED_PLANKS = registerBlock("red_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = registerBlock("orange_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = registerBlock("yellow_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_STAINED_PLANKS = registerBlock("lime_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = registerBlock("green_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = registerBlock("cyan_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = registerBlock("light_blue_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = registerBlock("blue_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = registerBlock("purple_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = registerBlock("magenta_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_STAINED_PLANKS = registerBlock("pink_stained_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    //BRICKS
    public static final RegistryObject<Block> WHITE_STAINED_BRICKS = registerBlock("white_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BRICKS = registerBlock("light_gray_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GRAY_STAINED_BRICKS = registerBlock("gray_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLACK_STAINED_BRICKS = registerBlock("black_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BROWN_STAINED_BRICKS = registerBlock("brown_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> RED_STAINED_BRICKS = registerBlock("red_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> ORANGE_STAINED_BRICKS = registerBlock("orange_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> YELLOW_STAINED_BRICKS = registerBlock("yellow_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIME_STAINED_BRICKS = registerBlock("lime_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> GREEN_STAINED_BRICKS = registerBlock("green_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CYAN_STAINED_BRICKS = registerBlock("cyan_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BRICKS = registerBlock("light_blue_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BLUE_STAINED_BRICKS = registerBlock("blue_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PURPLE_STAINED_BRICKS = registerBlock("purple_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BRICKS = registerBlock("magenta_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> PINK_STAINED_BRICKS = registerBlock("pink_stained_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));




    ///CHISELED


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
