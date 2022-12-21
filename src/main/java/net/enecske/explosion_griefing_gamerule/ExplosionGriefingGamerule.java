package net.enecske.explosion_griefing_gamerule;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplosionGriefingGamerule implements ModInitializer {
	public static final String MODID = "explosion_griefing_gamerule";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


	public static final GameRules.Key<GameRules.BooleanRule> EXPLOSION_GRIEFING =
			GameRuleRegistry.register("explosionGriefing", GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));

	@Override
	public void onInitialize() {
		LOGGER.info("ExplosionGriefingGamerule is loaded!");
	}
}
