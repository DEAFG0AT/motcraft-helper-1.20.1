package com.mot.motcrafthelper;

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import io.github.uhq_games.regions_unexplored.RegionsUnexplored;
import io.github.uhq_games.regions_unexplored.data.worldgen.biome.RuBiomes;
import io.github.uhq_games.regions_unexplored.mixin.access.BiomeSourceAccess;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.loader.api.metadata.ModDependency;
import net.hibiscus.naturespirit.NatureSpirit;
import net.hibiscus.naturespirit.registration.NSBiomes;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MOTCRAFTHELPER implements ModInitializer {
	// Defines MOD ID.
	public static final String MOD_ID = "motcraft-helper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");




		// Switching modded and vanilla biomes.
		BiomePlacement.replaceOverworld(BiomeKeys.MEADOW, NSBiomes.HEATHER_FIELDS);
		BiomePlacement.replaceOverworld(RuBiomes.MAUVE_HILLS, BiomeKeys.FLOWER_FOREST);

		// Replaces Regions Unexplored biomes with Nature's Spirit biomes.
		BiomePlacement.replaceOverworld(RuBiomes.SILVER_BIRCH_FOREST, NSBiomes.ASPEN_FOREST);
		BiomePlacement.replaceOverworld(RuBiomes.FROZEN_TUNDRA, NSBiomes.TUNDRA);
		BiomePlacement.replaceOverworld(RuBiomes.ROCKY_MEADOW, NSBiomes.LAVENDER_FIELDS);
		BiomePlacement.replaceOverworld(RuBiomes.MARSH, NSBiomes.WISTERIA_FOREST);
		BiomePlacement.replaceOverworld(RuBiomes.CHALK_CLIFFS, NSBiomes.WHITE_CLIFFS);
		BiomePlacement.replaceOverworld(RuBiomes.AUTUMNAL_MAPLE_FOREST, NSBiomes.MAPLE_WOODLANDS);
		BiomePlacement.replaceOverworld(RuBiomes.REDWOODS, NSBiomes.REDWOOD_FOREST, 0.5d);
		BiomePlacement.replaceOverworld(RuBiomes.FLOWER_FIELDS, NSBiomes.FLOWERING_SHRUBLAND);
		BiomePlacement.replaceOverworld(RuBiomes.COLD_BOREAL_TAIGA, NSBiomes.SNOWCAPPED_RED_PEAKS);

		// Replaces Nature's Spirit biomes with Regions Unexplored biomes.
		BiomePlacement.replaceOverworld(NSBiomes.PRAIRIE, RuBiomes.BARLEY_FIELDS);

		// Replacements within mods.
		BiomePlacement.replaceOverworld(RuBiomes.HIGHLAND_FIELDS, RuBiomes.CLOVER_PLAINS);
		BiomePlacement.replaceOverworld(RuBiomes.ALPHA_GROVE, RuBiomes.TROPICS);
		BiomePlacement.replaceOverworld(RuBiomes.MAPLE_FOREST, RuBiomes.DECIDUOUS_FOREST, 0.5d);
		BiomePlacement.replaceOverworld(NSBiomes.LAVENDER_FIELDS, NSBiomes.CARNATION_FIELDS, 0.5d);
		BiomePlacement.replaceOverworld(RuBiomes.FROZEN_PINE_TAIGA, RuBiomes.SPIRES);

	}
}