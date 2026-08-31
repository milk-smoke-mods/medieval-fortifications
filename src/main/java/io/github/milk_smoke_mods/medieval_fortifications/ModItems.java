package io.github.milk_smoke_mods.medieval_fortifications;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MedievalFortifications.MODID);

    public static final DeferredItem<BlockItem> COBBLESTONE_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.COBBLESTONE_EMBRASURE);

    private ModItems() {
    }
}
