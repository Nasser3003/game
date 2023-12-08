package com.game.characters;

public class CharacterWarrior extends AbstractCharacter {
    public CharacterWarrior(String name) {
        super(name, 3000, 2500, 500, 1);
        this.setCharacterDescription("A battle-hardened warrior, clad in formidable armor," +
                " exudes strength and experience, their gaze reflecting the scars of countless conflicts.");
    }

}
