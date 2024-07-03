package com.devgame.rockapperscissor.game.player;

import com.devgame.rockapperscissor.exception.InvalidChoiceException;
import com.devgame.rockapperscissor.game.choice.Choice;

public abstract class Player {
    private java.lang.String name;
    protected Choice choice;

    public Player(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public Choice getChoice() {
        return this.choice;
    }

    public abstract Choice makeChoice() throws InvalidChoiceException;
}
