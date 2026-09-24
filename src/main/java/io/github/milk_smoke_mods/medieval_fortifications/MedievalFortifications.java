package io.github.milk_smoke_mods.medieval_fortifications;

import io.github.milk_smoke_mods.medieval_fortifications.block.EmbrasureBlock;
import io.github.milk_smoke_mods.medieval_fortifications.registry.ModBlocks;
import io.github.milk_smoke_mods.medieval_fortifications.registry.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;

@Mod(MedievalFortifications.MODID)
public class MedievalFortifications {
    public static final String MODID = "medieval_fortifications";

    public MedievalFortifications(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreativeTabContents);
    }

    private void addCreativeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.BUILDING_BLOCKS)) {
            for(DeferredBlock<EmbrasureBlock> embrasureBlock : ModBlocks.EMBRASURE_BLOCKS){
                event.accept(embrasureBlock.get());
            }
        }
    }
}
