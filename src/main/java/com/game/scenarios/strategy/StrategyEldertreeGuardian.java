package com.game.scenarios.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyEldertreeGuardian implements SceneStrategy {
    private List<String> commonChoices() {
        List<String> options = new ArrayList<>();
        options.add("1) Music");
        options.add("2) Echo");
        options.add("3) Shadow");
        return options;
    }
    List<String> options = new ArrayList<>();

    @Override
    public List<String> warriorStrategy() {
        return commonChoices();
    }

    @Override
    public int[][] warriorStrategyPoints() {
        return new int[][] { {0, 0, -10, -30}, {0, 0, 15, -10}, {0, 0, -20, -40} };
    }

    @Override
    public List<String > mageStrategy() {
        return commonChoices();
    }

    @Override
    public int[][] mageStrategyPoints() {
        return new int[][] { {0, 0, -10, -30}, {0, 0, 15, -10}, {0, 0, -20, -40} };
    }

}
