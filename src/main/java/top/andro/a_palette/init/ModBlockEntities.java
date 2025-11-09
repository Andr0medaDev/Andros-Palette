package top.andro.a_palette.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.andro.a_palette.APalette;
import top.andro.a_palette.blockentity.ModHangingSignBlockEntity;
import top.andro.a_palette.blockentity.ModSignBlockEntity;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, APalette.MOD_ID);

    public static final Supplier<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.WHITE_STAINED_WOODEN_SIGN.get(), ModBlocks.WHITE_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SIGN.get(), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.GRAY_STAINED_WOODEN_SIGN.get(), ModBlocks.GRAY_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.BLACK_STAINED_WOODEN_SIGN.get(), ModBlocks.BLACK_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.BROWN_STAINED_WOODEN_SIGN.get(), ModBlocks.BROWN_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.RED_STAINED_WOODEN_SIGN.get(), ModBlocks.RED_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.ORANGE_STAINED_WOODEN_SIGN.get(), ModBlocks.ORANGE_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.YELLOW_STAINED_WOODEN_SIGN.get(), ModBlocks.YELLOW_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.LIME_STAINED_WOODEN_SIGN.get(), ModBlocks.LIME_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.GREEN_STAINED_WOODEN_SIGN.get(), ModBlocks.GREEN_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.CYAN_STAINED_WOODEN_SIGN.get(), ModBlocks.CYAN_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SIGN.get(), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.BLUE_STAINED_WOODEN_SIGN.get(), ModBlocks.BLUE_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.PURPLE_STAINED_WOODEN_SIGN.get(), ModBlocks.PURPLE_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.MAGENTA_STAINED_WOODEN_SIGN.get(), ModBlocks.MAGENTA_STAINED_WOODEN_WALL_SIGN.get(),
                            ModBlocks.PINK_STAINED_WOODEN_SIGN.get(), ModBlocks.PINK_STAINED_WOODEN_WALL_SIGN.get()
                            ).build(null));

    public static final Supplier<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.WHITE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.WHITE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.BLACK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLACK_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.BROWN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BROWN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.RED_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.RED_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.ORANGE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.ORANGE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.YELLOW_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.YELLOW_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.LIME_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIME_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.GREEN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GREEN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.CYAN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.CYAN_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.PURPLE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PURPLE_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.MAGENTA_STAINED_WOODEN_WALL_HANGING_SIGN.get(),
                            ModBlocks.PINK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PINK_STAINED_WOODEN_WALL_HANGING_SIGN.get()
                            ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
