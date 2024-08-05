package net.kvass.compressedfarmblocks;

import net.fabricmc.api.ModInitializer;

import net.kvass.compressedfarmblocks.block.ModBlocks;
import net.kvass.compressedfarmblocks.item.ModItemGroups;
import net.kvass.compressedfarmblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressedFarmBlocks implements ModInitializer {
	public static final String MOD_ID = "compressedfarmblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}