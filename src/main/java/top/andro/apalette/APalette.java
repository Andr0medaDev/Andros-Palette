package top.andro.apalette;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.slf4j.Logger;
import top.andro.apalette.init.ModBlocks;
import top.andro.apalette.init.ModCreativeModeTabs;
import top.andro.apalette.init.ModItems;

import java.util.List;


@Mod(APalette.MOD_ID)
public class APalette {
    public static final String MOD_ID = "a_palette";
    private static final Logger LOGGER = LogUtils.getLogger();

    public APalette(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlocks.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            List<DeferredBlock<Block>> translucentBlocks = List.of(
                    ModBlocks.CLEAR_GLASS,
                    ModBlocks.CLEAR_GLASS_PANE,
                    ModBlocks.WHITE_STAINED_CLEAR_GLASS,
                    ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS,
                    ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.GRAY_STAINED_CLEAR_GLASS,
                    ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.BLACK_STAINED_CLEAR_GLASS,
                    ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.BROWN_STAINED_CLEAR_GLASS,
                    ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.RED_STAINED_CLEAR_GLASS,
                    ModBlocks.RED_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.ORANGE_STAINED_CLEAR_GLASS,
                    ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.YELLOW_STAINED_CLEAR_GLASS,
                    ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.LIME_STAINED_CLEAR_GLASS,
                    ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.GREEN_STAINED_CLEAR_GLASS,
                    ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.CYAN_STAINED_CLEAR_GLASS,
                    ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS,
                    ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.BLUE_STAINED_CLEAR_GLASS,
                    ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.PURPLE_STAINED_CLEAR_GLASS,
                    ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.MAGENTA_STAINED_CLEAR_GLASS,
                    ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE,
                    ModBlocks.PINK_STAINED_CLEAR_GLASS,
                    ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE


            );

            for (DeferredBlock<Block> block : translucentBlocks) {
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_CLEAR_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(), RenderType.translucent());

            }
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
