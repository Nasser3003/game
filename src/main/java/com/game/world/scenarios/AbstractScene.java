package com.game.world.scenarios;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractScene implements Serializable {
    public static List<String> choicesFourFiveSix() {
        List<String> options = new ArrayList<>(4);
        options.add("4) Restore");
        options.add("5) Save");
        options.add("6) Check your stats");
        options.add("7) Exit");
        return options;
    }

    public AbstractScene(long id) {
        this.id = id;
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
    private List<AbstractScene> children = new ArrayList<>(3);

    public void addChild(AbstractScene child) {
        children.add(child);
    }

}
