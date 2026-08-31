package io.github.milk_smoke_mods.medieval_fortifications;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(MedievalFortifications.MODID)
public class MedievalFortifications {
    public static final String MODID = "medieval_fortifications";

    public MedievalFortifications(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
