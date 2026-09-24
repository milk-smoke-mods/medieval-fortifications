package io.github.milk_smoke_mods.medieval_fortifications.collections;

import io.github.milk_smoke_mods.medieval_fortifications.block.EmbrasureBlock;
import io.github.milk_smoke_mods.medieval_fortifications.registry.ModBlocks;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;

public record BlockLists() {
    public static List<DeferredBlock<EmbrasureBlock>> EMBRASURE_BLOCKS = List.of(
            ModBlocks.COBBLESTONE_EMBRASURE,
            ModBlocks.STONE_BRICK_EMBRASURE,
            ModBlocks.MOSSY_COBBLESTONE_EMBRASURE,
            ModBlocks.COBBLED_DEEPSLATE_EMBRASURE,
            ModBlocks.DEEPSLATE_BRICK_EMBRASURE,
            ModBlocks.TUFF_BRICK_EMBRASURE
    );
}
