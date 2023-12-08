package com.game.world.scenarios.forest.breeze;

import com.game.world.scenarios.AbstractScene;

import java.util.ArrayList;
import java.util.List;

public class SceneWhisperingBreeze extends AbstractScene {
    public SceneWhisperingBreeze(long id) {
        super(id);
        this.setScenarioDescription("As you venture deep into the enchanted forest," +
                " the Whispering Breeze becomes more pronounced." +
                " The air is filled with a mysterious energy that guides you through the dense foliage." +
                " You come across a fork in the path");

        List<String> commonOptions = new ArrayList<>();
        commonOptions.add("1) Follow the Whispering Breeze");
        commonOptions.add("2) Investigate the Fork");
        commonOptions.add("3) Climb a Tree for a Better View");

        this.setOptionsToChooseWarrior(commonOptions);
        this.setOptionsToChooseMage(commonOptions);

        this.setPointsArrayWarrior(new int[][] { {-30, -14, 49, 1}, {20, 43, -35, 11}, {6, -50, -19, 27} });
        this.setPointsArrayMage(new int[][] { {-48, -46, 29, 44}, {11, -45, 12, 37}, {13, -4, 3, 47} });

        }
}
