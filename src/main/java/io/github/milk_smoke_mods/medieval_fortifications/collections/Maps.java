package io.github.milk_smoke_mods.medieval_fortifications.collections;

import io.github.milk_smoke_mods.medieval_fortifications.block.EmbrasureBlock;
import io.github.milk_smoke_mods.medieval_fortifications.registry.ModBlocks;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public record Maps() {
    /**
     * Stores block families according to material
     */
    public static Map<MaterialFamilies, List<DeferredBlock<EmbrasureBlock>>> MATERIAL_FAMILIES =
            Collections.unmodifiableMap(new EnumMap<>(MaterialFamilies.class) {{
                    for(MaterialFamilies materialFamily : MaterialFamilies.values()) {
                        for (BlockTypes blockType : BlockTypes.values()) {

                        }
                        put(materialFamily, TYPE_FAMILIES.get(blockType).get(materialFamily));
                    }
            }});

    /**
     * Stores block families according to type
     */
    public static Map<BlockTypes, Map<MaterialFamilies, List<DeferredBlock<EmbrasureBlock>>>> TYPE_FAMILIES =
            Collections.unmodifiableMap(new EnumMap<>(BlockTypes.class) {{
                    put(BlockTypes.EMBRASURE, EMBRASURE_FAMILIES);
            }});


    public static Map<MaterialFamilies, List<DeferredBlock<EmbrasureBlock>>> EMBRASURE_FAMILIES =
            Collections.unmodifiableMap(new EnumMap<>(MaterialFamilies.class) {{
                    put(MaterialFamilies.STONE, STONE_EMBRASURES);
                    put(MaterialFamilies.MOSSY_STONE, MOSSY_STONE_EMBRASURES);
                    put(MaterialFamilies.DEEPSLATE, DEEPSLATE_EMBRASURES);
                    put(MaterialFamilies.TUFF, TUFF_EMBRASURES);
            }});

    public static List<DeferredBlock<EmbrasureBlock>> STONE_EMBRASURES = List.of(
            ModBlocks.COBBLESTONE_EMBRASURE,
            ModBlocks.STONE_BRICK_EMBRASURE
    );

    public static List<DeferredBlock<EmbrasureBlock>> MOSSY_STONE_EMBRASURES = List.of(
            ModBlocks.MOSSY_COBBLESTONE_EMBRASURE
            //ModBlocks.MOSSY_STONE_BRICK_EMBRASURE
    );

    public static List<DeferredBlock<EmbrasureBlock>> DEEPSLATE_EMBRASURES = List.of(
            ModBlocks.COBBLED_DEEPSLATE_EMBRASURE,
            ModBlocks.DEEPSLATE_BRICK_EMBRASURE
    );

    public static List<DeferredBlock<EmbrasureBlock>> TUFF_EMBRASURES = List.of(
            ModBlocks.TUFF_BRICK_EMBRASURE
    );
}
