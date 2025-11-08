package top.andro.a_palette.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.andro.a_palette.APalette;

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
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.WHITE_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.WHITE_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.WHITE_STAINED_BOAT.get());
                        pOutput.accept(ModItems.WHITE_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.LIGHT_GRAY_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_STAINED_BOAT.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.GRAY_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.GRAY_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.GRAY_STAINED_BOAT.get());
                        pOutput.accept(ModItems.GRAY_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.BLACK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.BLACK_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.BLACK_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.BLACK_STAINED_BOAT.get());
                        pOutput.accept(ModItems.BLACK_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.BROWN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.BROWN_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.BROWN_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.BROWN_STAINED_BOAT.get());
                        pOutput.accept(ModItems.BROWN_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.RED_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_RED_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_RED_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.RED_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.RED_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.RED_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.RED_STAINED_BOAT.get());
                        pOutput.accept(ModItems.RED_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.ORANGE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.ORANGE_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.ORANGE_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ORANGE_STAINED_BOAT.get());
                        pOutput.accept(ModItems.ORANGE_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.YELLOW_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.YELLOW_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.YELLOW_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.YELLOW_STAINED_BOAT.get());
                        pOutput.accept(ModItems.YELLOW_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.LIME_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIME_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIME_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.LIME_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.LIME_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.LIME_STAINED_BOAT.get());
                        pOutput.accept(ModItems.LIME_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.GREEN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_GREEN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.GREEN_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.GREEN_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.GREEN_STAINED_BOAT.get());
                        pOutput.accept(ModItems.GREEN_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.CYAN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.CYAN_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.CYAN_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.CYAN_STAINED_BOAT.get());
                        pOutput.accept(ModItems.CYAN_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.LIGHT_BLUE_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_STAINED_BOAT.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.BLUE_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.BLUE_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.BLUE_STAINED_BOAT.get());
                        pOutput.accept(ModItems.BLUE_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.PURPLE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.PURPLE_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.PURPLE_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.PURPLE_STAINED_BOAT.get());
                        pOutput.accept(ModItems.PURPLE_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.MAGENTA_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.MAGENTA_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.MAGENTA_STAINED_BOAT.get());
                        pOutput.accept(ModItems.MAGENTA_STAINED_CHEST_BOAT.get());

                        pOutput.accept(ModBlocks.PINK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINK_STAINED_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINK_STAINED_WOOD.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_PLANKS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_FENCE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_DOOR.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_WOODEN_BUTTON.get());

                        pOutput.accept(ModItems.PINK_STAINED_WOODEN_SIGN.get());
                        pOutput.accept(ModItems.PINK_STAINED_WOODEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.PINK_STAINED_BOAT.get());
                        pOutput.accept(ModItems.PINK_STAINED_CHEST_BOAT.get());
                        //GLASS
                        pOutput.accept(ModBlocks.CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.WHITE_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.GRAY_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.BLACK_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.BROWN_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.RED_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.RED_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.RED_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.ORANGE_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.YELLOW_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.LIME_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.GREEN_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.CYAN_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.BLUE_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.PURPLE_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.MAGENTA_STAINED_MODERN_GLASS_PANE.get());

                        pOutput.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_MODERN_GLASS.get());
                        pOutput.accept(ModBlocks.PINK_STAINED_MODERN_GLASS_PANE.get());

                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
