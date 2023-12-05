package com.game.scenarios;

import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractScenarios {
    private String scenarioDescription;
    private List<String> optionsToChooseFrom;
}
