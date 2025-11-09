package top.andro.a_palette.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import top.andro.a_palette.APalette;
import top.andro.a_palette.init.ModBlocks;
import top.andro.a_palette.init.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.WHITE_STAINED_BRICK_WALL, ModBlocks.WHITE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.WHITE_STAINED_WOODEN_FENCE, ModBlocks.WHITE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.WHITE_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL, ModBlocks.LIGHT_GRAY_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE, ModBlocks.LIGHT_GRAY_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.GRAY_STAINED_BRICK_WALL, ModBlocks.GRAY_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.GRAY_STAINED_WOODEN_FENCE, ModBlocks.GRAY_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.GRAY_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BLACK_STAINED_BRICK_WALL, ModBlocks.BLACK_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.BLACK_STAINED_WOODEN_FENCE, ModBlocks.BLACK_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.BLACK_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BROWN_STAINED_BRICK_WALL, ModBlocks.BROWN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.BROWN_STAINED_WOODEN_FENCE, ModBlocks.BROWN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.BROWN_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.RED_STAINED_BRICK_WALL, ModBlocks.RED_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.RED_STAINED_WOODEN_FENCE, ModBlocks.RED_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.RED_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.ORANGE_STAINED_BRICK_WALL, ModBlocks.ORANGE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.ORANGE_STAINED_WOODEN_FENCE, ModBlocks.ORANGE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.ORANGE_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.YELLOW_STAINED_BRICK_WALL, ModBlocks.YELLOW_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.YELLOW_STAINED_WOODEN_FENCE, ModBlocks.YELLOW_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.YELLOW_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIME_STAINED_BRICK_WALL, ModBlocks.LIME_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.LIME_STAINED_WOODEN_FENCE, ModBlocks.LIME_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.LIME_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.GREEN_STAINED_BRICK_WALL, ModBlocks.GREEN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.GREEN_STAINED_WOODEN_FENCE, ModBlocks.GREEN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.GREEN_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.CYAN_STAINED_BRICK_WALL, ModBlocks.CYAN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.CYAN_STAINED_WOODEN_FENCE, ModBlocks.CYAN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.CYAN_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL, ModBlocks.LIGHT_BLUE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE, ModBlocks.LIGHT_BLUE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BLUE_STAINED_BRICK_WALL, ModBlocks.BLUE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.BLUE_STAINED_WOODEN_FENCE, ModBlocks.BLUE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.BLUE_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.PURPLE_STAINED_BRICK_WALL, ModBlocks.PURPLE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.PURPLE_STAINED_WOODEN_FENCE, ModBlocks.PURPLE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.PURPLE_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.MAGENTA_STAINED_BRICK_WALL, ModBlocks.MAGENTA_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE, ModBlocks.MAGENTA_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.MAGENTA_STAINED_WOODEN_DOOR.asItem());

        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.PINK_STAINED_BRICK_WALL, ModBlocks.PINK_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_WOODEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_WOODEN_SLAB);
        fenceItem(ModBlocks.PINK_STAINED_WOODEN_FENCE, ModBlocks.PINK_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_WOODEN_FENCE_GATE);
        basicItem(ModBlocks.PINK_STAINED_WOODEN_DOOR.asItem());

        buttonItem(ModBlocks.WHITE_STAINED_WOODEN_BUTTON, ModBlocks.WHITE_STAINED_PLANKS);
        buttonItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_BUTTON, ModBlocks.LIGHT_GRAY_STAINED_PLANKS);
        buttonItem(ModBlocks.GRAY_STAINED_WOODEN_BUTTON, ModBlocks.GRAY_STAINED_PLANKS);
        buttonItem(ModBlocks.BLACK_STAINED_WOODEN_BUTTON, ModBlocks.BLACK_STAINED_PLANKS);
        buttonItem(ModBlocks.BROWN_STAINED_WOODEN_BUTTON, ModBlocks.BROWN_STAINED_PLANKS);
        buttonItem(ModBlocks.RED_STAINED_WOODEN_BUTTON, ModBlocks.RED_STAINED_PLANKS);
        buttonItem(ModBlocks.ORANGE_STAINED_WOODEN_BUTTON, ModBlocks.ORANGE_STAINED_PLANKS);
        buttonItem(ModBlocks.YELLOW_STAINED_WOODEN_BUTTON, ModBlocks.YELLOW_STAINED_PLANKS);
        buttonItem(ModBlocks.LIME_STAINED_WOODEN_BUTTON, ModBlocks.LIME_STAINED_PLANKS);
        buttonItem(ModBlocks.GREEN_STAINED_WOODEN_BUTTON, ModBlocks.GREEN_STAINED_PLANKS);
        buttonItem(ModBlocks.CYAN_STAINED_WOODEN_BUTTON, ModBlocks.CYAN_STAINED_PLANKS);
        buttonItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_BUTTON, ModBlocks.LIGHT_BLUE_STAINED_PLANKS);
        buttonItem(ModBlocks.BLUE_STAINED_WOODEN_BUTTON, ModBlocks.BLUE_STAINED_PLANKS);
        buttonItem(ModBlocks.PURPLE_STAINED_WOODEN_BUTTON, ModBlocks.PURPLE_STAINED_PLANKS);
        buttonItem(ModBlocks.MAGENTA_STAINED_WOODEN_BUTTON, ModBlocks.MAGENTA_STAINED_PLANKS);
        buttonItem(ModBlocks.PINK_STAINED_WOODEN_BUTTON, ModBlocks.PINK_STAINED_PLANKS);

        basicItem(ModItems.WHITE_STAINED_BOAT.get());
        basicItem(ModItems.LIGHT_GRAY_STAINED_BOAT.get());
        basicItem(ModItems.GRAY_STAINED_BOAT.get());
        basicItem(ModItems.BLACK_STAINED_BOAT.get());
        basicItem(ModItems.BROWN_STAINED_BOAT.get());
        basicItem(ModItems.RED_STAINED_BOAT.get());
        basicItem(ModItems.ORANGE_STAINED_BOAT.get());
        basicItem(ModItems.YELLOW_STAINED_BOAT.get());
        basicItem(ModItems.LIME_STAINED_BOAT.get());
        basicItem(ModItems.GREEN_STAINED_BOAT.get());
        basicItem(ModItems.CYAN_STAINED_BOAT.get());
        basicItem(ModItems.LIGHT_BLUE_STAINED_BOAT.get());
        basicItem(ModItems.BLUE_STAINED_BOAT.get());
        basicItem(ModItems.PURPLE_STAINED_BOAT.get());
        basicItem(ModItems.MAGENTA_STAINED_BOAT.get());
        basicItem(ModItems.PINK_STAINED_BOAT.get());

        basicItem(ModItems.WHITE_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.LIGHT_GRAY_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.GRAY_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.BLACK_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.BROWN_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.RED_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.ORANGE_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.YELLOW_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.LIME_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.GREEN_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.CYAN_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.LIGHT_BLUE_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.BLUE_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.PURPLE_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.MAGENTA_STAINED_CHEST_BOAT.get());
        basicItem(ModItems.PINK_STAINED_CHEST_BOAT.get());

        basicItem(ModItems.WHITE_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.LIGHT_GRAY_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.GRAY_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.BLACK_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.BROWN_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.RED_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.ORANGE_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.YELLOW_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.LIME_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.GREEN_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.CYAN_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.LIGHT_BLUE_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.BLUE_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.PURPLE_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.MAGENTA_STAINED_WOODEN_SIGN.get());
        basicItem(ModItems.PINK_STAINED_WOODEN_SIGN.get());

        basicItem(ModItems.WHITE_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.GRAY_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.BLACK_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.BROWN_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.RED_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.ORANGE_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.YELLOW_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.LIME_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.GREEN_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.CYAN_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.BLUE_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.PURPLE_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get());
        basicItem(ModItems.PINK_STAINED_WOODEN_HANGING_SIGN.get());

        trapdoorItem(ModBlocks.WHITE_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.LIGHT_GRAY_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.GRAY_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.BLACK_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.BROWN_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.RED_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.ORANGE_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.YELLOW_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.LIME_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.GREEN_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.CYAN_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.LIGHT_BLUE_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.BLUE_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.PURPLE_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.MAGENTA_STAINED_WOODEN_TRAPDOOR);
        trapdoorItem(ModBlocks.PINK_STAINED_WOODEN_TRAPDOOR);
    }

    public void evenSimplerBlockItem(DeferredBlock<Block> block) {
        this.withExistingParent(APalette.MOD_ID + ":" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(DeferredBlock<Block> block) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath() + "_bottom"));
    }

    public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(APalette.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(APalette.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(APalette.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }

    /*private ItemModelBuilder simpleBlockItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.fromNamespaceAndPath(APalette.MOD_ID,"item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(APalette.MOD_ID,"item/" + item.getId().getPath()));
    }*/
}
