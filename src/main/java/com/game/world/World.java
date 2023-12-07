package com.game.world;

import com.game.world.scenarios.AbstractScenarios;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class World {
    private AbstractScenarios currScene;
    private Map<Long, AbstractScenarios> scenarios = new HashMap<>();

    public void addScene(AbstractScenarios scenario) {
        if (currScene == null)
            currScene = scenario;
        this.scenarios.put(scenario.getId(), scenario);
    }

    public AbstractScenarios getSceneByKey(long sceneKey) {
        return this.scenarios.get(sceneKey);
    }
}
