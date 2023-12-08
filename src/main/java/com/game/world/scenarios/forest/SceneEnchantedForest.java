package com.game.world.scenarios.forest;

import com.game.world.scenarios.AbstractScene;

import java.util.ArrayList;
import java.util.List;

public class SceneEnchantedForest extends AbstractScene {
    public SceneEnchantedForest(long id) {
        super(id);
        this.setScenarioDescription("Amidst the towering trees and glowing mushrooms," +
                " you stand in a dense, mystical forest, enveloped by an ethereal aura." +
                " The very air seems to pulse with otherworldly energy," +
                " as if the heart of nature itself beats in harmony with the surroundings." +
                " The path ahead offers a crucial decision, splitting into two intriguing directions," +
                " each shrouded in mystery and potential peril.");

        List<String> mageOptions = new ArrayList<>();
        mageOptions.add("1) Make a path:" +
                " Embrace the dark s ide of magic and open a conduit to channel forbidden arcane energy." +
                " Blast through the vegetation," +
                " but beware of the consequences as this dark magic may attract malevolent creatures.");

        mageOptions.add("2) Follow the Whispering Breeze: Pay attention to the subtle cues in the air." +
                " Listen to the rustling leaves and follow the direction of the gentle breeze." +
                " Nature might guide you through the forest in a way that connects you with its mystical essence.");

        mageOptions.add("3) Meditate at the Crossroads: Sit down at the crossroads," +
                " close your eyes, and enter a meditative state." +
                " Clear your mind and let the energy of the forest flow through you. When you open your eyes," +
                " the path that resonates with your inner self may become apparent." +
                " Trust your intuition to guide you on this mystical journey.");

        List<String> warriorOptions = new ArrayList<>();
        warriorOptions.add("1) Make a path: fire a ball of fire unleashing your mighty magical prowess" +
                ", cutting through the dense vegetation." +
                " Trust your instincts and confront whatever mystical creatures may lie in your path.");

        warriorOptions.add("2) Follow the Whispering Breeze: Pay attention to the subtle cues in the air." +
                " Listen to the rustling leaves and follow the direction of the gentle breeze." +
                " Nature might guide you through the forest in a way that connects you with its mystical essence.");

        warriorOptions.add("3) Meditate at the Crossroads: Sit down at the crossroads," +
                " close your eyes, and enter a meditative state." +
                " Clear your mind and let the energy of the forest flow through you. When you open your eyes," +
                " the path that resonates with your inner self may become apparent." +
                " Trust your intuition to guide you on this mystical journey.");

        this.setOptionsToChooseWarrior(warriorOptions);
        this.setOptionsToChooseMage(mageOptions);

        this.setPointsArrayWarrior(new int[][] { {20, 0, 0, -50}, {15, 0, 5, -40}, {0, 0, 10, 30} });
        this.setPointsArrayMage(new int[][] { {0, 20, 0, -50}, {0, 15, 5, -40}, {0, 0, 10, 30} });
    }

}
