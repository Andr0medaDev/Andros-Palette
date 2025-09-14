package top.andro.apalette.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.APalette;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, APalette.MOD_ID);

    public static final RegistryObject<CreativeModeTab> A_PALETTE = CREATIVE_MODE_TABS.register("a_palette",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ART_PALETTE.get()))
                    .title(Component.translatable("creativetab_a_palette"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ART_PALETTE.get());

                        //BRICKS
                        pOutput.accept(ModBlocks.WHITE_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.GRAY_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.BLACK_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.BROWN_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.RED_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.RED_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.ORANGE_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.YELLOW_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.LIME_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.GREEN_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.CYAN_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.BLUE_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.PURPLE_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.MAGENTA_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.PINK_STAINED_BRICKS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_BRICK_WALL.get());

                        //PLANKS
                        pOutput.accept(ModBlocks.WHITE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_WHITE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANK_BUTTON.get());


                        pOutput.accept(ModBlocks.GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.BLACK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.BROWN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.RED_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_RED_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_RED_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.ORANGE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.YELLOW_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.LIME_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIME_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIME_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.GREEN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_GREEN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.CYAN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.PURPLE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.MAGENTA_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANK_BUTTON.get());

                        pOutput.accept(ModBlocks.PINK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_FENCE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_DOOR.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANK_BUTTON.get());
                        //GLASS
                        pOutput.accept(ModBlocks.CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get());

                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
