package top.andro.a_palette;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import top.andro.a_palette.entity.ModBoatRenderer;
import top.andro.a_palette.init.*;
import top.andro.a_palette.util.ModWoodTypes;

import java.util.List;

@Mod(APalette.MOD_ID)
public class APalette {
    public static final String MOD_ID = "a_palette";
    private static final Logger LOGGER = LogUtils.getLogger();


    public APalette() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        //LOGGER.info("Hello! Thank you for choosing to use Andro's Palette! Feel free to ask Questions or Suggest stuff! You can send them in the Discord Server, or DM me @_andromeda07 on Discord!");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.WHITE);
            Sheets.addWoodType(ModWoodTypes.LIGHT_GRAY);
            Sheets.addWoodType(ModWoodTypes.GRAY);
            Sheets.addWoodType(ModWoodTypes.BLACK);
            Sheets.addWoodType(ModWoodTypes.BROWN);
            Sheets.addWoodType(ModWoodTypes.RED);
            Sheets.addWoodType(ModWoodTypes.ORANGE);
            Sheets.addWoodType(ModWoodTypes.YELLOW);
            Sheets.addWoodType(ModWoodTypes.LIME);
            Sheets.addWoodType(ModWoodTypes.GREEN);
            Sheets.addWoodType(ModWoodTypes.CYAN);
            Sheets.addWoodType(ModWoodTypes.LIGHT_BLUE);
            Sheets.addWoodType(ModWoodTypes.BLUE);
            Sheets.addWoodType(ModWoodTypes.PURPLE);
            Sheets.addWoodType(ModWoodTypes.MAGENTA);
            Sheets.addWoodType(ModWoodTypes.PINK);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            List<Block> translucentBlocks = List.of(
                    ModBlocks.CLEAR_GLASS.get(),
                    ModBlocks.CLEAR_GLASS_PANE.get(),
                    ModBlocks.WHITE_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.GRAY_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.BLACK_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.BROWN_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.RED_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.ORANGE_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.YELLOW_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.LIME_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.GREEN_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.CYAN_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.BLUE_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.PURPLE_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.MAGENTA_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(),
                    ModBlocks.PINK_STAINED_CLEAR_GLASS.get(),
                    ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(),

                    ModBlocks.MODERN_GLASS.get(),
                    ModBlocks.MODERN_GLASS_PANE.get(),
                    ModBlocks.WHITE_STAINED_MODERN_GLASS.get(),
                    ModBlocks.WHITE_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS.get(),
                    ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.GRAY_STAINED_MODERN_GLASS.get(),
                    ModBlocks.GRAY_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.BLACK_STAINED_MODERN_GLASS.get(),
                    ModBlocks.BLACK_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.BROWN_STAINED_MODERN_GLASS.get(),
                    ModBlocks.BROWN_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.RED_STAINED_MODERN_GLASS.get(),
                    ModBlocks.RED_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.ORANGE_STAINED_MODERN_GLASS.get(),
                    ModBlocks.ORANGE_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.YELLOW_STAINED_MODERN_GLASS.get(),
                    ModBlocks.YELLOW_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.LIME_STAINED_MODERN_GLASS.get(),
                    ModBlocks.LIME_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.GREEN_STAINED_MODERN_GLASS.get(),
                    ModBlocks.GREEN_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.CYAN_STAINED_MODERN_GLASS.get(),
                    ModBlocks.CYAN_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS.get(),
                    ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.BLUE_STAINED_MODERN_GLASS.get(),
                    ModBlocks.BLUE_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.PURPLE_STAINED_MODERN_GLASS.get(),
                    ModBlocks.PURPLE_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.MAGENTA_STAINED_MODERN_GLASS.get(),
                    ModBlocks.MAGENTA_STAINED_MODERN_GLASS_PANE.get(),
                    ModBlocks.PINK_STAINED_MODERN_GLASS.get(),
                    ModBlocks.PINK_STAINED_MODERN_GLASS_PANE.get()


            );

            for (Block block : translucentBlocks) {
                ItemBlockRenderTypes.setRenderLayer(block, RenderType.translucent());
            }
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
