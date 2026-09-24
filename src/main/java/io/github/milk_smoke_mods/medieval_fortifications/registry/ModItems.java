package io.github.milk_smoke_mods.medieval_fortifications.registry;

import io.github.milk_smoke_mods.medieval_fortifications.MedievalFortifications;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MedievalFortifications.MODID);

    public static final DeferredItem<BlockItem> COBBLESTONE_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.COBBLESTONE_EMBRASURE);

    public static final DeferredItem<BlockItem> MOSSY_COBBLESTONE_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.MOSSY_COBBLESTONE_EMBRASURE);

    public static final DeferredItem<BlockItem> STONE_BRICK_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.STONE_BRICK_EMBRASURE);

    public static final DeferredItem<BlockItem> COBBLED_DEEPSLATE_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.COBBLED_DEEPSLATE_EMBRASURE);

    public static final DeferredItem<BlockItem> DEEPSLATE_BRICK_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.DEEPSLATE_BRICK_EMBRASURE);

    public static final DeferredItem<BlockItem> TUFF_BRICK_EMBRASURE =
            ITEMS.registerSimpleBlockItem(ModBlocks.TUFF_BRICK_EMBRASURE);

    private ModItems() {
    }
}
