package top.andro.a_palette.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import top.andro.a_palette.init.ModBlocks;
import top.andro.a_palette.init.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ART_PALETTE.get());
        //WHITE
        dropSelf(ModBlocks.WHITE_STAINED_BRICKS.get());
        dropSelf(ModBlocks.WHITE_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.WHITE_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.WHITE_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.WHITE_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.WHITE_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.WHITE_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_WHITE_STAINED_WOODEN_WOOD.get());

        //LIGHT_GRAY
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOODEN_WOOD.get());


        //GRAY
        dropSelf(ModBlocks.GRAY_STAINED_BRICKS.get());
        dropSelf(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.GRAY_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.GRAY_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.GRAY_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.GRAY_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GRAY_STAINED_WOODEN_WOOD.get());


        //BLACK
        dropSelf(ModBlocks.BLACK_STAINED_BRICKS.get());
        dropSelf(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.BLACK_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.BLACK_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.BLACK_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.BLACK_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BLACK_STAINED_WOODEN_WOOD.get());


        //BROWN
        dropSelf(ModBlocks.BROWN_STAINED_BRICKS.get());
        dropSelf(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.BROWN_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.BROWN_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.BROWN_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.BROWN_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BROWN_STAINED_WOODEN_WOOD.get());

        //RED
        dropSelf(ModBlocks.RED_STAINED_BRICKS.get());
        dropSelf(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.RED_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.RED_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.RED_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.RED_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.RED_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.RED_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_RED_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_RED_STAINED_WOODEN_WOOD.get());

        //ORANGE
        dropSelf(ModBlocks.ORANGE_STAINED_BRICKS.get());
        dropSelf(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.ORANGE_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.ORANGE_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.ORANGE_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_STAINED_WOODEN_WOOD.get());

        //YELLOW
        dropSelf(ModBlocks.YELLOW_STAINED_BRICKS.get());
        dropSelf(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.YELLOW_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.YELLOW_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.YELLOW_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_YELLOW_STAINED_WOODEN_WOOD.get());

        //LIME
        dropSelf(ModBlocks.LIME_STAINED_BRICKS.get());
        dropSelf(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.LIME_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIME_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.LIME_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.LIME_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIME_STAINED_WOODEN_WOOD.get());

        //GREEN
        dropSelf(ModBlocks.GREEN_STAINED_BRICKS.get());
        dropSelf(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.GREEN_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.GREEN_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.GREEN_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.GREEN_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GREEN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GREEN_STAINED_WOODEN_WOOD.get());

        //CYAN
        dropSelf(ModBlocks.CYAN_STAINED_BRICKS.get());
        dropSelf(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.CYAN_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.CYAN_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.CYAN_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.CYAN_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_CYAN_STAINED_WOODEN_WOOD.get());

        //LIGHT_BLUE
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOODEN_WOOD.get());

        //BLUE
        dropSelf(ModBlocks.BLUE_STAINED_BRICKS.get());
        dropSelf(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.BLUE_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.BLUE_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.BLUE_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.BLUE_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BLUE_STAINED_WOODEN_WOOD.get());

        //PURPLE
        dropSelf(ModBlocks.PURPLE_STAINED_BRICKS.get());
        dropSelf(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.PURPLE_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.PURPLE_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.PURPLE_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PURPLE_STAINED_WOODEN_WOOD.get());

        //MAGENTA
        dropSelf(ModBlocks.MAGENTA_STAINED_BRICKS.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.MAGENTA_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.MAGENTA_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MAGENTA_STAINED_WOODEN_WOOD.get());

        //PINK
        dropSelf(ModBlocks.PINK_STAINED_BRICKS.get());
        dropSelf(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.PINK_STAINED_BRICK_SLAB.get());
        dropSelf(ModBlocks.PINK_STAINED_BRICK_WALL.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_PLANKS.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_STAIRS.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_SLAB.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_FENCE.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_FENCE_GATE.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_PRESSURE_PLATE.get());
        this.add(ModBlocks.PINK_STAINED_WOODEN_DOOR.get(), block -> createDoorTable(ModBlocks.PINK_STAINED_WOODEN_DOOR.get()));
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_TRAPDOOR.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_BUTTON.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.PINK_STAINED_WOODEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PINK_STAINED_WOODEN_WOOD.get());

        this.add(ModBlocks.WHITE_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_GRAY_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.GRAY_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.GRAY_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BLACK_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BROWN_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.RED_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.RED_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.ORANGE_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.YELLOW_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIME_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.GREEN_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.CYAN_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_BLUE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BLUE_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.PURPLE_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.MAGENTA_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.PINK_STAINED_WOODEN_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_STAINED_WOODEN_SIGN.get()));

        this.add(ModBlocks.WHITE_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_GRAY_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.GRAY_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.GRAY_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BLACK_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BROWN_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.RED_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.RED_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.ORANGE_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.YELLOW_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIME_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.GREEN_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.CYAN_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_BLUE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.BLUE_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.PURPLE_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.MAGENTA_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_STAINED_WOODEN_SIGN.get()));
        this.add(ModBlocks.PINK_STAINED_WOODEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_STAINED_WOODEN_SIGN.get()));

        this.add(ModBlocks.WHITE_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.GRAY_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GRAY_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BLACK_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BROWN_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.RED_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.RED_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.ORANGE_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.YELLOW_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIME_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.GREEN_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.CYAN_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BLUE_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.PINK_STAINED_WOODEN_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_STAINED_WOODEN_HANGING_SIGN.get()));

        this.add(ModBlocks.WHITE_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GRAY_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BLACK_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BROWN_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.RED_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.RED_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.ORANGE_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.YELLOW_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIME_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.GREEN_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.CYAN_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.MAGENTA_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get()));
        this.add(ModBlocks.PINK_STAINED_WOODEN_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_STAINED_WOODEN_HANGING_SIGN.get()));


        //SIDING (BORDERED)
        dropSelf(ModBlocks.WHITE_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.GRAY_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.BLACK_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.BROWN_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.RED_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.ORANGE_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.YELLOW_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.LIME_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.GREEN_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.CYAN_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.BLUE_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.PURPLE_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_BORDERED_SIDING.get());
        dropSelf(ModBlocks.PINK_STAINED_BORDERED_SIDING.get());


        //SIDING
        dropSelf(ModBlocks.WHITE_STAINED_SIDING.get());
        dropSelf(ModBlocks.LIGHT_GRAY_STAINED_SIDING.get());
        dropSelf(ModBlocks.GRAY_STAINED_SIDING.get());
        dropSelf(ModBlocks.BLACK_STAINED_SIDING.get());
        dropSelf(ModBlocks.BROWN_STAINED_SIDING.get());
        dropSelf(ModBlocks.RED_STAINED_SIDING.get());
        dropSelf(ModBlocks.ORANGE_STAINED_SIDING.get());
        dropSelf(ModBlocks.YELLOW_STAINED_SIDING.get());
        dropSelf(ModBlocks.LIME_STAINED_SIDING.get());
        dropSelf(ModBlocks.GREEN_STAINED_SIDING.get());
        dropSelf(ModBlocks.CYAN_STAINED_SIDING.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STAINED_SIDING.get());
        dropSelf(ModBlocks.BLUE_STAINED_SIDING.get());
        dropSelf(ModBlocks.PURPLE_STAINED_SIDING.get());
        dropSelf(ModBlocks.MAGENTA_STAINED_SIDING.get());
        dropSelf(ModBlocks.PINK_STAINED_SIDING.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
