package com.game.world.scenarios.forest.spring;

import com.game.world.scenarios.AbstractScene;

import java.util.ArrayList;
import java.util.List;

public class SceneEnchantedSpring extends AbstractScene {
    public SceneEnchantedSpring(long id) {
        super(id);
        this.setScenarioDescription("Choosing to meditate at the crossroads," +
                " you close your eyes and connect with the forest's energy." +
                " Intuition leads you to the right path—the Whispering Woods." +
                " As you traverse, you discover an enchanted spring, gaining profound wisdom." +
                " In a moonlit clearing, you meet the guardian of the forest, becoming its chosen protector." +
                " Your quest begins to preserve the mystical realm," +
                " your journey intertwined with the secrets of the ancient woods.");

        List<String> commonOptions = new ArrayList<>();
        commonOptions.add("1) Explore the Forbidden Cave");
        commonOptions.add("2) Swim the Eerie Lake");
        commonOptions.add("3) Follow by distant whispers");

        setOptionsToChooseWarrior(commonOptions);
        setOptionsToChooseMage(commonOptions);

        this.setPointsArrayWarrior(new int[][] { {-22, 18, -45, 37}, {32, -8, 13, -19}, {-38, 27, 7, 41} });
        this.setPointsArrayMage(new int[][] { {-17, 7, -33, 29}, {23, -28, 11, 24}, {-3, 14, -18, 2} });
    }

}
