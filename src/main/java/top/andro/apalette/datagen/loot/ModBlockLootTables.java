package top.andro.apalette.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.init.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ART_PALETTE.get());
        //WHITE
        this.dropSelf(ModBlocks.WHITE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.WHITE_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.WHITE_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_STAINED_WOOD.get());

        //LIGHT_GRAY
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_GRAY_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.LIGHT_GRAY_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_LOG.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_STAINED_WOOD.get());


        //GRAY
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.GRAY_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.GRAY_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_LOG.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GRAY_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GRAY_STAINED_WOOD.get());


        //BLACK
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.BLACK_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.BLACK_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_LOG.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_STAINED_WOOD.get());


        //BROWN
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.BROWN_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.BROWN_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BROWN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BROWN_STAINED_WOOD.get());

        //RED
        this.dropSelf(ModBlocks.RED_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.RED_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.RED_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.RED_STAINED_LOG.get());
        this.dropSelf(ModBlocks.RED_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_STAINED_WOOD.get());

        //ORANGE
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.ORANGE_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.ORANGE_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ORANGE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ORANGE_STAINED_WOOD.get());

        //YELLOW
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.YELLOW_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.YELLOW_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_LOG.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_YELLOW_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_YELLOW_STAINED_WOOD.get());

        //LIME
        this.dropSelf(ModBlocks.LIME_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIME_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.LIME_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_STAINED_LOG.get());
        this.dropSelf(ModBlocks.LIME_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LIME_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIME_STAINED_WOOD.get());

        //GREEN
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.GREEN_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.GREEN_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_STAINED_WOOD.get());

        //CYAN
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.CYAN_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.CYAN_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_STAINED_WOOD.get());

        //LIGHT_BLUE
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_BLUE_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.LIGHT_BLUE_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_WOOD.get());
        //this.dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_STAINED_WOOD.get());

        //BLUE
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.BLUE_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.BLUE_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLUE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLUE_STAINED_WOOD.get());

        //PURPLE
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.PURPLE_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.PURPLE_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_STAINED_WOOD.get());

        //MAGENTA
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.MAGENTA_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.MAGENTA_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_LOG.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGENTA_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGENTA_STAINED_WOOD.get());

        //PINK
        this.dropSelf(ModBlocks.PINK_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_PRESSURE_PLATE.get());
        this.add(ModBlocks.PINK_STAINED_PLANK_DOOR.get(), block -> createDoorTable(ModBlocks.PINK_STAINED_PLANK_DOOR.get()));
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_STAINED_LOG.get());
        this.dropSelf(ModBlocks.PINK_STAINED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINK_STAINED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINK_STAINED_WOOD.get());


        //SIDING (BORDERED)
        this.dropSelf(ModBlocks.WHITE_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.RED_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BORDERED_SIDING.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BORDERED_SIDING.get());


        //SIDING
        this.dropSelf(ModBlocks.WHITE_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.RED_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.LIME_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_SIDING.get());
        this.dropSelf(ModBlocks.PINK_STAINED_SIDING.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
