package com.game.scenarios;

import java.util.ArrayList;
import java.util.List;

public class ScenarioEldertreeGuardian extends AbstractScenarios {
    public ScenarioEldertreeGuardian() {
        this.setScenarioDescription("You unsheathe your sword, charging through the dense vegetation. Suddenly," +
                " you confront the Eldertree Guardian, a wise, ancient tree." +
                " It challenges you with the Riddles of the Whispering Leaves." +
                " The path transforms into floating platforms with glowing leaves bearing riddles.\n" +
                "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");

        List<String> commonOptions = new ArrayList<>();
        commonOptions.add("1) Music");
        commonOptions.add("2) Echo");
        commonOptions.add("3) Shadow");


        this.setOptionsToChooseWarrior(commonOptions);
        this.setOptionsToChooseMage(commonOptions);

        this.setPointsArrayWarrior(new int[][] { {0, 0, -10, -30}, {0, 0, 15, -10}, {0, 0, -20, -40} });
        this.setPointsArrayMage(new int[][] { {0, 0, -10, -30}, {0, 0, 15, -10}, {0, 0, -20, -40} });
    }
}
