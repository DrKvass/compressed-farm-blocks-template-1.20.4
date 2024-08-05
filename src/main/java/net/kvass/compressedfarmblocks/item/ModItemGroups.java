package net.kvass.compressedfarmblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kvass.compressedfarmblocks.CompressedFarmBlocks;
import net.kvass.compressedfarmblocks.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CompressedFarmBlocks.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.compressed_farm_blocks"))
                    .icon(() -> new ItemStack(Items.WHEAT)).entries((displayContext, entries) -> {

                        //entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.CARROT_BLOCK);
                        entries.add(ModBlocks.ONE_COMPRESSED_CARROT_BLOCK);
                        entries.add(ModBlocks.TWO_COMPRESSED_CARROT_BLOCK);
                        entries.add(ModBlocks.THREE_COMPRESSED_CARROT_BLOCK);
                        entries.add(ModBlocks.FOUR_COMPRESSED_CARROT_BLOCK);
                        entries.add(ModBlocks.POTATO_BLOCK);
                        entries.add(ModBlocks.ONE_COMPRESSED_POTATO_BLOCK);
                        entries.add(ModBlocks.TWO_COMPRESSED_POTATO_BLOCK);
                        entries.add(ModBlocks.THREE_COMPRESSED_POTATO_BLOCK);
                        entries.add(ModBlocks.FOUR_COMPRESSED_POTATO_BLOCK);


                    }).build());

    public static void registerItemGroups() {
        CompressedFarmBlocks.LOGGER.info("Registering Item groups for " + CompressedFarmBlocks.MOD_ID);
    }

}
