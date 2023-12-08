package com.game;

import com.game.characters.CharacterMage;
import com.game.engine.GameEngine;
import com.game.world.scenarios.AbstractScene;
import com.game.world.scenarios.forest.SceneEnchantedForest;
import com.game.world.scenarios.forest.breeze.SceneWhisperingBreeze;
import com.game.world.scenarios.forest.breeze.deaths.SceneDeathByBreeze;
import com.game.world.scenarios.forest.breeze.deaths.SceneDeathByClimbing;
import com.game.world.scenarios.forest.breeze.deaths.SceneDeathByInvestigating;
import com.game.world.scenarios.forest.elder.SceneEldertreeGuardian;
import com.game.world.scenarios.forest.elder.deaths.SceneDeathByMusic;
import com.game.world.scenarios.forest.elder.deaths.SceneDeathByShadows;
import com.game.world.scenarios.forest.elder.undercavern.SceneUndergroundCavern;
import com.game.world.World;
import com.game.world.scenarios.forest.elder.undercavern.deaths.SceneDeathByExamineFungi;
import com.game.world.scenarios.forest.elder.undercavern.deaths.SceneDeathByListenToEcho;
import com.game.world.scenarios.forest.elder.undercavern.deaths.SceneDeathByMoving;
import com.game.world.scenarios.forest.spring.Deaths.SceneDeathByCuriosity;
import com.game.world.scenarios.forest.spring.Deaths.SceneDeathByHuntingGrove;
import com.game.world.scenarios.forest.spring.Deaths.SceneDeathBySwimming;
import com.game.world.scenarios.forest.spring.SceneEnchantedSpring;

public class Main {

	public static void main(String[] args) {
		// creating scenes
		AbstractScene sceneRoot = new SceneEnchantedForest(0); // parent

		AbstractScene sceneSpring = new SceneEnchantedSpring(1); // parent
		AbstractScene sceneDeathBySwimming = new SceneDeathBySwimming(2);
		AbstractScene sceneDeathByHuntingGrove = new SceneDeathByHuntingGrove(3);
		AbstractScene sceneDeathByCuriosity = new SceneDeathByCuriosity(4);

		AbstractScene sceneElder = new SceneEldertreeGuardian(5); // parent
		AbstractScene sceneDeathByMusic = new SceneDeathByMusic(6);
		AbstractScene sceneDeathByShadows = new SceneDeathByShadows(7);
		AbstractScene sceneUndergroundCavern = new SceneUndergroundCavern(8); // parent
		AbstractScene sceneDeathByListenToEcho = new SceneDeathByListenToEcho(9);
		AbstractScene sceneDeathByMoving = new SceneDeathByMoving(10);
		AbstractScene sceneDeathByExamineFungi = new SceneDeathByExamineFungi(11);

		AbstractScene sceneBreeze = new SceneWhisperingBreeze(12); // parent
		AbstractScene sceneDeathByBreeze = new SceneDeathByBreeze(13);
		AbstractScene sceneDeathByClimbing = new SceneDeathByClimbing(14);
		AbstractScene sceneDeathByInvestigating = new SceneDeathByInvestigating(15);

		// adding child scenes accessing child using [index]
		sceneRoot.addChild(sceneElder);
		sceneRoot.addChild(sceneBreeze);
		sceneRoot.addChild(sceneSpring);

		sceneSpring.addChild(sceneDeathByCuriosity);
		sceneSpring.addChild(sceneDeathBySwimming);
		sceneSpring.addChild(sceneDeathByHuntingGrove);

		sceneElder.addChild(sceneDeathByMusic);
		sceneElder.addChild(sceneUndergroundCavern);
		sceneElder.addChild(sceneDeathByShadows);
		sceneUndergroundCavern.addChild(sceneDeathByExamineFungi);
		sceneUndergroundCavern.addChild(sceneDeathByListenToEcho);
		sceneUndergroundCavern.addChild(sceneDeathByMoving);

		sceneBreeze.addChild(sceneDeathByBreeze);
		sceneBreeze.addChild(sceneDeathByInvestigating);
		sceneBreeze.addChild(sceneDeathByClimbing);

		// creating the world to access anywhere on the map if u want accessing map using KEY(id)
		World world = new World();
		world.addScene(sceneRoot);
		world.addScene(sceneSpring);
		world.addScene(sceneBreeze);
		world.addScene(sceneElder);
		world.addScene(sceneUndergroundCavern);

		// creating characters
		CharacterMage mageNasser = new CharacterMage("Mage Nasser");
		// CharacterWarrior warriorNasser = new CharacterWarrior("Warrior Nasser");

		// running the game
		GameEngine game = new GameEngine(world, mageNasser, true);
		game.play();

	}
}
