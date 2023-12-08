package com.game.engine;

import com.game.characters.AbstractCharacter;
import com.game.utils.PrintDashes;
import com.game.world.World;
import com.game.world.scenarios.AbstractScene;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
@Data
@AllArgsConstructor
public class GameEngine {
    private World world;
    private AbstractCharacter character;
    private boolean isMageCharacter;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        // printing the scene
        System.out.println(world.getCurrScene().getScenarioDescription());
        PrintDashes.print50Dashes();

        // options for the character
        List<String> options = world.getCurrScene().getOptionsToChooseWarrior();
        if (isMageCharacter)
            options = world.getCurrScene().getOptionsToChooseMage();

        // return recursion
        if (options == null) {
            scanner.close();
            return;
        }

        // print character choices and then static choices
        options.forEach(System.out::println);
        AbstractScene.choicesFourFiveSix().forEach(System.out::println);

        while (true) {
            System.out.print("Enter your choice (1-8): ");

            if (scanner.hasNextInt()) userChoice = scanner.nextInt();
//            if (userChoice == 5) restoreProgress("save", character);   //saveProgress(character); // TODO    SAVE
            if (userChoice == 6) {
                saveProgress("Character", character);
                saveProgress("Map", world.getCurrScene());
            }
            if (userChoice == 7) System.out.println(character);
            if (userChoice == 8) return;

            if (userChoice > 0 && userChoice < 5)
                break;
            else scanner.nextLine();
        }
        pointsAdjuster(userChoice);

        play();
    }

    private void pointsAdjuster(int userChoice) {
        int[][] points = world.getCurrScene().getPointsArrayWarrior();

        if (isMageCharacter) points = world.getCurrScene().getPointsArrayMage();

        int currStrength = character.getStrength();
        int currMagic = character.getMagic();
        int currWisdom = character.getWisdom();
        int currHP = character.getHealthPoints();

        switch (userChoice) {
            case 1:
                character.setStrength(currStrength + points[0][0]);
                character.setMagic(currMagic + points[0][1]);
                character.setWisdom(currWisdom + points[0][2]);
                character.setHealthPoints(currHP + points[0][3]);
                world.setCurrScene(world.getCurrScene().getChildren().get(0));
                break;
            case 2:
                character.setStrength(currStrength + points[1][0]);
                character.setMagic(currMagic + points[1][1]);
                character.setWisdom(currWisdom + points[1][2]);
                character.setHealthPoints(currHP + points[1][3]);
                world.setCurrScene(world.getCurrScene().getChildren().get(1));
                break;
            case 3:
                character.setStrength(currStrength + points[2][0]);
                character.setMagic(currMagic + points[2][1]);
                character.setWisdom(currWisdom + points[2][2]);
                character.setHealthPoints(currHP + points[2][3]);
                world.setCurrScene(world.getCurrScene().getChildren().get(2));
        }

        character.setExpLevel(character.getExpLevel() + 10);
    }
    public static void saveProgress(String fileName, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("saves", fileName)))) {
            oos.writeObject(obj);
            System.out.println(fileName +" saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static <T> T restoreProgress(String fileName, Class<T> T) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("saves", fileName)))) {
            return (T) (ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
