package com.game.scenarios;

import java.util.ArrayList;
import java.util.List;

public class ScenarioUndergroundCavern extends AbstractScenarios {

    public ScenarioUndergroundCavern() {
        this.setScenarioDescription("Choosing \"Echo\" triggers a hidden chasm, plunging you into an underground cavern." +
                " Phosphorescent fungi light the rocky walls as mysterious creatures lurk. The path ahead is uncertain," +
                " and danger echoes in the darkness.");

        List<String> warriorOptions = new ArrayList<>();
        warriorOptions.add("1) Examine the phosphorescent fungi closely to see if they hold any clues or properties.");
        warriorOptions.add("2) Listen closely to the echoes in the cavern to discern any patterns or clues about the environment.");
        warriorOptions.add("3) Draw your sword and advance stealthily, staying alert for any signs of danger.");

        List<String> mageOptions = new ArrayList<>();
        mageOptions.add("1) Examine the phosphorescent fungi closely to see if they hold any clues or properties.");
        mageOptions.add("2) Listen closely to the echoes in the cavern to discern any patterns or clues about the environment.");
        mageOptions.add("3) Illuminate the surroundings with a light spell and assess the cavern for potential threats.");

        this.setOptionsToChooseWarrior(warriorOptions);
        this.setOptionsToChooseMage(mageOptions);

        this.setPointsArrayWarrior(new int[][] { {20, 0, 0, -50}, {15, 0, 5, -40}, {0, 0, 10, 30} });
        this.setPointsArrayMage(new int[][] { {0, 20, 0, -50}, {0, 15, 5, -40}, {0, 0, 10, 30} });
    }
}