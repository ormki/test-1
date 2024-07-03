package com.devgame.rockapperscissor.game.player;

import com.devgame.rockapperscissor.game.choice.ChoiceType;
import com.devgame.rockapperscissor.game.choice.Choice;
import com.devgame.rockapperscissor.io.IOInteraction;

import java.util.Random;

public class Computer extends Player {
    private IOInteraction ioInteraction;

    public Computer(java.lang.String name) {
        super(name);
    }
    public Computer(java.lang.String name, IOInteraction ioInteraction) {
        super(name);
        this.ioInteraction = ioInteraction; //todo::::passed this constrcutors (important : understand why this changes)
    }
    @Override
    public Choice makeChoice() {
        //todo:: [most imp] why it is not required to throw exception explore and understand
        ChoiceType[] choices = ChoiceType.values();
        int systemSelectedIndex = new Random().nextInt(choices.length);
        Choice systemSelectedChoice = choices[systemSelectedIndex];
        this.ioInteraction.print(String.format("The player-name(%s) selected : %s", this.getName(), systemSelectedChoice));
        this.choice = systemSelectedChoice;
        return systemSelectedChoice;
    }
}
