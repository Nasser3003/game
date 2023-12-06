package com.game;

import com.game.characters.CharacterMage;
import com.game.logic.SceneExecutor;
import com.game.scenarios.ScenarioTheEnchantedForest;
import com.game.scenarios.strategy.SceneStrategy;
import com.game.scenarios.strategy.StrategyTheEnchantedForest;

public class Main {

	public static void main(String[] args) {

		SceneStrategy sceneStrategy = new StrategyTheEnchantedForest();
		ScenarioTheEnchantedForest mageScenario = new ScenarioTheEnchantedForest();
		CharacterMage mageNasser = new CharacterMage("Nasser");

		SceneExecutor executor = new SceneExecutor(sceneStrategy, mageScenario, mageNasser);
		executor.execute();

	}
}
