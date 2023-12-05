package com.game.characters;

import lombok.Data;
import lombok.ToString;

@Data
public abstract class AbstractCharacter {
    private String name;
    private int strength;
    private int wisdom;
    private int magic;
    private int expLevel;
    @ToString.Exclude
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
