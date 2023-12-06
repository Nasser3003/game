package com.game.scenarios.strategy;

import java.util.ArrayList;
import java.util.List;

public interface SceneStrategy {
    List<String> warriorStrategy();
    int[][] warriorStrategyPoints();
    List<String > mageStrategy();
    public int[][] mageStrategyPoints();
    static List<String> choicesFourFiveSix() {
        List<String> options = new ArrayList<>();
        options.add("4) Check your stats!.");
        options.add("5) Save!.");
        options.add("6) Exit!.");
        return options;
    }
}
