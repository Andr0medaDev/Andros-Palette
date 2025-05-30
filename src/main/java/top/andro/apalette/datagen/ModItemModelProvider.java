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
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GRAY_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BROWN_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIME_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CYAN_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGENTA_STAINED_PLANK_SLAB);

        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_PLANK_STAIRS);
        evenSimplerBlockItem(ModBlocks.PINK_STAINED_PLANK_SLAB);
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
