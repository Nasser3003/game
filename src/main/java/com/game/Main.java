package com.game;

import com.game.characters.AbstractCharacter;
import com.game.characters.CharacterMage;
import com.game.logic.SceneExecutor;
import com.game.scenarios.ScenarioTheEnchantedForest;
import com.game.strategy.CharacterStrategy;
import com.game.strategy.StrategyTheEnchantedForest;

public class Main {

	public static void main(String[] args) {

		CharacterStrategy characterStrategy = new StrategyTheEnchantedForest();
		ScenarioTheEnchantedForest mageScenario = new ScenarioTheEnchantedForest();
		AbstractCharacter mageNasser = new CharacterMage("Nasser");

		SceneExecutor executor = new SceneExecutor(characterStrategy, mageScenario, mageNasser);
		executor.execute();

	}
}
