package top.andro.a_palette;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.slf4j.Logger;
import top.andro.a_palette.entity.ModModelLayers;
import top.andro.a_palette.init.ModBlockEntities;
import top.andro.a_palette.init.ModBlocks;
import top.andro.a_palette.init.ModCreativeModeTabs;
import top.andro.a_palette.init.ModItems;

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

    @OnlyIn(Dist.CLIENT)

    public void registerBER(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @OnlyIn(Dist.CLIENT)
    public void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.WHITE_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIGHT_GRAY_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.GRAY_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BLACK_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BROWN_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.RED_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.ORANGE_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.YELLOW_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIME_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.GREEN_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.CYAN_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIGHT_BLUE_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BLUE_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.PURPLE_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.MAGENTA_STAINED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.PINK_STAINED_BOAT_LAYER, BoatModel::createBodyModel);

        event.registerLayerDefinition(ModModelLayers.WHITE_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIGHT_GRAY_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.GRAY_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BLACK_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BROWN_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.RED_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.ORANGE_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.YELLOW_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIME_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.GREEN_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.CYAN_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.LIGHT_BLUE_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.BLUE_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.PURPLE_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.MAGENTA_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.PINK_STAINED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
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

            List<ItemLike> translucentBlocks = List.of(
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
                    ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE,

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

            for (ItemLike block : translucentBlocks) {
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

                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_MODERN_GLASS.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_MODERN_GLASS_PANE.get(), RenderType.translucent());

            }
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
