package top.andro.a_palette.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.andro.a_palette.APalette;
import top.andro.a_palette.entity.ModBoatEntity;
import top.andro.a_palette.item.ModBoatItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(APalette.MOD_ID);

    public static final DeferredItem<Item> WHITE_STAINED_WOODEN_SIGN = ITEMS.register("white_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WHITE_STAINED_WOODEN_SIGN.get(), ModBlocks.WHITE_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> LIGHT_GRAY_STAINED_WOODEN_SIGN = ITEMS.register("light_gray_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_SIGN.get(), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> GRAY_STAINED_WOODEN_SIGN = ITEMS.register("gray_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRAY_STAINED_WOODEN_SIGN.get(), ModBlocks.GRAY_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> BLACK_STAINED_WOODEN_SIGN = ITEMS.register("black_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLACK_STAINED_WOODEN_SIGN.get(), ModBlocks.BLACK_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> BROWN_STAINED_WOODEN_SIGN = ITEMS.register("brown_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BROWN_STAINED_WOODEN_SIGN.get(), ModBlocks.BROWN_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> RED_STAINED_WOODEN_SIGN = ITEMS.register("red_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.RED_STAINED_WOODEN_SIGN.get(), ModBlocks.RED_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> ORANGE_STAINED_WOODEN_SIGN = ITEMS.register("orange_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ORANGE_STAINED_WOODEN_SIGN.get(), ModBlocks.ORANGE_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> YELLOW_STAINED_WOODEN_SIGN = ITEMS.register("yellow_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YELLOW_STAINED_WOODEN_SIGN.get(), ModBlocks.YELLOW_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> LIME_STAINED_WOODEN_SIGN = ITEMS.register("lime_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIME_STAINED_WOODEN_SIGN.get(), ModBlocks.LIME_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> GREEN_STAINED_WOODEN_SIGN = ITEMS.register("green_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREEN_STAINED_WOODEN_SIGN.get(), ModBlocks.GREEN_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> CYAN_STAINED_WOODEN_SIGN = ITEMS.register("cyan_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CYAN_STAINED_WOODEN_SIGN.get(), ModBlocks.CYAN_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> LIGHT_BLUE_STAINED_WOODEN_SIGN = ITEMS.register("light_blue_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_SIGN.get(), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> BLUE_STAINED_WOODEN_SIGN = ITEMS.register("blue_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLUE_STAINED_WOODEN_SIGN.get(), ModBlocks.BLUE_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> PURPLE_STAINED_WOODEN_SIGN = ITEMS.register("purple_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_STAINED_WOODEN_SIGN.get(), ModBlocks.PURPLE_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> MAGENTA_STAINED_WOODEN_SIGN = ITEMS.register("magenta_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAGENTA_STAINED_WOODEN_SIGN.get(), ModBlocks.MAGENTA_STAINED_WOODEN_WALL_SIGN.get()));
    public static final DeferredItem<Item> PINK_STAINED_WOODEN_SIGN = ITEMS.register("pink_stained_wooden_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINK_STAINED_WOODEN_SIGN.get(), ModBlocks.PINK_STAINED_WOODEN_WALL_SIGN.get()));

    public static final DeferredItem<Item> WHITE_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("white_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WHITE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.WHITE_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("light_gray_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> GRAY_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("gray_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRAY_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GRAY_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> BLACK_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("black_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLACK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLACK_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> BROWN_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("brown_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BROWN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BROWN_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> RED_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("red_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.RED_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.RED_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> ORANGE_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("orange_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ORANGE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.ORANGE_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> YELLOW_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("yellow_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YELLOW_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.YELLOW_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> LIME_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("lime_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIME_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIME_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> GREEN_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("green_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREEN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.GREEN_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> CYAN_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("cyan_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CYAN_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.CYAN_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("light_blue_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> BLUE_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("blue_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLUE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.BLUE_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> PURPLE_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("purple_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PURPLE_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> MAGENTA_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("magenta_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAGENTA_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.MAGENTA_STAINED_WOODEN_WALL_HANGING_SIGN.get()));
    public static final DeferredItem<Item> PINK_STAINED_WOODEN_HANGING_SIGN = ITEMS.register("pink_stained_wooden_hanging_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINK_STAINED_WOODEN_HANGING_SIGN.get(), ModBlocks.PINK_STAINED_WOODEN_WALL_HANGING_SIGN.get()));


    public static final DeferredItem<Item> WHITE_STAINED_WOODEN_BOAT = ITEMS.register("white_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.WHITE, new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_GRAY_STAINED_WOODEN_BOAT = ITEMS.register("light_gray_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.LIGHT_GRAY, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_STAINED_WOODEN_BOAT = ITEMS.register("gray_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GRAY, new Item.Properties()));
    public static final DeferredItem<Item> BLACK_STAINED_WOODEN_BOAT = ITEMS.register("black_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.BLACK, new Item.Properties()));
    public static final DeferredItem<Item> BROWN_STAINED_WOODEN_BOAT = ITEMS.register("brown_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.BROWN, new Item.Properties()));
    public static final DeferredItem<Item> RED_STAINED_WOODEN_BOAT = ITEMS.register("red_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.RED, new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_STAINED_WOODEN_BOAT = ITEMS.register("orange_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.ORANGE, new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_STAINED_WOODEN_BOAT = ITEMS.register("yellow_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.YELLOW, new Item.Properties()));
    public static final DeferredItem<Item> LIME_STAINED_WOODEN_BOAT = ITEMS.register("lime_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.LIME, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_STAINED_WOODEN_BOAT = ITEMS.register("green_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GREEN, new Item.Properties()));
    public static final DeferredItem<Item> CYAN_STAINED_WOODEN_BOAT = ITEMS.register("cyan_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CYAN, new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_BLUE_STAINED_WOODEN_BOAT = ITEMS.register("light_blue_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.LIGHT_BLUE, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_STAINED_WOODEN_BOAT = ITEMS.register("blue_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.BLUE, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_STAINED_WOODEN_BOAT = ITEMS.register("purple_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PURPLE, new Item.Properties()));
    public static final DeferredItem<Item> MAGENTA_STAINED_WOODEN_BOAT = ITEMS.register("magenta_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.MAGENTA, new Item.Properties()));
    public static final DeferredItem<Item> PINK_STAINED_WOODEN_BOAT = ITEMS.register("pink_stained_wooden_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PINK, new Item.Properties()));

    public static final DeferredItem<Item> WHITE_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("white_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.WHITE, new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_GRAY_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("light_gray_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.LIGHT_GRAY, new Item.Properties()));
    public static final DeferredItem<Item> GRAY_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("gray_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GRAY, new Item.Properties()));
    public static final DeferredItem<Item> BLACK_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("black_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.BLACK, new Item.Properties()));
    public static final DeferredItem<Item> BROWN_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("brown_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.BROWN, new Item.Properties()));
    public static final DeferredItem<Item> RED_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("red_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.RED, new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("orange_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.ORANGE, new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("yellow_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.YELLOW, new Item.Properties()));
    public static final DeferredItem<Item> LIME_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("lime_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.LIME, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("green_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GREEN, new Item.Properties()));
    public static final DeferredItem<Item> CYAN_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("cyan_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CYAN, new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_BLUE_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("light_blue_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.LIGHT_BLUE, new Item.Properties()));
    public static final DeferredItem<Item> BLUE_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("blue_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.BLUE, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("purple_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PURPLE, new Item.Properties()));
    public static final DeferredItem<Item> MAGENTA_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("magenta_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.MAGENTA, new Item.Properties()));
    public static final DeferredItem<Item> PINK_STAINED_WOODEN_CHEST_BOAT = ITEMS.register("pink_stained_wooden_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PINK, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
