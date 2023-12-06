package com.game.scenarios.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyUndergroundCavern implements SceneStrategy {
    @Override
    public List<String> warriorStrategy() {
        List<String> options = new ArrayList<>();
        options.add("1) Examine the phosphorescent fungi closely to see if they hold any clues or properties.");
        options.add("2) Listen closely to the echoes in the cavern to discern any patterns or clues about the environment.");
        options.add("3) Draw your sword and advance stealthily, staying alert for any signs of danger.");
        return options;
    }

    @Override
    public int[][] warriorStrategyPoints() {
        return new int[][] { {20, 0, 0, -50}, {15, 0, 5, -40}, {0, 0, 10, 30} };
    }

    @Override
    public List<String > mageStrategy() {
        List<String> options = new ArrayList<>();
        options.add("1) Examine the phosphorescent fungi closely to see if they hold any clues or properties.");
        options.add("2) Listen closely to the echoes in the cavern to discern any patterns or clues about the environment.");
        options.add("3) Illuminate the surroundings with a light spell and assess the cavern for potential threats.");
        return options;
    }

    @Override
    public int[][] mageStrategyPoints() {
        return new int[][] { {0, 20, 0, -50}, {0, 15, 5, -40}, {0, 0, 10, 30} };
    }

}

