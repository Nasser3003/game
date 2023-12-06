package com.game;

import com.game.characters.CharacterMage;
import com.game.engine.GameEngine;
import com.game.scenarios.ScenarioTheEnchantedForest;

public class Main {

	public static void main(String[] args) {

		ScenarioTheEnchantedForest mageScenario = new ScenarioTheEnchantedForest();
		CharacterMage mageNasser = new CharacterMage("Nasser");

		GameEngine engine = new GameEngine(mageScenario, mageNasser);
		engine.play();
		System.out.println(mageNasser);

	}
}
