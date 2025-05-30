package top.andro.apalette;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import top.andro.apalette.init.ModBlocks;
import top.andro.apalette.init.ModCreativeModeTabs;
import top.andro.apalette.init.ModItems;

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
        LOGGER.info("Hello! Thank you for choosing to use Andro's Palette! Feel free to ask Questions or Suggest stuff! You can send them in the Discord Server, or DM me @_andromeda07 on Discord!");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

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
                    ModBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get()


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
