package com.game.characters;

import com.game.scenarios.AbstractScenarios;
import lombok.Data;

@Data
public abstract class AbstractCharacter {
    private AbstractScenarios scenario;
    private String name;
    private int strength;
    private int wisdom;
    private int magic;
    private int expLevel;
    private String characterDescription;
    private int healthPoints = 100;

    public AbstractCharacter(String name, int strength, int wisdom, int magic, int expLevel) {
        this.name = name;
        this.strength = strength;
        this.wisdom = wisdom;
        this.magic = magic;
        this.expLevel = expLevel;
    }
}
