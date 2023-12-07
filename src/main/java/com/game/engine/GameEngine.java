package com.game.engine;

import com.game.characters.AbstractCharacter;
import com.game.utils.PrintDashes;
import com.game.world.World;
import com.game.world.scenarios.AbstractScenarios;
import lombok.AllArgsConstructor;
import lombok.Data;

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
        AbstractScenarios.choicesFourFiveSix().forEach(System.out::println);

        while (true) {
            System.out.print("Enter your choice (1-6): ");

            if (scanner.hasNextInt()) userChoice = scanner.nextInt();
            if (userChoice == 4) System.out.println(character);
            if (userChoice == 5) return; // TODO    SAVE
            if (userChoice == 6) return; // TODO    EXIT

            if (userChoice > 0 && userChoice < 4)
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
}
