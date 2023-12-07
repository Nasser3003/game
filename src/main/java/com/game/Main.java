package com.game;

import com.game.characters.CharacterMage;
import com.game.engine.GameEngine;
import com.game.world.scenarios.AbstractScenarios;
import com.game.world.scenarios.forest.ScenarioTheEnchantedForest;
import com.game.world.scenarios.forest.elder.ScenarioEldertreeGuardian;
import com.game.world.scenarios.forest.elder.undercavern.ScenarioUndergroundCavern;
import com.game.world.World;
import com.game.world.scenarios.forest.elder.undercavern.deaths.ScenarioDeathByExamineFungi;
import com.game.world.scenarios.forest.elder.undercavern.deaths.ScenarioDeathByListenToEcho;
import com.game.world.scenarios.forest.elder.undercavern.deaths.ScenarioDeathByMoving;

public class Main {

	public static void main(String[] args) {

		// creating scenes
		AbstractScenarios sceneRoot = new ScenarioTheEnchantedForest(0);
		AbstractScenarios sceneElder = new ScenarioEldertreeGuardian(1);
		AbstractScenarios sceneUnderCavern = new ScenarioUndergroundCavern(2);
		AbstractScenarios sceneDeathByExamineFungi = new ScenarioDeathByExamineFungi(3);
		AbstractScenarios sceneDeathByListenToEcho = new ScenarioDeathByListenToEcho(4);
		AbstractScenarios sceneDeathByMoving = new ScenarioDeathByMoving(5);

		// adding child scenes accessing child using [index]
		sceneRoot.addChild(sceneElder);
		sceneElder.addChild(sceneUnderCavern);
		sceneUnderCavern.addChild(sceneDeathByExamineFungi);
		sceneUnderCavern.addChild(sceneDeathByListenToEcho);
		sceneUnderCavern.addChild(sceneDeathByMoving);

		// creating the world to access anywhere on the map if u want accessing map using KEY(id)
		World world = new World();
		world.addScene(sceneRoot);
		world.addScene(sceneElder);
		world.addScene(sceneUnderCavern);

		// creating characters
		CharacterMage mageNasser = new CharacterMage("Mage Nasser");
		// CharacterWarrior warriorNasser = new CharacterWarrior("Warrior Nasser");

		// running the game
		GameEngine game = new GameEngine(world, mageNasser, true);
		game.play();



	}
}
