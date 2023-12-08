package com.game.characters;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
public abstract class AbstractCharacter implements Serializable {
    private String name;
    private int strength;
    private int wisdom;
    private int magic;
    private int expLevel;
    @ToString.Exclude
    private String characterDescription;
    private int healthPoints = 1000;

    public AbstractCharacter(String name, int strength, int wisdom, int magic, int expLevel) {
        this.name = name;
        this.strength = strength;
        this.wisdom = wisdom;
        this.magic = magic;
        this.expLevel = expLevel;
    }
}
