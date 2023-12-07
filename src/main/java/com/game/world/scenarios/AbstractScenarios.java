package com.game.scenarios;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Generated;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    private long id;

    @Setter(AccessLevel.PROTECTED)
    private String scenarioDescription;

    @Setter(AccessLevel.PROTECTED)
    private List<String> optionsToChooseMage;

    @Setter(AccessLevel.PROTECTED)
    private List<String> optionsToChooseWarrior;

    @Setter(AccessLevel.PROTECTED)
    private int[][] pointsArrayMage;

    @Setter(AccessLevel.PROTECTED)
    private int[][] pointsArrayWarrior;

    @Setter(AccessLevel.NONE)
    private List<AbstractScenarios> children = new ArrayList<>();

    public void addChild(AbstractScenarios child) {
        children.add(child);
    }

}
