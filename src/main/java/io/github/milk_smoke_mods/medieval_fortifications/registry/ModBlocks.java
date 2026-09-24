package io.github.milk_smoke_mods.medieval_fortifications.registry;

import io.github.milk_smoke_mods.medieval_fortifications.MedievalFortifications;
import io.github.milk_smoke_mods.medieval_fortifications.block.EmbrasureBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MedievalFortifications.MODID);

    public static final DeferredBlock<EmbrasureBlock> COBBLESTONE_EMBRASURE =
            BLOCKS.registerBlock(
                    "cobblestone_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .strength(2.0F, 6.0F)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    public static final DeferredBlock<EmbrasureBlock> MOSSY_COBBLESTONE_EMBRASURE =
            BLOCKS.registerBlock(
                    "mossy_cobblestone_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .strength(2.0F, 6.0F)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    public static final DeferredBlock<EmbrasureBlock> STONE_BRICK_EMBRASURE =
            BLOCKS.registerBlock(
                    "stone_brick_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .strength(1.5F, 6.0F)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    public static final DeferredBlock<EmbrasureBlock> COBBLED_DEEPSLATE_EMBRASURE =
            BLOCKS.registerBlock(
                    "cobbled_deepslate_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .strength(3.5F, 6.0F)
                            .sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    public static final DeferredBlock<EmbrasureBlock> DEEPSLATE_BRICK_EMBRASURE =
            BLOCKS.registerBlock(
                    "deepslate_brick_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .strength(3.5F, 6.0F)
                            .sound(SoundType.DEEPSLATE_BRICKS)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    public static final DeferredBlock<EmbrasureBlock> TUFF_BRICK_EMBRASURE =
            BLOCKS.registerBlock(
                    "tuff_brick_embrasure",
                    EmbrasureBlock::new,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .strength(1.5F, 6.0F)
                            .sound(SoundType.TUFF_BRICKS)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            );

    /**
     * Only ran once. Acts as a constructor for EMBRASURE_BLOCKS.
     * @return A HashMap of every embrasure block to be stored in the constant EMBRASURE_BLOCKS
     */
    private static HashMap<String, DeferredBlock<EmbrasureBlock>> embrasureBlocks(){
        HashMap<String, DeferredBlock<EmbrasureBlock>> embrasureBlocks = new HashMap<>();
        embrasureBlocks.put("cobblestone_embrasure", COBBLESTONE_EMBRASURE);
        embrasureBlocks.put("mossy_cobblestone_embrasure", MOSSY_COBBLESTONE_EMBRASURE);
        embrasureBlocks.put("stone_brick_embrasure", STONE_BRICK_EMBRASURE);
        embrasureBlocks.put("cobbled_deepslate_embrasure", COBBLED_DEEPSLATE_EMBRASURE);
        embrasureBlocks.put("deepslate_brick_embrasure", DEEPSLATE_BRICK_EMBRASURE);
        embrasureBlocks.put("tuff_brick_embrasure", TUFF_BRICK_EMBRASURE);
        return embrasureBlocks;
    }

    public static final Map<String, DeferredBlock<EmbrasureBlock>> EMBRASURE_BLOCKS = Map.copyOf(embrasureBlocks());

    private ModBlocks() {
    }
}
