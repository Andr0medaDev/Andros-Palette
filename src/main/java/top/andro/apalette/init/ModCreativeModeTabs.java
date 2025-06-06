package top.andro.apalette.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.andro.apalette.APalette;

import java.util.function.Supplier;

import static net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, APalette.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("andros_palette",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ART_PALETTE.get()))
                    .title(Component.translatable("creativetab.a_palette.andros_palette"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ART_PALETTE.get());

                        //BRICKS
                        output.accept(ModBlocks.WHITE_STAINED_BRICKS.get());
                        output.accept(ModBlocks.WHITE_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.WHITE_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.WHITE_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.GRAY_STAINED_BRICKS.get());
                        output.accept(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.GRAY_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.BLACK_STAINED_BRICKS.get());
                        output.accept(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.BLACK_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.BROWN_STAINED_BRICKS.get());
                        output.accept(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.BROWN_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.RED_STAINED_BRICKS.get());
                        output.accept(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.RED_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.RED_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.ORANGE_STAINED_BRICKS.get());
                        output.accept(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.YELLOW_STAINED_BRICKS.get());
                        output.accept(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.LIME_STAINED_BRICKS.get());
                        output.accept(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.LIME_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.GREEN_STAINED_BRICKS.get());
                        output.accept(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.GREEN_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.CYAN_STAINED_BRICKS.get());
                        output.accept(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.CYAN_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.BLUE_STAINED_BRICKS.get());
                        output.accept(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.BLUE_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.PURPLE_STAINED_BRICKS.get());
                        output.accept(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.MAGENTA_STAINED_BRICKS.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());

                        output.accept(ModBlocks.PINK_STAINED_BRICKS.get());
                        output.accept(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());
                        output.accept(ModBlocks.PINK_STAINED_BRICK_SLAB.get());
                        output.accept(ModBlocks.PINK_STAINED_BRICK_WALL.get());

                        //PLANKS
                        output.accept(ModBlocks.WHITE_STAINED_PLANKS.get());
                        output.accept(ModBlocks.WHITE_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.WHITE_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.GRAY_STAINED_PLANKS.get());
                        output.accept(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.GRAY_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.BLACK_STAINED_PLANKS.get());
                        output.accept(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.BLACK_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.BROWN_STAINED_PLANKS.get());
                        output.accept(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.BROWN_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.RED_STAINED_PLANKS.get());
                        output.accept(ModBlocks.RED_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.RED_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.ORANGE_STAINED_PLANKS.get());
                        output.accept(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.YELLOW_STAINED_PLANKS.get());
                        output.accept(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.LIME_STAINED_PLANKS.get());
                        output.accept(ModBlocks.LIME_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.LIME_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.GREEN_STAINED_PLANKS.get());
                        output.accept(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.GREEN_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.CYAN_STAINED_PLANKS.get());
                        output.accept(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.CYAN_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.BLUE_STAINED_PLANKS.get());
                        output.accept(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.BLUE_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.PURPLE_STAINED_PLANKS.get());
                        output.accept(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.MAGENTA_STAINED_PLANKS.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get());

                        output.accept(ModBlocks.PINK_STAINED_PLANKS.get());
                        output.accept(ModBlocks.PINK_STAINED_PLANK_STAIRS.get());
                        output.accept(ModBlocks.PINK_STAINED_PLANK_SLAB.get());
                        //GLASS
                        output.accept(ModBlocks.CLEAR_GLASS.get());
                        output.accept(ModBlocks.CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.RED_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get());
                        output.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS.get());
                        output.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get());

                    })
                    .build());
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
