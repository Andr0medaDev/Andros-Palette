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
        //LIGHT_GRAY
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB.get());
        //GRAY
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANK_SLAB.get());

        //BLACK
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANK_SLAB.get());

        //BROWN
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANK_SLAB.get());
        //RED
        this.dropSelf(ModBlocks.RED_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.RED_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANK_SLAB.get());
        //ORANGE
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANK_SLAB.get());
        //YELLOW
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANK_SLAB.get());
        //LIME
        this.dropSelf(ModBlocks.LIME_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANK_SLAB.get());
        //GREEN
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANK_SLAB.get());
        //CYAN
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANK_SLAB.get());
        //LIGHT_BLUE
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB.get());
        //BLUE
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANK_SLAB.get());
        //PURPLE
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANK_SLAB.get());
        //MAGENTA
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANK_SLAB.get());
        //PINK
        this.dropSelf(ModBlocks.PINK_STAINED_BRICKS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANK_SLAB.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
