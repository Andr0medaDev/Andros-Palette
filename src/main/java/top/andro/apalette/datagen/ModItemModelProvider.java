package top.andro.apalette.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.andro.apalette.APalette;
import top.andro.apalette.init.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, APalette.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.WHITE_STAINED_BRICK_WALL, ModBlocks.WHITE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.WHITE_STAINED_PLANK_FENCE, ModBlocks.WHITE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL, ModBlocks.LIGHT_GRAY_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE, ModBlocks.LIGHT_GRAY_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.GRAY_STAINED_BRICK_WALL, ModBlocks.GRAY_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.GRAY_STAINED_PLANK_FENCE, ModBlocks.GRAY_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BLACK_STAINED_BRICK_WALL, ModBlocks.BLACK_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.BLACK_STAINED_PLANK_FENCE, ModBlocks.BLACK_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BROWN_STAINED_BRICK_WALL, ModBlocks.BROWN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.BROWN_STAINED_PLANK_FENCE, ModBlocks.BROWN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.RED_STAINED_BRICK_WALL, ModBlocks.RED_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.RED_STAINED_PLANK_FENCE, ModBlocks.RED_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.ORANGE_STAINED_BRICK_WALL, ModBlocks.ORANGE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.ORANGE_STAINED_PLANK_FENCE, ModBlocks.ORANGE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.YELLOW_STAINED_BRICK_WALL, ModBlocks.YELLOW_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.YELLOW_STAINED_PLANK_FENCE, ModBlocks.YELLOW_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIME_STAINED_BRICK_WALL, ModBlocks.LIME_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.LIME_STAINED_PLANK_FENCE, ModBlocks.LIME_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.GREEN_STAINED_BRICK_WALL, ModBlocks.GREEN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.GREEN_STAINED_PLANK_FENCE, ModBlocks.GREEN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.CYAN_STAINED_BRICK_WALL, ModBlocks.CYAN_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.CYAN_STAINED_PLANK_FENCE, ModBlocks.CYAN_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL, ModBlocks.LIGHT_BLUE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE, ModBlocks.LIGHT_BLUE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.BLUE_STAINED_BRICK_WALL, ModBlocks.BLUE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.BLUE_STAINED_PLANK_FENCE, ModBlocks.BLUE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.PURPLE_STAINED_BRICK_WALL, ModBlocks.PURPLE_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.PURPLE_STAINED_PLANK_FENCE, ModBlocks.PURPLE_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.MAGENTA_STAINED_BRICK_WALL, ModBlocks.MAGENTA_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.MAGENTA_STAINED_PLANK_FENCE, ModBlocks.MAGENTA_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_PLANK_FENCE_GATE);

        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_SLAB);
        wallItem(ModBlocks.PINK_STAINED_BRICK_WALL, ModBlocks.PINK_STAINED_BRICKS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_PLANK_SLAB);
        fenceItem(ModBlocks.PINK_STAINED_PLANK_FENCE, ModBlocks.PINK_STAINED_PLANKS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_PLANK_FENCE_GATE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(APalette.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(APalette.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(APalette.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(APalette.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(APalette.MOD_ID,"item/" + item.getId().getPath()));
    }
}
