package io.github.milk_smoke_mods.medieval_fortifications.collections;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public record BlockIDMaps() {
    public static Map<MaterialFamilies, List<String>> IDS_BY_MATERIAL =
            Collections.unmodifiableMap(new EnumMap<>(MaterialFamilies.class){{
                    put(MaterialFamilies.STONE, STONE_IDS);
                    put(MaterialFamilies.MOSSY_STONE, MOSSY_STONE_IDS);
                    put(MaterialFamilies.DEEPSLATE, DEEPSLATE_IDS);
                    put(MaterialFamilies.TUFF, TUFF_IDS);
            }});

    public static List<String> STONE_IDS = List.of(
            "cobblestone_embrasure",
            "stone_brick_embrasure"
    );

    public static List<String> MOSSY_STONE_IDS = List.of(
            "mossy_cobblestone_embrasure"
    );

    public static List<String> DEEPSLATE_IDS = List.of(
            "cobbled_deepslate_embrasure",
            "deepslate_brick_embrasure"
    );

    public static List<String> TUFF_IDS = List.of(
            "tuff_brick_embrasure"
    );
}