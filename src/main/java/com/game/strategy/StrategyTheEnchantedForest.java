package com.game.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyTheEnchantedForest implements SceneStrategy {
    @Override
    public List<String> warriorStrategy() {
        {
            List<String> options = new ArrayList<>();

            options.add("1) Make a path: Unsheathe your mighty sword and charge straight ahead" +
                    ", cutting through the dense vegetation." +
                    " Trust your instincts and confront whatever mystical creatures may lie in your path.");

            options.add("2) Follow the Whispering Breeze: Pay attention to the subtle cues in the air." +
                    " Listen to the rustling leaves and follow the direction of the gentle breeze." +
                    " Nature might guide you through the forest in a way that connects you with its mystical essence.");

            options.add("3) Meditate at the Crossroads: Sit down at the crossroads, close your eyes, and enter a meditative state." +
                    " Clear your mind and let the energy of the forest flow through you. When you open your eyes," +
                    " the path that resonates with your inner self may become apparent." +
                    " Trust your intuition to guide you on this mystical journey.");
            options.add("4) Save!.");
            options.add("5) Exit!.");
            return options;
        }
    }

    @Override
    public int[][] warriorStrategyPoints() {
        return new int[][] { {20, 0, 0, -50}, {15, 0, 5, -40}, {0, 0, 10, 30} };
    }

    @Override
    public List<String > mageStrategy() {
        List<String> options = new ArrayList<>();

        options.add("1) Dark Arcane Conduit: Embrace the dark side of magic and open a conduit to channel forbidden arcane energy." +
                " Blast through the vegetation, but beware of the consequences as this dark magic may attract malevolent creatures.");

        options.add("2) Follow the Whispering Breeze: Pay attention to the subtle cues in the air." +
                " Listen to the rustling leaves and follow the direction of the gentle breeze." +
                " Nature might guide you through the forest in a way that connects you with its mystical essence.");

        options.add("3) Runic Teleportation: Inscribe ancient runes on the ground and teleport to a seemingly safer location." +
                " Be cautious, as the teleportation may lead you to an unfamiliar part of the forest with its own set of challenges.");

        options.add("4) Save!.");
        options.add("5) Exit!.");
        return options;
    }

    @Override
    public int[][] mageStrategyPoints() {
        return new int[][] { {0, 20, 0, -50}, {0, 15, 5, -40}, {0, 0, 10, 30} };
    }

}
