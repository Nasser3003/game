package com.game.logic;

import com.game.characters.AbstractCharacter;
import com.game.characters.CharacterMage;
import com.game.scenarios.AbstractScenarios;
import com.game.scenarios.strategy.SceneStrategy;
import com.game.utils.PrintDashes;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;
@Data
@AllArgsConstructor
public class SceneExecutor {
    private SceneStrategy strategy;
    private AbstractScenarios scenario;
    private AbstractCharacter character;

    public void execute() {
        int userChoice = 0;
        System.out.println(scenario.getScenarioDescription());
        PrintDashes.print50Dashes();

        scenario.setOptionsToChooseFrom(strategy.mageStrategy());
        scenario.getOptionsToChooseFrom().forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice (1-6): ");

            if (scanner.hasNextInt()) userChoice = scanner.nextInt();
            if (userChoice == 4) System.out.println(character);
//            if (userChoice == 5); // TODO SAVE
            if (userChoice == 6) return ; // TODO EXIT

            if (userChoice > 0 && userChoice < 4)
                break;
            else scanner.nextLine();
        }
        scanner.close();
        pointsAdjuster(userChoice);


    }

    private void pointsAdjuster(int userChoice) {
        int[][] points = strategy.warriorStrategyPoints();
        if (character instanceof CharacterMage) points = strategy.mageStrategyPoints();

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
                break;
            case 2:
                character.setStrength(currStrength + points[1][0]);
                character.setMagic(currMagic + points[1][1]);
                character.setWisdom(currWisdom + points[1][2]);
                character.setHealthPoints(currHP + points[1][3]);
                break;
            case 3:
                character.setStrength(currStrength + points[2][0]);
                character.setMagic(currMagic + points[2][1]);
                character.setWisdom(currWisdom + points[2][2]);
                character.setHealthPoints(currHP + points[2][3]);
        }

        character.setExpLevel(character.getExpLevel() + 10);

        if (character.getHealthPoints() < 1)
            System.out.println("You Died!");
    }
}
