package com.game.world;

import com.game.world.scenarios.AbstractScene;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class World {
    private AbstractScene currScene;
    private Map<Long, AbstractScene> scenarios = new HashMap<>();

    public void addScene(AbstractScene scenario) {
        if (currScene == null)
            currScene = scenario;
        this.scenarios.put(scenario.getId(), scenario);
    }

    public AbstractScene getSceneByKey(long sceneKey) {
        return this.scenarios.get(sceneKey);
    }
}
