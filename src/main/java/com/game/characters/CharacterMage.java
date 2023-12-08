package com.game.characters;


public class CharacterMage extends AbstractCharacter {
    public CharacterMage(String name) {
        super(name, 500, 2500, 3000, 1);
        this.setCharacterDescription("The mystic figure, adorned in shimmering robes," +
                " emanates an aura of arcane power, their eyes aglow with the secrets of the universe.");
    }
}
