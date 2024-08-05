package net.kvass.compressedfarmblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kvass.compressedfarmblocks.CompressedFarmBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CARROT_BLOCK = registerBlock("carrot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block ONE_COMPRESSED_CARROT_BLOCK = registerBlock("1x_compressed_carrot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TWO_COMPRESSED_CARROT_BLOCK = registerBlock("2x_compressed_carrot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block THREE_COMPRESSED_CARROT_BLOCK = registerBlock("3x_compressed_carrot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block FOUR_COMPRESSED_CARROT_BLOCK = registerBlock("4x_compressed_carrot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block ONE_COMPRESSED_POTATO_BLOCK = registerBlock("1x_compressed_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block TWO_COMPRESSED_POTATO_BLOCK = registerBlock("2x_compressed_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block THREE_COMPRESSED_POTATO_BLOCK = registerBlock("3x_compressed_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block FOUR_COMPRESSED_POTATO_BLOCK = registerBlock("4x_compressed_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, new Identifier(CompressedFarmBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CompressedFarmBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CompressedFarmBlocks.LOGGER.info("Registering ModBlocks for " + CompressedFarmBlocks.MOD_ID);
    }

}
