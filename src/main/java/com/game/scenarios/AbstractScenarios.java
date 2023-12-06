package com.game.scenarios;

import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractScenarios {
    protected String scenarioDescription;
    protected List<String> optionsToChooseFrom;
}
