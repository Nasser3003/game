package com.game.scenarios;

import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractScenarios {
    private String scenarioDescription;
    private int gainedPointsAfterPass;
    private int minPointsToPass;
    private List<String> optionsToChooseFrom;
}
