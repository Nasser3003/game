package com.game.strategy;

import java.util.List;

public interface SceneStrategy {
    List<String> warriorStrategy();
    int[][] warriorStrategyPoints();
    List<String > mageStrategy();
    public int[][] mageStrategyPoints();
}
