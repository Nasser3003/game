package com.game.logic;
import com.game.characters.AbstractCharacter;
import com.game.scenarios.AbstractScenarios;
import com.game.strategy.CharacterStrategy;
import com.game.utils.PrintDashes;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Scanner;

@Data
@AllArgsConstructor
public class SceneExecutor {
    private CharacterStrategy strategy;
    private AbstractScenarios scenario;
    private AbstractCharacter character;
    public void execute() {

        scenario.setOptionsToChooseFrom(strategy.mageStrategy());

        System.out.println(scenario.getScenarioDescription());
        PrintDashes.print50Dashes();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose from the following");
            PrintDashes.print50Dashes();
            scenario.getOptionsToChooseFrom().forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
