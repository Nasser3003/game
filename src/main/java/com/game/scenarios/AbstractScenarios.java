package com.game.scenarios;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractScenarios {
    public static List<String> choicesFourFiveSix() {
        List<String> options = new ArrayList<>();
        options.add("4) Check your stats!.");
        options.add("5) Save!.");
        options.add("6) Exit!.");
        return options;
    }

    @Setter(AccessLevel.PROTECTED)
    protected String scenarioDescription;

    @Setter(AccessLevel.PROTECTED)
    protected List<String> optionsToChooseMage;

    @Setter(AccessLevel.PROTECTED)
    protected List<String> optionsToChooseWarrior;

    @Setter(AccessLevel.PROTECTED)
    protected int[][] pointsArrayMage;

    @Setter(AccessLevel.PROTECTED)
    protected int[][] pointsArrayWarrior;

}
