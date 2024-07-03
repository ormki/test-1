package com.devgame.rockapperscissor.game.player;

import com.devgame.rockapperscissor.exception.InvalidChoiceException;
import com.devgame.rockapperscissor.game.choice.ChoiceType;
import com.devgame.rockapperscissor.game.choice.Choice;
import com.devgame.rockapperscissor.io.IOInteraction;

public class Human extends Player {
    private IOInteraction ioInteraction;
    public Human(java.lang.String name) {
        super(name);
    }

    public Human(java.lang.String name, IOInteraction ioInteraction) {
        super(name);
        this.ioInteraction = ioInteraction;
    }
    @Override
    public Choice makeChoice() throws InvalidChoiceException {
        this.ioInteraction.print("Enter one of the choice - Rock, Paper, Scissor.");
        java.lang.String userChoice = this.ioInteraction.getUserInput();
        this.ioInteraction.print(String.format("The player-name(%s) selected: %s", this.getName(), userChoice));
        this.choice = getChoice(userChoice);
        return this.choice;
    }

    public Choice getChoice(java.lang.String input) throws InvalidChoiceException {
        try {
            return ChoiceType.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidChoiceException(String.format("It's invalid choice, please try again.", input));
        }
    }
}
